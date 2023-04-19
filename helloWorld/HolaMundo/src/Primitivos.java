public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("\nBYTE = " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("\nSHORT = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo byte: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("\nINTEGER = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo byte: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("\nLONG = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo byte: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Long.MIN_VALUE);

        var numeroVar = 34124132L; // Por defecto siempre es integer.
    }
}
