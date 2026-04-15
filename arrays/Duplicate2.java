class Solution{
	public static int duplicate(int[] nums){
		int slow = 0;
		for (int fast = 1;fast < nums.length ; fast++ ) {
			if (nums[fast] != nums[slow]) {
				slow++;
				nums[slow] = nums[fast];
			}
		}
		return slow + 1;
	}

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,2,2,3};
		int answer = duplicate(nums);
		for (int i = 0;i<answer ;i++ ) {
			System.out.print(nums[i]+ " ");
		}
	}
}