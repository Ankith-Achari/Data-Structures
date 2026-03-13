import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int[][] nums = {
                {23,35,89,100},
                {13,10,18,34,56},
                {19,91,87}
        };
        int ans = min(nums);
        System.out.println(ans);

    }
    static int min(int[][] nums){
        int min = Integer.MAX_VALUE;
        for(int[] num:nums){
            for(int element : num){
                if(element<min){
                    min=element;
                }
            }
        }
        return min;
    }
}

