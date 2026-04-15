class Solution{
	public static boolean issorted(int [] nums){
		boolean sorted = false;
		for (int i = 0;i <nums.length-1 ;i++ ) {
			for(int j = i +1; j <nums.length; j++){
				if (nums[i] > nums[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		boolean answer = issorted(nums);
		System.out.println(answer);
	}
}