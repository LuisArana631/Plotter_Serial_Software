// ** Derived from information provided on the web by Dr. Kenneth G. Schweller,
// ** ( http://web.bvu.edu/faculty/schweller/ ) and his Mars Rover project page.

public class pPort
{
   ioPort pp;                   // wrapper class for 'Jnpout32.dll'
                               // with methods:
                               //    int Out32(int port, int value);
                               //    int Inp32(int port);
   short portAddress;            // address of data port
   short currentVal;             // current value of port bits

   public pPort()
   {
	  pp = new ioPort();
	  portAddress = (short)0x378;     // Hex Address of Data Byte of PC Parallel Port
	  setAllDataBits((short)0);       // initialize port bits to 0
	  currentVal = 0x00;
   }

   // wrap ParallelPort output method
   public void output(short port, short value)
   {
	  pp.Out32(port, value);
   }

   // wrap ParallelPort input method
   public short input(short port)
   {
 	  return pp.Inp32(port);
   }

    // output to default Data port
    public void output(short value)
    {
 	  pp.Out32(portAddress, value);
    }

    // input from default Data port
    public short input()
    {
  	  return pp.Inp32(portAddress);
    }


  /**
   * set all bits on Data port to zero
   **/
   public void setAllDataBits(short value)
   {
	  pp.Out32(portAddress, value);
	  currentVal = value;
   }


   // For users who prefer dealing with Pin numbers
   //    Set Pin <pin> to <value>
   public void setPin(short pin, short value)
   {
	  if (pin >= 2 && pin <= 9)
	     // just set the corresponding Data bit to indicted value
         setDataBit((short)(pin-2), value);
   }


   /**
    * Set Data Bit at selected index to a value of 1 or 0
    * while preserving current values of all other Data bits
    **/
   void setDataBit(short index, short value)
   {
      switch(index)
      {
         case 0:
           if (value==0)                        //  Set Data[0] to 0

			  currentVal = (short) (currentVal & 0xFE);
                                                       //      aaaa aaaa  currentVal
			                                    //  AND 1111 1110  mask
			                                    //      =========
			                                    //      aaaa aaa0  new currentVal

		   else                                 //  Set Data[0] to 1

			  currentVal = (short) (currentVal | 0x01);
                                                        //      aaaa aaaa   currentVal
			                                    //  OR  0000 0001   mask
			                                    //      =========
			                                    //      aaaa aaa1   new currentVal
	       break;
         case 1:
           if (value==0)
			  currentVal = (short) (currentVal & 0xFD);
                                                        //  currentVal = aaaa aa0a
		   else
			  currentVal = (short) (currentVal | 0x02);
                                                        //  currentVal = aaaa aa1a
	       break;
         case 2:
           if (value==0)
			  currentVal = (short) (currentVal & 0xFB);
                                                        //  currentVal = aaaa a0aa
		   else
			  currentVal = (short) (currentVal | 0x04);
                                                        //  currentVal = aaaa a1aa
	       break;
         case 3:
           if (value==1)
			  currentVal = (short) (currentVal & 0xF7);
                                                        //  currentVal = aaaa 0aaa
		   else
			  currentVal = (short) (currentVal | 0x08);   //  currentVal = aaaa 1aaa
	       break;
         case 4:
           if (value==0)
			  currentVal = (short) (currentVal & 0xEF);
                                                        //  currentVal = aaa0 aaaa
		   else
			  currentVal = (short) (currentVal | 0x10);   //  currentVal = aaa1 aaaa
	       break;
         case 5:
           if (value==0)
			  currentVal = (short) (currentVal & 0xDF);
                                                        //  currentVal = aa0a aaaa
		   else
			  currentVal = (short) (currentVal | 0x20);   //  currentVal = aa1a aaaa
	       break;
         case 6:
           if (value==0)
			  currentVal = (short) (currentVal & 0xBF);
                                                        //  currentVal = a0aa aaaa
		   else
			  currentVal = (short) (currentVal | 0x40);   //  currentVal = a1aa aaaa
	       break;
	         case 7:
           if (value==0)
			  currentVal = (short) (currentVal &  0x7F);
                                                        //  currentVal = 0aaa aaaa
		   else
			  currentVal = (short) (currentVal | 0x80);   //  currentVal = 1aaa aaaa
	       break;

	     default:
		   System.out.println("index must be 0 - 7");
      }
      pp.Out32(portAddress, currentVal);
   }

    void setPin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

