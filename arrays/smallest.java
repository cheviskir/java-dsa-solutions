class Solution{
	public static int smallest(int [] nums){
		int small = nums[0];
		for (int i :nums ) {
			if (i < small) {
				small = i;
			}
		}
		return small;
	}

	public static void main(String[] args) {
		int [] nums = {5,4,3,2,1};
		int result = smallest(nums);
		System.out.print(result);
	}
}