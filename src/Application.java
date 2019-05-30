public class Application {

    public static void main(String[] args)   {
        System.out.println(booleanExpression(false,false,true ,true));

        System.out.println(leapYearCount(200));

        System.out.println(doubleExpression(1.00,2.00,3.00));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(flipBit(12, 3));
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (((a ^ b) && (c ^ d)) || ((a ^ c) && (b ^ d)));
    }

    public static int leapYearCount(int year) {

        return year / 4 + year / 400 - year / 100;
    }
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 1E-4;
    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
