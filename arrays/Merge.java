class Solutions{
	public static int[] merge(int[]nums1, int[] nums2){
		int size = nums1.length + nums2.length;
		int [] combnums = new int [size];
		int index = 0;
		for(int i = 0; i < nums1.length; i++){
			for(int j=0; j < nums2.length; j++){
				if(nums1[i] < nums2[j]){
					combnums[index] = nums1[i];
					index+=1;
				}if(nums2[j] < nums1[i]){
					combnums[index] = nums2[j];
					index +=1;
				}
			}
		}
		return combnums;
	}

	public static void main(String[] args) {
		int [] nums1 = {1,3,5,7};
		int [] nums2 = {2,4,6,8};
		int [] nums3 = merge(nums1, nums2);
		for (int i : nums3 ) {
			System.out.print(i + " ");
		}
	}
}