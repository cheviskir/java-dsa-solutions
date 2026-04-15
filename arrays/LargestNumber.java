class Solution{
	public static int largest(int[] nums){
		int counter = nums[0];

		for (int i : nums) {
			if (i > counter) {
				counter = i;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int [] nums = {3, 7, 1, 9, 4, 6};
		int results = largest(nums);
		System.out.println(results);
	}
}