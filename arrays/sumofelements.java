class Solution{
	public static int sum(int[] nums){
		int sum = 0;
		for(int i:nums){
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int results = sum(nums);
		System.out.println(results);
	}
}