class Solution{

	public static int [] rotate(int[] nums, int key){
		int index = 0;
		int [] rotated = new int[nums.length];
		for (int i = 0; i<nums.length; i++ ) {
			index = (i + key) % nums.length;
			rotated[index] = nums[i];
		}
		return rotated;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int key = 3;
		int []result = rotate(nums, key);
		for (int i : result ) {
			System.out.print(i + " ");
		}
	}
}