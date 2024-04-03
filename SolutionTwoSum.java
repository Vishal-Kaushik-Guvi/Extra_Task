import java.util.Scanner;

public class SolutionTwoSum {
   
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println("enter array of 5 nums");
        for(int i =0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        twoSum(nums, target);
     }
}