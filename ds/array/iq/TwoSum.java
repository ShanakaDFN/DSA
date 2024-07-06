package ds.array.iq;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int a = twoSum(nums, target)[0];
        int b = twoSum(nums, target)[1];
        System.out.println("[" + a + "," + b + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = i + 1;
        boolean flag = true;
        int[] output = new int[2];
        while (flag) {
            if (target - nums[i] == nums[j]) {
                output[0] = i;
                output[1] = j;
                flag = false;
            } else {
                if(j==nums.length-1){
                    if (i < nums.length-1) {
                        j=i+1;
                        i++;
                    }
                }
                if (j < nums.length-1) {
                    j++;
                }
            }
        }
        return output;
    }
}
