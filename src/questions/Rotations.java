//left and right rotation

public class Main {
    static void main() {
        int[] arr = {1,3,5,7,4,8,2,6};
        int n = 3;
        n=n%arr.length;
        //Right rotation

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);
        System.out.println("Right rotation :"+Arrays.toString(arr));
        //left rotation
        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println("Left rotation :"+Arrays.toString(arr));


    }

    private static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
// rotate by 1 elemnt we can use right and leftshift also
//this is by loop
//by using loop right

public class Main {
    static void main() {


        //by using loop right
        int[] a={1,2,3,4,5};
        int last=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=last;
        System.out.println("using for : "+Arrays.toString(a));
        //by using loop left
        int[] a2={1,2,3,4,5};
        int first=a2[0];
        for(int i=0;i<a2.length-1;i++){
            a2[i]=a2[i+1];
        }
        a2[a2.length-1]=first;
        System.out.println("using for : "+Arrays.toString(a2));
    }

}