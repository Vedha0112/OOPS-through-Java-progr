class PrimeFibonacci {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void generateAndDisplayFibonacci(int limit) {
        int a = 0, b = 1;
        while (a < limit) {
            if (isPrime(a)) {
                System.out.println(a);
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int limit = 100000;
        System.out.println("Prime Fibonacci numbers below " + limit + ":");
        generateAndDisplayFibonacci(limit);
    }
}
