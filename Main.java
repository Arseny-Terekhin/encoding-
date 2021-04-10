package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("encode - 1, decode - 0");
            int start = in.nextInt();
            if (start == 1){
                System.out.println("input the prime numbers:p, q, e");
                int p = pnum();
                int q = pnum();
                int e = pnum();
                BigInteger p1 = BigInteger.valueOf(p);
                BigInteger q1 = BigInteger.valueOf(q);
                BigInteger e1 = BigInteger.valueOf(p);
                System.out.println("input the string to encode");
                in.nextLine();
                String str = in.nextLine();
                int cd[] = new int[str.length()];
                for(int i = 0; i < str.length(); i++ ){
                    String sim = str.substring(i, i + 1);
                    char[] chArray = sim.toCharArray();
                    int x1 = (int) chArray[0];
                    BigInteger x = BigInteger.valueOf(x1);
                    BigInteger n = BigInteger.valueOf(0);
                    n = p1.multiply(q1);
                    BigInteger c = BigInteger.valueOf(1);
                    for (int j = 0; j < e; j++){
                        c = c.multiply(x);
                    }
                    BigInteger f = BigInteger.valueOf(1);
                    BigInteger zero = BigInteger.valueOf(0);
                    f = c.mod(n);
                    double s = f.doubleValue();
                    int s1 = (int) s;
                    if(s == 0){
                        cd[i] = p * q;
                    }else{
                        cd[i] = s1;
                    }
                }
                for(int i = 0; i < cd.length; i++){
                    System.out.print(cd[i] + " ");
                }
                System.out.println("");
            }
            if (start == 0){
                System.out.println("input the prime numbers:p, q, e");
                int p = pnum();
                int q = pnum();
                int e = pnum();
                System.out.println("input code");
                in.nextLine();
                String str = in.nextLine();
                String[] cd = str.split(" ");
                String rcd = "";
                for (int i = 0; i < cd.length; i++){
                    int c = Integer.parseInt(cd[i]) ;
                    BigInteger c1 = BigInteger.valueOf(c);
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
                    for (int j = 0; j < d; j++){
                        st = st.multiply(c1);
                    }
                    st = st.mod(n);
                    double s = st.doubleValue();
                    int v = (int)s;
                    double n1 = n.doubleValue();
                    int n2 = (int) n1;
                    if (v == 0){
                        v = n2;
                    }
                    char simvol = (char)v ;
                    String sim1 = Character.toString(simvol);
                    rcd = rcd + sim1;
                }
                System.out.println(rcd);

            }
        }

    }
    public static int pnum(){
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        while (true){
            int k = 0;
            for (int i = 1; i <= z; i++){
                int v = z % i;
                if (v == 0){
                    k++;
                }
            }
            if (k > 2){
                System.out.println("input a prime number again ");
                z = in.nextInt();
            }
            else if (k == 2){
                int z1 = z;
                return z1;
            }
        }
    }
}
