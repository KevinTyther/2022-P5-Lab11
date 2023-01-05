// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int i = 2; i < primes.length; i++)
        {
            primes[i] = true;

        }
        for(int z = 2;z < primes.length; z++)
        {
            for (int i = z * 2; i < primes.length; i += z) {
                primes[i] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        for (int i = 2; i < primes.length;i++)
        {
            if (primes[i] == true)
            {

                System.out.print(i + ", ");


            }
        }
    }

}



