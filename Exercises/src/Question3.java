import java.util.Arrays;

public class Question3 {
    public static void main(String[] args){
      int[] nums = {10,5,20,25,29,27,22,12,8};
      for(int a=0; a< nums.length-1;a++){
          for(int b=0; b< nums.length-1-a;b++){
              if(nums[b]>nums[b+1]){
                 int temp = nums[b];
                 nums[b] = nums[b+1];
                 nums[b+1] = temp;
              }
          }
          System.out.println(Arrays.toString(nums));
      }
    }
}
