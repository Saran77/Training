class Solution {
    public int majorityElement(int[] nums) {
        int v=nums[0];
        int vc=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==v){
                vc++;
            }else{
                vc--;
            }
            if(vc==0){
                v=nums[i];
                vc=1;
            }
        }
        return v;
    }
}

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/
