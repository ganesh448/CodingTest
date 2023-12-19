package codingTest;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,5,1,2,};
		 // Count the frequency of each element in the array
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		// Print duplicate elements
		System.out.println("Duplicat Elements in the array: ");
		for(int num: array)
		{
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);// TODO Auto-generated method stub
		}
		for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
