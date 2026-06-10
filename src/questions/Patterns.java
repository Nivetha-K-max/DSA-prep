
public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
OUTPUT:
        *
        **
        ***
        ****
        *****



public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

OUTPUT:
        *****
        ****
        ***
        **
        *

public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
OUTPUT:
        1
        12
        123
        1234
        12345


public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
OUTPUT:
        1
        22
        333
        4444
        55555

public class Main {
    static void main() {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

}
OUTPUT:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15


public class Main {
    static void main() {
        int n=5;
        int k=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k-- + " ");
            }
            System.out.println();
        }
    }

}
OUTPUT:
        10
        9 8
        7 6 5
        4 3 2 1
        0 -1 -2 -3 -4

        package com.rideallocation;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        int n=4;
        // int k=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

OUTPUT:
           *
          ***
         *****
        *******

public class Main {
    static void main() {
        int n=11;
        for (int i = 1; i <= n; i++) {
            if (!isPrime(i)) {
                System.out.println("not prime : "+i);
            } else {
                System.out.println("prime : "+i);
            }
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

blic class Main {
    static void main() {
        int n=1451,r=0;
        int o=n;
        int d;
        while(n>0){
            d=n%10;
            n/=10;
            r=(r*10)+d;
        }
        if(o == r){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }

}

public class Main {
    static void main() {
        int n=153;
        int original =n;
        int temp=n;
        int sum =0;
        int d,dc=0;
        while(temp>0){
            dc++;
            temp/=10;
        }
        while(n>0){
            d = n%10;
            sum += (int)Math.pow(d,dc);
            n/=10;
        }
        System.out.println(sum);
        if(original == sum){
            System.out.println("its an anagaram");
        }
        else{
            System.out.println("not an anagram");
        }
    }

    public class Main {
        static void main() {
            int n=5;
            int ch;
            for(int i=1;i<=n;i++){
                ch=65;
                for(int j=1;j<=i;j++){
                    System.out.print((char)(ch-1+j));

                }
                ch++;
                System.out.println();
            }
        }
    }
    OUTPUT
            A
            AB
            ABC
            ABCD
            ABCDE

package com.rideallocation;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

    public class Main {
        static void main() {
            int n=5;
            char ch;
            for(int i=1;i<=n;i++){
                ch='A';
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }

                System.out.println();
            }
        }
    }
OUTPUT:
            A
            AB
            ABC
            ABCD
            ABCDE

    public class Main {
        static void main() {
            int n=5;
            int ch;
            for(int i=n;i>=1;i--){
                ch=65;
                for(int j=i;j<=n;j++){
                    System.out.print((char)('A'+j-1));
                }

                System.out.println();
            }
        }
    }

    OUTPUT:
             E
            DE
           CDE
          BCDE
         ABCDE
