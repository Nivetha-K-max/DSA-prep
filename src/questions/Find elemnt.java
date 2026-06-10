package com.rideallocation;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        int[] arr={2,1,5,3,8,4,7};
        int target=7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target);
            }
            System.out.println("Not found");
        }




        //by using map
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        if(map.containsValue(9)){
            System.out.println("Found");
        }
        else  System.out.println("Not found");
        System.out.println(map);





        //by using direct method
        int max = 100;
        boolean[] map1 = new boolean[max + 1];

        for (int num : arr) {
            map1[num] = true;
        }

        if (map1[target]) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }


}



// Find missing elemt


package com.rideallocation;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        int[] arr={2,1,5,3,8,4,7};
        int n = arr.length;

        //brute force o(n2)
        for (int i = 0; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(i);
            }
        }


        //brute force o(n)

        boolean[] seen = new boolean[n + 1];
        for (int num : arr) {
            seen[num] = true;
        }
        for (int i = 0; i <= n; i++) {
            if (!seen[i]) {
                System.out.println(i);
            }
        }

        // optimal approach

        int as=(n*(n+1))/2;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(as-sum);

    }

}