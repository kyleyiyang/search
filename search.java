class Solution {
    public int search(int[] nums, int target) {
        return recur(nums,target,0,nums.length-1);
        
    }
    public static int recur(int[] nums, int t, int l, int r) {
        if (l==r) {
            if (nums[l]==t) return l;
        }
        if (l<r) {
            //System.out.println("l="+l+"; r="+r);
            int m = (int) Math.floor((r-l)/2)+l;
            if (nums[m]==t) return m;
            else if (nums[m]<t) return recur(nums,t,m+1,r);
            else return recur(nums,t,l,m);
        }
        return -1;
    } 
}
