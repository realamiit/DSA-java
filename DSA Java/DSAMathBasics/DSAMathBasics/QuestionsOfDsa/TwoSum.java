package QuestionsOfDSA;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
            
    Map<Integer,Integer> map= new HashMap <>();
    
    for(int i=0; i<nums.length; i++){
        int complement =target-nums[i];
        if(map . containsKey(complement)){
            return new int[] {map.get(complement),i};
        }
        else{
            map.put(nums[i],i);
        }       
    }
    throw new IllegalArgumentException("no match");

    //     hashMap<integer,integer>hm= new hashMap<integer,integer>();
    //     for(int i=0;i<nums.length;i++){
    //         int req_num=target_nums[i];
    //         if(hm.containKey(req_nums)){
    //             int[]arr={hm.get(req_num),i};
    //             return arr;
    //         }
    //         hm.put(nums[i],i);
    //     }
    //     return null;
    // BRUTE fORCE Algo

    // for ()
    }

}
