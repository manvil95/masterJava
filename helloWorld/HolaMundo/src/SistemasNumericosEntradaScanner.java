import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        //String numeroStr = sc.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = sc.nextInt();
            //numeroDecimal = Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
        //catch (NumberFormatException e){
            System.out.println("Error debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        /*String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero:");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }*/

        System.out.println("numeroDecimal = " + numeroDecimal);

        String msgBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        int numeroBinario = 0b111110100; // Añadiendo 0b delante, lo interpreta como entero.

        String msgOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String msgHex = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        // OUTPUT: 1f4 como string.
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = msgBinario;
        mensaje += "\n" + msgOctal;
        mensaje += "\n" + msgHex;

        System.out.println(mensaje);
    }
}
