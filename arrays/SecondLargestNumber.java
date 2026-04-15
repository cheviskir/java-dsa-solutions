class Solution{
		public static int Secondlargest(int[] nums){
		int counter = nums[0];
		int Secondlarg = 0;

		for (int i : nums) {
			if (i > counter) {
				Secondlarg = counter;
				counter = i;
			}else if (i > Secondlarg && i != counter) {
				Secondlarg = i;
			}
		}
		return Secondlarg;
	}

	public static void main(String[] args) {
		int [] nums = {3, 7, 1, 9, 4, 6};
		int results = Secondlargest(nums);
		System.out.println(results);
	}
}