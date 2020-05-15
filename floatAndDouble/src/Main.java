public class Main {
    public static void main(String[] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        float f = (float) 5.25;
        double d = 5.25;

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatVale = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        int pounds = 200;
        double kilograms = 0.45359237;

        double pTok = pounds * kilograms;
        System.out.println("Pounds to Kilograms = " + pTok);

        double pi = 3.1415927d;
        double anothernumber = 3_000_000d; // same as 3000000
        

    }
}
