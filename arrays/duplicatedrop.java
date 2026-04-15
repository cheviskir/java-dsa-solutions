class Solutions{
	public static int duplicatedrop(int [] nums){
		int slow = 0;
		for (int fast = 0;fast < nums.length;fast++ ) {
			if (nums[fast] != nums [slow]) {
				slow += 1;
				nums[slow] = nums[fast];
			}
		}
		return slow +1;
	}

	public static void main(String[] args) {
		int [] nums = {1,1,2,3,3,4,5,5};
		int result = duplicatedrop(nums);
		for (int i=0;i<result ;i++ ) {
			System.out.print(i + " ");
		}
	}
}