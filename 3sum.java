class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      
       Arrays.sort(nums);
       List<List<Integer>> arr = new ArrayList<>();
       
        
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> ans = Arrays.asList(nums[i], nums[left], nums[right]);
                    if(!arr.contains(ans)){
                       arr.add(ans);
                    }
                    left++;
                    right--;

                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }

        }
       return arr;
        }
        
 }      
