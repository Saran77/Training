class Solution {
    public void sortColors(int[] nums) {
        int ai=0,c=0,cc=0,c3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }else if(nums[i]==1){
                cc++;
            }
        }
        for(int i=0;i<c;i++){
            nums[i]=0;
        }
        for(int i=c;i<c+cc;i++){
            nums[i]=1;
        }
        for(int i=c+cc;i<nums.length;i++){
            nums[i]=2;
        }

    }
}

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

*/
