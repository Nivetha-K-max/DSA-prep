package com.rideallocation;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        //prime
        System.out.println(isPrime(17));

        int[] num={11,2,4,55,77,8,19,6};
        int c=0;
        for(int i=0;i<num.length;i++){
            if(isPrime(num[i])) {
                c++;
            }
        }
        System.out.println(c);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


//print prime 1 to n

package com.rideallocation;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        //print prime 1 to n
        int n=100;
        for(int i=2;i<=n;i++){
            boolean isprime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i+" ");
            }
        }

    }

}


public class Main {
    static void main() {
        int n=68;
        if(!isPrime(n)){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
    public static boolean isPrime(int n){
        if(n<1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

}


public class Main {
    static void main() {
        int n = 20;
        int res=isPrime(n);
        System.out.println(res);

    }
    private static int isPrime(int n){
        if(n<1){
            return 0;
        }
        int factors=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                factors++;
                System.out.println(i+" ");
            }
        }
        return factors;
    }


