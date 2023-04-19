public class PrimitivosFloat {
    
    static float varFlotante = 3.1416f;
    public static void main(String[] args) {

        float realFloat = 3.4028235e38f;
        System.out.println("\nFLOAT = " + realFloat);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor máximo byte: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157e308;
        System.out.println("\nDOUBLE = " + realDouble);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor máximo byte: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Double.MIN_VALUE);

        // varFlotante = 3.1416;
        System.out.println("\nVAR = " + varFlotante);
    }
}
