public class Prime {
        public static void main(String[] args) {
        int Primes = 0;
        for (int i = 1; i < 1000; i++) {
            if (Prime.isPrime(i))
                Primes++;
        }

        System.out.println("The number of prime numbers less than 10000: " + Primes);
    }

    private static int isPrime(int i) {
        return 0;
    }
}