class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int n1 = -1,n2 = -1,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(n1==nums[i]){
                c1++;
            }else if(n2==nums[i]){
                c2++;
            }else if(c1==0){
                n1 = nums[i];
                c1 = 1;
            }
            else if(c2==0){
                n2 = nums[i];
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        c1 = c2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == n1){
                c1++;
            }
            if(nums[i] == n2){
                c2++;
            }
        }
        if(c1 > n/3){
            res.add(n1);
        }
        if(c2 > n/3){
            res.add(n2);
        }

        return res;
    }
}

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]

*/
