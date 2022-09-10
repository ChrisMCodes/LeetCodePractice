class TwoSum {

/**
 * First, my solution
 */
     public int[] twoSum(int[] nums, int target) {
        int currentSum;
        int[] indices = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = i+1; j < nums.length; j++) {
                
                if ( (nums[i] + nums[j]) == target ) {
                    indices[0] = i;
                    indices[1] = j;
                    i = nums.length;
                    break;
                }
                
            }
        }
        return indices;
        
    }


  /**
   * Now, a better solution from https://www.youtube.com/watch?v=NP9nLwKzXGA 
   *
   * This solves in linear time
   *
   */
   
   
        public int[] twoSum(int[] nums, int target) {
          Map<Integer, Integer> map = new HashMap<>();
        
          for (int i = 0; i < nums.length; i++) {
              int diff = target - nums[i];
            
              if (map.containsKey(diff)) {
                  return new int[]{map.get(diff), i};
              }
              
              map.put(nums[i], i);
          }
        return null;
      }
  }
