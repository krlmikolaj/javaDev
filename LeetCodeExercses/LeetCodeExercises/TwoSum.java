import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] solutionArray = new int[2];
        boolean foundPair = false;
        for (int i = 0; i < nums.length && !foundPair; i++) {
            for (int j = 1; j < nums.length && !foundPair; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    solutionArray[0] = i;
                    solutionArray[1] = j;
                    foundPair = true;
                    System.out.println(Arrays.toString(solutionArray));
                    break;
                }
            }
        }
        return solutionArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 5, 11};
        int target = 10;
//        System.out.println(twoSum(array, target));
        twoSum(array, target);
    }
}

