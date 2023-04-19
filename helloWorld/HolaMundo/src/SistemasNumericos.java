import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero:");

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

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

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
