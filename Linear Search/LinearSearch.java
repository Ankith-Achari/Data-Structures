import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("********LINEAR SEARCH************");
        System.out.print("Enter the siz of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        int ans = linearSearch(arr,target);

        System.out.print("Element found at the index: "+ans);


    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index< arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
