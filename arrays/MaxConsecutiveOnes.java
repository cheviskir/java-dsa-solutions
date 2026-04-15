class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int MaximumCounter = 0;

        for(int i : nums){
            if(i == 1){
                counter +=1;
                if (counter > MaximumCounter) {
                    MaximumCounter = counter;
                }
            }else{
                counter = 0;
            }
        }
        return MaximumCounter;   
    }     

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        //in a method, capture result first, which is the return type, we cannot use method.counter.
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

}