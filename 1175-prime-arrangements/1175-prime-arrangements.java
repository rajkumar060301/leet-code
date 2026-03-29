class Solution {
    private static final int M = 1_000_000_000 + 7;
    private static final int S = 100;
    
    private static int[] primeCnt;
    private static long[] fact;
    
    static {
        primeCnt = new int[S + 1];
        //primeCnt[i] -> returns how many prime numbers are there in between [1, i]
        fact = new long[S + 1];
        //fact[i] -> returns i! under modulo M
        fact[0] = 1;
        
        for(int i = 1; i <= S; i += 1) {
            primeCnt[i] = primeCnt[i - 1] + isPrime(i);
            fact[i] = (fact[i - 1] % M * i % M) % M;
        }
        System.out.println(Arrays.toString(fact));
    
    }
    
    private static int isPrime(int num) {
        if(num == 1) return 0;
        for(int i = 2; i * i <= num; i += 1) if(num % i == 0) return 0;
        return 1;
    }
    
    public int numPrimeArrangements(int n) {
        int prime_cnt = primeCnt[n];
        int non_prime_cnt = n - prime_cnt;
        return (int)((fact[prime_cnt] % M * fact[non_prime_cnt] % M) % M);
    }
}