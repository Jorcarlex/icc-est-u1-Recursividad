public class App {

    // ruta absoluta: C:/...
    // ruta relativa: /(en la carpeta donde estoy)
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        // int reusltado = rec.factorial(5);
        // System.out.println(reusltado);

        // System.out.println(rec.sumConsecutivos(15));
        // System.out.println(rec.potencial(3, 4));
        // System.out.println(rec.sumaDigitos(20));
        // System.out.println(rec.fibonacci(5));

        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("src/directorios");
    }
}
