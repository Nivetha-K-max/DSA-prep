package com.rideallocation;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        int[] arr={1,4,2,5,3,1,1,2,1,3,1,2,3};
        int n = arr.length;
        int c=0;int m=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            m=Math.max(m,c);
            System.out.println("the element "+arr[i]+" occurs "+c);

            c=0;
        }


        System.out.println("The max freq :"+m);


        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }int max=0,element=0;
        for(int i : map.keySet()){
            //System.out.println(i+" "+map.get(i));
            if(map.get(i)>max){
                max=map.get(i);
                element=i;
            }
        }
        System.out.println("Using HashMap");
        System.out.println("The max frequency is  "+max+"\n"+"The element is "+element );
        Find the First Non-Repeating Element
        Find the Element with Maximum Frequency
        Check if Two Arrays are Anagrams
    }

}