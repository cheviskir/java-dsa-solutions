class Solutions{
	public static int[] merge(int[]nums1, int[] nums2){
		int size = nums1.length + nums2.length;
		int [] combnums = new int [size];
		int index = 0;
		int i = 0, j = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2 [j]) {
				combnums[index] = nums1[i];
				index +=1;
				i++;
			}else{
				combnums[index] = nums2[j];
				index+=1;
				j++;
			}
		}
		while (i < nums1.length) { 
    		combnums[index] = nums1[i]; 
    		i++; 
    		index++; 
		}
		while (j < nums2.length) { 
    		combnums[index] = nums2[j]; 
    		j++; 
    		index++; 
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