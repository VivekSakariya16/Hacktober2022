#Added Find Missing Positive `#416`
https://github.com/anjali1102/Hacktober2022/pull/416#issue-1412086625

VivekSakariya16:vivek
find the smallest missing positive integer.
class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)) return i;
        }
        return nums.length + 1;
    }
}
