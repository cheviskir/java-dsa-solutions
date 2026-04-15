class Solutions{
	public static int[] removeElement(int [] nums, int val){
		int counter = 0;
		for (int i : nums ) {
			if (val != i) {
				counter+=1;
			}
		}
		int [] reversed = new int [counter];
		int index = 0;
		for(int j:nums){
			if (j != val) {
				reversed[index] = j;
				index +=1;
			}
		}
		return reversed;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,4};
		int val = 1;
		int [] answer = removeElement(nums, val);
		for (int i : answer) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(answer.length);
	}
}