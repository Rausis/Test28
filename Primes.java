public class Primes {
    public Primes() {
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Primes p = new Primes();
        System.out.println(p.isPrime(7));
        System.out.println(p.isPrime(10));
        System.out.println(p.isPrime(1));





    }
}
