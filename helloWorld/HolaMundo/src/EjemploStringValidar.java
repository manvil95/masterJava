public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(!esNulo){
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero!"));
            System.out.println("Bienvenidos al curso ".concat(curso));
        }

        System.out.println("Bienvenido al curso " + curso);

        if(esNulo){
            curso = " ";
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero!"));
        }

        boolean esVacio = curso.length() == 0;

        if(!esVacio){
            System.out.println(curso.toUpperCase());
        }

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

    }
}
