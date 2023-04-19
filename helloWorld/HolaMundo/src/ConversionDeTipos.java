public class ConversionDeTipos {
    public static void main(String[] args) {

        String strExample = "50";
        int numeroInt = Integer.parseInt(strExample);
        System.out.println("numeroInt = " + numeroInt);

        strExample = "8765.43e-3";
        double realDouble = Double.parseDouble(strExample);
        System.out.println("realDouble = " + realDouble);

        strExample = "true";
        boolean logicoBoolean = Boolean.parseBoolean(strExample);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNum = 100;
        System.out.println("otroNum = " + otroNum);
        strExample = Integer.toString(otroNum);
        System.out.println("strExample = " + strExample);

        strExample = String.valueOf(otroNum + 10);
        System.out.println("strExample = " + strExample);

        int i = 32768;
        System.out.println("i = " + i);
        short s = (short)i; // Casting
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
