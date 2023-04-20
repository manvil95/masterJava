public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... que tal!";

        Number num = Integer.valueOf(7); // 7;

        Boolean b1 = texto instanceof String; // true

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object; // true
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer; // false
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer; // true
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number; // true
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object; // true
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Long; // false
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double; // false
        System.out.println("num es del tipo Double = " + b1);

        Number decimal = Float.valueOf(45.54f);
        b1 = decimal instanceof Double; // false
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float; // true
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer; // false
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = decimal instanceof Number; // true
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean; // true
        System.out.println("b1 es del tipo Boolean = " + b1);

    }
}