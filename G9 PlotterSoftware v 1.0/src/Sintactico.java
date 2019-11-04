
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Sintactico {
    
    
    private ArrayList<Token> tokens;
    private Token tokenaux;
    private int token = -1;
    private JFrame frame;
    private int xtemp = 0;
    private int ytemp = 0;
    public Sintactico(ArrayList<Token> tokens, JFrame frame){
        this.tokens = tokens;
        this.frame = frame;
    }
    
    public void Analizar(){
        if(token<tokens.size()-1){
            tokenaux = NextToken();
            Inicio();
        }
    }
    
    public void Inicio(){
        if(tokenaux.getTk().equals("TK_LA")){ //VALIDAMOS QUE SEA LLAVE ABIERTA
            if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                tokenaux = NextToken();
                if(tokenaux.getTk().equals("TK_COMILLAS")){ //VALIDAMOS QUE SEAN COMILLAS
                    if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                        tokenaux = NextToken();
                        if(tokenaux.getTk().equals("TK_CS")){ //VALIDAMOS QUE SEA LA PALABRA RESERVADA "COORDENADAS"
                            if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                               tokenaux = NextToken(); 
                               if(tokenaux.getTk().equals("TK_COMILLAS")){ //VALIDAMOS QUE SEAN COMILLAS
                                   if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                      tokenaux = NextToken(); 
                                      if(tokenaux.getTk().equals("TK_DP")){ //VALIDAMOS QUE SEAN DOS PUNTOS
                                          if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                              tokenaux = NextToken();
                                              if(tokenaux.getTk().equals("TK_CA")){ //VALIDAMOS QUE SEA CORCHETE ABIERTO
                                                  if(token<tokens.size()-1){        //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                                      if(!tokens.get(token+1).getTk().equals("TK_CC")){ //VALIDAMOS SI VIENE AL MENOS UNA COORDENADA
                                                          tokenaux = NextToken();
                                                          Coordenada();
                                                          OtraCoordenada();
                                                      }                                                     
                                                          if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                                          tokenaux = NextToken();
                                                             if(tokenaux.getTk().equals("TK_CC")){ //VALIDAMOS SI ES CORCHETE CERRADO
                                                                if(token<tokens.size()-1){  //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                                                  tokenaux = NextToken(); 
                                                                  if(!tokenaux.getTk().equals("TK_LC") || token==tokens.size()){ //VALIDAMOS SI ES LLAVE CERRADA
                                                                      Lexico.error = true; 
                                                                  }
                                                          } else {
                                                             Lexico.error = true;   
                                                          }
                                                      } else {
                                                        Lexico.error = true;   
                                                      }
                                                      } else {
                                                       Lexico.error = true;      
                                                      }                                                     
                                                  }else {
                                                      Lexico.error = true;  
                                                  }
                                              }else {
                                                Lexico.error = true;  
                                              }
                                          }else {
                                             Lexico.error = true;   
                                          }
                                      }else {
                                       Lexico.error = true;    
                                      }
                                   }else {
                                    Lexico.error = true;     
                                   }                                   
                               }else {
                                Lexico.error = true;   
                               }
                            } else {
                               Lexico.error = true;   
                            }
                        } else {
                           Lexico.error = true;  
                        }
                    } else {
                      Lexico.error = true;    
                    }
                } else {
                   Lexico.error = true;  
                }
            }else {
              Lexico.error = true; 
            }            
        } else {
            Lexico.error = true;
        }
    }
    
    public void AgregarCoordenada(int x, int y){
        Init_Window.coordenadas.add(new Coordenada(x,y));
    }
    
    public void Coordenada(){
        if(tokenaux.getTk().equals("TK_LA")){ //VALIDAMOS QUE SEA LLAVE ABIERTA
            if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                tokenaux = NextToken();
                if(tokenaux.getTk().equals("TK_COMILLAS")){ //VALIDAMOS QUE SEAN COMILLAS
                   if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                       tokenaux = NextToken();
                       if(tokenaux.getTk().equals("TK_X")){ //VALIDAMOS QUE SEA UNA X
                           if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                             tokenaux = NextToken();
                             if(tokenaux.getTk().equals("TK_COMILLAS")){ //VALIDAMOS QUE SEAN COMILLAS
                                 if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKEN EN LA LISTA
                                     tokenaux = NextToken();
                                     if(tokenaux.getTk().equals("TK_DP")){ //VALIDAMOS QUE SEAN DOS PUNTOS
                                         if(token<tokens.size()-1){
                                             tokenaux = NextToken();
                                             if(tokenaux.getTk().equals("TK_NUMERO")){ //VALIDAMOS QUE SEA UN NÚMERO
                                                 xtemp = Integer.parseInt(tokenaux.getLexema());
                                                 if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                                   tokenaux = NextToken();
                                                   if(tokenaux.getTk().equals("TK_COMA")){ //VALIDAMOS QUE SEA UNA COMA
                                                       if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN MÁS TOKENS EN LA LISTA
                                                           tokenaux = NextToken();
                                                           if(tokenaux.getTk().equals("TK_COMILLAS")){ //VALIDAMOS QUE SEAN COMILLAS
                                                               if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN  MÁS TOKENS EN LA LISTA
                                                                tokenaux = NextToken();
                                                                if(tokenaux.getTk().equals("TK_Y")){ ///VALIDAMOS QUE SEA  UNA X
                                                                    if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN  MÁS TOKENS EN LA LISTA
                                                                     tokenaux = NextToken();
                                                                     if(tokenaux.getTk().equals("TK_COMILLAS")){ //VALIDAMOS QUE SEAN COMILLAS
                                                                         if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN  MÁS TOKENS EN LA LISTA
                                                                         tokenaux = NextToken();
                                                                            if(tokenaux.getTk().equals("TK_DP")){ //VALIDDAMOS QUE SEAN DOS PUNTOS
                                                                                if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN  MÁS TOKENS EN LA LISTA
                                                                                   tokenaux = NextToken();
                                                                                   if(tokenaux.getTk().equals("TK_NUMERO")){ //VALIDAMOS QUE SEA UN NUMERO
                                                                                       ytemp = Integer.parseInt(tokenaux.getLexema());
                                                                                       if(token<tokens.size()-1){ //VALIDAMOS QUE EXISTEN  MÁS TOKENS EN LA LISTA
                                                                                        tokenaux = NextToken();
                                                                                            if(tokenaux.getTk().equals("TK_LC")){ // VALIDAMOS QUE SEA UNA LLAVE CERRADA
                                                                                               if(xtemp<8 && ytemp < 16){
                                                                                                AgregarCoordenada(xtemp, ytemp); 
                                                                                               } else {
                                                                                                 Lexico.error = true;  
                                                                                               }
                                                                                            } else {
                                                                                               Lexico.error = true;   
                                                                                            }
                                                                                       }else {
                                                                                        Lexico.error = true;     
                                                                                       }                                                                                       
                                                                                   }else {
                                                                                       Lexico.error = true;  
                                                                                   }
                                                                                }else {
                                                                                 Lexico.error = true;    
                                                                                }                                                                               
                                                                            }else {
                                                                             Lexico.error = true;    
                                                                            }
                                                                         }else {
                                                                           Lexico.error = true;   
                                                                         }
                                                                     }else {
                                                                        Lexico.error = true;  
                                                                     }
                                                                    }else  {
                                                                     Lexico.error = true;     
                                                                    }                                                                  
                                                                }else {
                                                                 Lexico.error = true;    
                                                                }
                                                               }else {
                                                                Lexico.error = true;    
                                                               }
                                                           }else {
                                                            Lexico.error = true;   
                                                           }
                                                       }else {
                                                        Lexico.error = true;   
                                                       }
                                                   }else {
                                                     Lexico.error = true;   
                                                   }
                                                 }else {
                                                   Lexico.error = true;   
                                                 }
                                             }else {
                                               Lexico.error = true;  
                                             }
                                         }else {
                                           Lexico.error = true;   
                                         }
                                     }else {
                                     Lexico.error = true;    
                                     }
                                 }else {
                                   Lexico.error = true;    
                                 }
                             }else {
                                Lexico.error = true;   
                             }
                           }else {
                            Lexico.error = true;    
                           }
                       }else {
                          Lexico.error = true;  
                       }
                   } else {
                      Lexico.error = true; 
                   }
                }else {
                   Lexico.error = true;  
                }
            }else {
             Lexico.error = true;   
            }            
        }else {
          Lexico.error = true;  
        }
    }
    
    public void OtraCoordenada(){
        if(token<tokens.size()-1){
            tokenaux = NextToken();
            if(tokenaux.getTk().equals("TK_COMA")){
                if(token<tokens.size()-1){
                    tokenaux = NextToken();
                    Coordenada();
                    OtraCoordenada();
                }else {
                 Lexico.error = true;   
                }               
            } else {
                
                tokenaux = PreviousToken();
                
            } 
            
        }else {
            Lexico.error = true; 
        }       
    }
    
    
    public Token NextToken(){
        if(token<tokens.size()-1){
            token++;
             
            return tokens.get(token);
        } else {
            return null;
        }
    }
    
    public Token PreviousToken(){
          if (token < tokens.size() - 1)
            {
                token--;
                return tokens.get(token);
            }
            else
            {
                return null;
            }
    }
}
