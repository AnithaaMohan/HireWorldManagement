package com.ideas2it.enumeration;

    public enum Qualification  {
        BE(1),
        BTech(2),
        BCA(3),
        BSC(4),
        ME(5),
        MTech(6),
        MCA(7),
        MSC(8),
        OTHERS(9);

    final int value;

   Qualification(final int value) {
       this.value = value;
   }
   /**
    * Get the choice from the user and return the enum constant based on user choice.
    *
    * @param choice  the user choice to get the enum constant 
    * @return        enum constant                       
    */

   public static String getQualification (int value) {
       String result = null;
           
       for (Qualification Qualification : Qualification.values()) {
           if(Qualification.value == value) {
               result = Qualification.toString();
            }
       }
       return result;
   }
}




    
   
