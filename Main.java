package three_sum;

public class Main {
	public static void threeSum(int[] nums) {
		int n = nums.length;
		bubbleSort(nums);
		
		for(int i = 0; i < n - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			int left = i + 1;
			int right = n - 1;
			
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				
				if (sum == 0) {
					System.out.println(nums[i] + " + " + nums[left] + " + " + nums[right] + " = 0");
					left++;
					right--;
					
					while (left < right && nums[left] == nums[left - 1]) left++;
					while (left < right && nums[right] == nums[right + 1]) right--;
				} else if (sum < 0) {
					left++;
				} else {
					right --;
				}
			}
		}

	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean changed;

		for (int i = 0; i < n - 1; i++) {
			changed = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed) break;
		}
	}

	public static void main(String[] args){
		if (args.length == 0) {
			return;
		}
		
		int[] nums = new int[args.length];
		try {
			for (int i = 0; i < args.length; i++) {
				nums[i] = Integer.parseInt(args[i]);
			}
		} catch (NumberFormatException e) {
			return;
		}
		
		threeSum(nums);
	}

}
