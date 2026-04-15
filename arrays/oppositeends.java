class Solutions{

	public static int [] oppositeends(int[] nums, int target){
		int fast = 0;
		int slow = nums.length -1;

		while (fast < slow) {
			int sum = nums[fast] + nums[slow];
			if (sum == target) {
				return new int[]{fast, slow};
			} else if (sum > target) {
				slow--;
			}else{
				fast++;
			}
		}
		return new int[]{};
	}

	public static void main(String[] args) {
		int [] nums = {1,3,4,6,8,9,10};
		int target = 17;
		int[] result = oppositeends(nums, target);
		System.out.print("[" + result[0] + "," + result[1]+"]");
	}
}