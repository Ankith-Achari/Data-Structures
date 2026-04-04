
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class BinarySearchAlgo{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target: ");
        int tar = scanner.nextInt();

        int ans = BinarySearch(arr,tar);
        System.out.print(ans);


    }
    static int BinarySearch(int[] arr,int tar){
        Arrays.sort(arr);
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(tar<arr[mid]){
                end=mid-1;
            }
            else if(tar>arr[mid]){
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}
