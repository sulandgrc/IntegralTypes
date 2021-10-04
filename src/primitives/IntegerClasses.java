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
        assignBinary();

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

        // 64 bit in a long
        long longOne = 0b0101_1111_0101_1110_0000_0000_0000_0101_0101_1111_0101_1110_0000_0000_0000_0101L;
        System.out.println("Long Decimal Value: " + longOne);

        // how many bits are in a Long?
        System.out.println("Num bits in Long: " + Long.SIZE);
        System.out.println("Long Min: " + Long.MIN_VALUE);
        System.out.println("Long Max: " + Long.MAX_VALUE);

    }

    public static void assignHex(){

    }
}
