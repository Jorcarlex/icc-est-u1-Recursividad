public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // Caso base: n sea 0! y 1! son iguales a 1
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        // si un if tiena un return no es necesasrio un else
        // return n* factorial(n-1);

        int resultado = n * factorial(n - 1);
        System.out.println("Resultado parcial para " + n + " factorial (" + (n - 1) + ") = " + resultado);
        return resultado;
    }

    // Calcular la suma de los numeros consecutivos
    // n = 5 resultado = 5+4+3+2+1 = 15
    public int sumConsecutivos(int n) {

        if (n == 1) {
            return 1;
        }

        return n + factorial(n - 1);
    }

    // Calcula la potencia de un numero

    public int potencial(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        return base * potencial(base, exponente - 1);
    }

    // Crear un metdodo que sume los digitos de un numero
    // Si mando 123 sea igual a 6
    // 1+2+3 = 6
    // usar el %mod
    public int sumaDigitos(int n) {
        // caso base
        if (n < 10) {
            return n;
        }
        return n % 10 + sumaDigitos(n / 10);
        
    }

}
