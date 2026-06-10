// product of array except it self
public class Main {
    static void main() {
        int[] nums={2,4,6,5,7,8};
        int[] res=new int[nums.length];
        int sum;
        for(int i=0;i<nums.length;i++){
            sum=1;
            for(int j=0;j<nums.length;j++){
                if(i == j){
                    continue;
                }
                else{
                    sum*=nums[j];
                }

            }
            res[i]=sum;
        }
        System.out.println(Arrays.toString(res));
    }

}


public class Main {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int l = 0, r = arr.length - 1;
        while (l < r) {

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class Main {
    static void main() {

        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int r=arr1.length-1;
        int csum = 0, aaum = (r * (r + 1)) / 2;

        for (int i = 0; i < arr1.length; i++) {
            csum += arr1[i];
        }

        System.out.println(csum - aaum);
    }
}







