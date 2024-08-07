import java.util.Arrays;

public class Question4 {
    public static void main(String[] args){
        int[] nums = {20,5,15,10,3,17,7};
        int a=1;
        while(a< nums.length){
            int temp = nums[a];
            int b = a-1;
            while(b>=0&&nums[b]>temp){
                nums[b+1] = nums[b];
                --b;
            }
            nums[b+1] = temp;
            a++;
            System.out.println(Arrays.toString(nums));
        }
    }
}
