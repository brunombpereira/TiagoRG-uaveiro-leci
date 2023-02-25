package aula03;

import utils.UserInput;
import java.util.Scanner;

// Solução do exercício 1

public class PrimesSum {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.println("Introduza um número:");
        int n = (int) UserInput.getPositiveNumber(sin);

        int sum = 0;
        for (int i = 0; i <= n; i++)
            if (isNumPrime(i))
                sum += i;

        System.out.printf("A soma dos números primos até %d é %d", n, sum);

        sin.close();
    }

    private static boolean isNumPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
