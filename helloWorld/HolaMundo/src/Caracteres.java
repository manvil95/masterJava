public class Caracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        System.out.println("\nCHAR = " + caracter);
        System.out.println("Tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("Valor máximo byte: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo byte: " + Character.MIN_VALUE);


        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("Decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Prueba de borrado de los puntos : con un char:" + retroceso + ", lo ves?");

    }
}
