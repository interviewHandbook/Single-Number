package com.interviewPrep.leetcode.easy.singlenumber;

import java.util.HashMap;
import java.util.Map;

public class FirstApproach {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1};
		
		FirstApproach fa = new FirstApproach();
		fa.singleNumber(nums);

	}
	
	
	public int singleNumber(int[] nums) {
        
		int singleNum = nums[0];
		
		// initialize Hashmap
		Map<Integer, Boolean> numsCountMap = new HashMap<>();
		
		// Push given integers in it
		for(int i=0; i<nums.length; i++) {
			
			// if integer is pushed first time then keep value as true
			if(!numsCountMap.containsKey(nums[i])) {
				
				numsCountMap.put(nums[i], true);
			}
			// if integer already present then re-push with value false
			else if(numsCountMap.containsKey(nums[i])) {
				
				numsCountMap.put(nums[i], false);
			}
			
		}
		
		// iterate the array again and check against the Hashmap which integer has value as true
		for(int i=0; i<nums.length; i++) {
			
			if(numsCountMap.get(nums[i])) {
				
				return nums[i];
			}
		}
		
		return singleNum;
    }

}
