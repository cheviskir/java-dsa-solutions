class Solution{
	public static int occurence(int[]nums, int target){
		int occurence = 0;
		for(int i:nums){
			if (target == i) {
				occurence+=1;
			}
		}
		return occurence;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,1,4,1,2};
		int results = occurence(nums, 1);
		System.out.print(results);
	}
}