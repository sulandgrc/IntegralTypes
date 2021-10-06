package primitives;

/**
 * This class demos the integral data types available in Java and how to assign
 * binary(0b) and hex(0x) values to the data types as well as access the constants defined in the
 * various Integral Classes.
 *
 * author: Susan Uland
 *
 */
public class IntegerClasses {

    public static void main(String[] args) {
        // assignBinary();
        // assignHex();

        // check our answers
        int num = 0b0010_0001;
        System.out.println("Decimal Value: " + num);
        System.out.println("Binary Value: " + Integer.toBinaryString(num));

        System.out.println();
        int num2 = 0x1A;
        System.out.println("Decimal value: " + num2);
        System.out.println("Binary Value: " + Integer.toBinaryString(num2));

    }

    public static void assignBinary(){
        // integral types
        // byte holds 8 bits
        byte byteOne = 0b0101_1111;
        System.out.println("Byte Decimal Value: " + byteOne);

        // 16 bits in a short
        short shortOne = 0b0111_0000_1111_1010;
        System.out.println("Short Decimal Value: " + shortOne);
        System.out.println();

        // 32 bits in an int
        int intOne = 0b0101_1111_0101_1110_0000_0000_0000_0101;
        System.out.println("Integer Decimal Value: " + intOne);
        System.out.println();

        // 64 bits in a long
        long longOne = 0b0101_1111_0101_1110_0000_0000_0000_0101_0101_1111_0101_1110_0000_0000_0000_0101L;
        System.out.println("Long Decimal Value: " + longOne);

        // how many bits are in a Long?
        System.out.println("Num bits in Long: " + Long.SIZE);

        // what is the smallest value a Long can hold?
        System.out.println("Long Min: " + Long.MIN_VALUE);

        // what is the largest value a Long can hold?
        System.out.println("Long Max: " + Long.MAX_VALUE);

    }

    public static void assignHex(){
        // integral types
        // byte holds 8 bits
        // declare a byte and assigned a hex value
        byte byteOne = 0x2A;
        // (2 x 16 ^ 1) + (10  x 16 ^ 0) = 42
        System.out.println("Decimal Value :" + byteOne);

        // int, long have a toBinaryString() static method in their classes
        // declare a short and assign a hex value to it
        short num = 0x2FFF;
        // (2 x 16 ^ 3) + (15 x 16 ^ 2) + (15 x 16 ^ 1) + (15 x 16 ^ 0) = 12,287
        // print out the decimal value
        System.out.println("Decimal Value: " + num);

        // 32 bits every 4 bits represents one hex digit (0 - F)
        int num2 = 0x206A_FFFF;
        System.out.println("Binary Value: " + Integer.toBinaryString(num2));
        System.out.println("Decimal Value: " + num2);

    }
}
