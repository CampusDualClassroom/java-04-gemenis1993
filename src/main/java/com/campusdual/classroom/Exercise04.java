package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {


        //  -------------------------------------------------------------------------
        ///System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        // System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        // System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        //System.out.println("Obtén el factorial del número 7 → (7!): " +   (7 * 6 * 5 * 4 * 3 * 2 * 1)+ " = " + factorial(7) );
        // System.out.println("######################################################################");
        // System.out.println("Ejemplos de cálculos CON estructuras de control:");

       sumNum(0);
       sumEvenNum(0);
       factorial(7);
       recursiveFactorial(7);

    }

    public static int sumNum(int num) {
        int suma = 0;
        for (int vuelta = 1; vuelta <= 5; vuelta++) {
            num ++;
            suma+=num;
            System.out.println("Suma de los primeros 5 números: "+ (suma));
        }
        return 15;
    }

  public static int sumEvenNum(int num) {

        int suma = 0;
        for (int vuelta = 1; vuelta <= 20; vuelta++) {
            num = num + 2;
            suma=suma +num;
            System.out.println("Suma de los primeros 20 números pares: " + suma);
        }
        return 420;
    }

    public static int factorial(int num) {
            int i;
            int f = 1;
            for (i = 1; i <= num; i++) {
                f = f * i;
            }
            System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1) + " = " + (f));
            return f;
    }

    public static int recursiveFactorial(int num) {
        if (num > 0) {
            int valor = num * recursiveFactorial(num - 1);
            return valor;
        } else {
            return 1;
        }
    }

}




