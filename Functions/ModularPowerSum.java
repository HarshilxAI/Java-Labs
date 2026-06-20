import java.util.Scanner;

public class ModularPowerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = sc.nextLong();
        long total = 0;
        for (int i=0; i<=n; i++) {
            
                        total = (total + modExp(n, i, p)) % p;
        }   
        sc.close();
        System.out.println(total);

    }

    private static long modExp(int n, int i, long p) {
        throw new UnsupportedOperationException("Unimplemented method 'modExp'");
    }
}
