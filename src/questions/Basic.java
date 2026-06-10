import java.util.Arrays;

//first largest
public class Main {
    static void main() {
        int[] arr ={1,4,2,6,3,8,5};
        System.out.println(Arrays.toString(arr));
        //printing array in 4 methods
        //1️⃣Arrays.toString()
        //2️⃣ Arrays.deepToString() (2D arrays)
        //3️⃣ for loop
        //4️⃣ enhanced for loop

        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Using for loop : "+max);

        Arrays.sort(arr);
        System.out.println("Using sort : "+arr[arr.length-1]);
    }
}

//second largest
import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr ={1,4,2,6,3,8,5};
        System.out.println(Arrays.toString(arr));


        int fmax=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(fmax<arr[i]){
                smax=fmax;
                fmax=arr[i];
            }
            else if(smax<arr[i] && arr[i]!=fmax){
                smax=arr[i];
            }
        }
        System.out.println("Using for loop : "+smax);
        Arrays.sort(arr);
        System.out.println("Using sorting : "+arr[arr.length-2]);

    }
}


//array is sorted or not

package com.rideallocation;
import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr ={1,2,3,4,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                continue;
            }
            else if(arr[i-1]>arr[i]){
                System.out.println("Array is not sorted.");
                break;
            }
        }
        System.out.println("Array is sorted.");
    }
}


//Reverse the array
import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = {1,3,5,2,4,7,9,6};
        int j = 0;
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            res[j] = arr[i];
            j++;
        }
        System.out.println("Using iteration for loop : "+Arrays.toString(res));

        int first=0,last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;last--;
        }
        System.out.println("Using while without any dsa : "+Arrays.toString(arr));
    }
}


// remove duplicates from sorted array
package com.rideallocation;
import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = {1,1,2,2,3,3,3};
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(arr[k]!=arr[i]){
                k++;
                arr[k]=arr[i];
            }
        }
        System.out.println("The non repated numbers count is : "+(k+1));
    }
}


import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = {1,1,2,2,3,3,3};
        int[] res=new int[arr.length];
        int j=1;
        res[0]=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=res[j-1]){
                res[j]=arr[i];
                j++;
            }
        }
        System.out.println("first method with zeros :"+Arrays.toString(res));
        System.out.println("first method:"+Arrays.toString(Arrays.copyOf(res,j)));
        //without any data structure
        int k=1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[k-1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("2nd method :"+Arrays.toString(Arrays.copyOf(arr, k)));
    }
}
//rotate k postitons
package com.rideallocation;
import java.util.Arrays;

public class Main {
    static void main() {

        int[] arr = {1,4,2,5,6,7,3};
        int n = 3;

        int[] res = new int[arr.length];

        // copy last n elements
        int[] temp = Arrays.copyOfRange(arr, arr.length - n, arr.length);

        int j = 0;
        for(int i = 0; i < temp.length; i++){
            res[j++] = temp[i];
        }

        // copy remaining elements
        for(int i = 0; i < arr.length - n; i++){
            res[j++] = arr[i];
        }

        System.out.println("Method 1: " + Arrays.toString(res));

        int[] res2 = new int[arr.length];

        System.arraycopy(arr, arr.length - n, res2, 0, n);
        System.arraycopy(arr, 0, res2, n, arr.length - n);

        System.out.println("Method 2: " + Arrays.toString(res2));
    }
}
