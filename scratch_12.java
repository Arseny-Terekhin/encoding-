import java.math.BigInteger;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("encode - 1, decode - 0");
            int start = in.nextInt();
            if (start == 1){
                System.out.println("input the prime numbers:p, q, e");
                int p = in.nextInt();
                int q = in.nextInt();
                int e = in.nextInt();
                int k = 0;
                while (true){
                    k = 0;
                    for (int i = 1; i <= p; i++){
                        int v = p % i;
                        if (v == 0){
                            k++;
                        }
                    }
                    if (k == 2){
                        break;
                    }
                    if (k > 2){
                        System.out.println("input a prime number again p");
                        p = in.nextInt();
                    }
                }
                while (true) {
                    k = 0;
                    for (int i = 1; i <= q; i++) {
                        int v = q % i;
                        if (v == 0) {
                            k++;
                        }
                    }
                    if (k == 2) {
                        break;
                    }
                    if (k > 2) {
                        System.out.println("input a prime number again q");
                        q = in.nextInt();
                    }
                }
                while (true) {
                    k = 0;
                    for (int i = 1; i <= e; i++) {
                        int v = e % i;
                        if (v == 0) {
                            k++;
                        }
                    }
                    if (k == 2) {
                        break;
                    }
                    if (k > 2) {
                        System.out.println("input a prime number again e");
                        e = in.nextInt();
                    }
                }
                BigInteger p1 = BigInteger.valueOf(p);
                BigInteger q1 = BigInteger.valueOf(q);
                BigInteger e1 = BigInteger.valueOf(p);
                System.out.println("input the number to encode");
                BigInteger x = BigInteger.valueOf(in.nextInt());
                BigInteger n = BigInteger.valueOf(0);
                n = p1.multiply(q1);
                BigInteger c = BigInteger.valueOf(1);
                for (int i = 0; i < e; i++){
                    c = c.multiply(x);
                }
                BigInteger f = BigInteger.valueOf(1);
                BigInteger zero = BigInteger.valueOf(0);
                f = c.mod(n);
                double s = f.doubleValue();
                if(s == 0){
                    System.out.println("code:" + n);
                }else{
                    System.out.println("code:" + f);
                }
            }
            if (start == 0){
                System.out.println("input the prime numbers:p, q, e");
                int p = in.nextInt();
                int q = in.nextInt();
                int e = in.nextInt();
                int k = 0;
                System.out.println("input code");
                int c = in.nextInt();
                BigInteger c1 = BigInteger.valueOf(c);
                while (true){
                    k = 0;
                    for (int i = 1; i <= p; i++){
                        int v = p % i;
                        if (v == 0){
                            k++;
                        }
                    }
                    if (k == 2){
                        break;
                    }
                    if (k > 2){
                        System.out.println("input a prime number again p");
                        p = in.nextInt();
                    }
                }
                while (true) {
                    k = 0;
                    for (int i = 1; i <= q; i++) {
                        int v = q % i;
                        if (v == 0) {
                            k++;
                        }
                    }
                    if (k == 2) {
                        break;
                    }
                    if (k > 2) {
                        System.out.println("input a prime number again q");
                        q = in.nextInt();
                    }
                }
                while (true) {
                    k = 0;
                    for (int i = 1; i <= e; i++) {
                        int v = e % i;
                        if (v == 0) {
                            k++;
                        }
                    }
                    if (k == 2) {
                        break;
                    }
                    if (k > 2) {
                        System.out.println("input a prime number again e");
                        e = in.nextInt();
                    }
                }
                BigInteger p1 = BigInteger.valueOf(p);
                BigInteger q1 = BigInteger.valueOf(q);
                BigInteger e1 = BigInteger.valueOf(p);
                BigInteger n = BigInteger.valueOf(0);
                n = p1.multiply(q1);
                int mod = (p - 1) * (q - 1) + 1;
                int mod1 = (p - 1) * (q - 1);
                int d = 0;
                while (true){
                    if(mod % e == 0){
                        d = mod / e;
                        break;
                    }else{
                        mod += mod1;
                    }
                }
                BigInteger st = BigInteger.valueOf(1);
                for (int i = 0; i < d; i++){
                    st = st.multiply(c1);
                }
                st = st.mod(n);
                double s = st.doubleValue();
                if (s == 0){
                    System.out.println("number:" + n);
                }else{
                    System.out.println("number:" + st);
                }
            }
        }
    }
}