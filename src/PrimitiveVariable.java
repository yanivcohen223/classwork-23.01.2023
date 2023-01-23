public class PrimitiveVariable {

    public static void main(String[] args) {
        //ex1
        byte myByte = 31 ;
        short myShort = -27593 ;
        int myInt = 1965321489 ;
        float myFloat = -7.21f;
        double myDouble = 3.142d ;

        //ex2
        float myFloat1 = myByte;
        int myInt1 = (int) myDouble;

        System.out.println(myFloat1);
        System.out.println(myInt1);

        //ex3
        int myInt2 = int myDouble;
    }
}
