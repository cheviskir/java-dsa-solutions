class Solution{
	public static int [] twosum(int[] nums, int target){
		int [] value = new int[2];
		for (int i = 0; i<nums.length-1; i++ ) {
			for(int j = i + 1; j<nums.length; j++){
				if (nums[i] + nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		return value;
	}

	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 13;
		int [] output = twosum(nums, target);
		for(int i:output){
			System.out.print("["+i+"]" + ",");
		}
	}
}