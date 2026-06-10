

//move zeros to end  it takes time o(n2)
public class Main {
    static void main() {
        int[] arr={1,0,4,0,0,3,0,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++) {
                if (arr[j] == 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Zeros are moved to last : "+ Arrays.toString(arr));
    }
    private static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }

}



//move zeros to end  it takes time o(n)
public class Main {
    static void main() {
        int[] arr = {1, 0, 4, 0, 0, 3, 0, 7};
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;
        }
        System.out.println("Move zeors to end optimal : "+Arrays.toString(arr));

        // another two pointer method

        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }
            i++;
        }
    }

}