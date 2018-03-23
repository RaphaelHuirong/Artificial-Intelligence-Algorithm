/*
   Assumptions : 1. the input is a array, which contains tuples (id and value)
                 2. id is String
                 3. the range of the value between 0 - 1000 and all are integer
                 4. try to find all K smallest
                 5. each id is not a null


   Idea : I use a array with the length of 1001 to record the value of these tuples, scan these tuples , classify
          and store them in right position in array. using iterative way to get the result .
 */

import java.util.ArrayList;
import java.util.List;


public class FindKSmallest {
    public List<Tuple> findKSmallest (Tuple[] input, int k) {
        List<Tuple>[] helper = new ArrayList[1001];
        for (int i = 0; i < input.length; i++) {                   //scan the input into our helper array
            if (helper[input[i].value] == null) {
                helper[input[i].value] = new ArrayList<>();
            }
            helper[input[i].value].add(input[i]);
        }
        List<Tuple> result = new ArrayList<>();
        int i = 0;                                                 //index of the helper
        while (result.size() < k) {                                //get the all smallest
            if (helper[i] != null) {
                for (int j = 0; j < helper[i].size(); j++) {       //helper[i] is a ArrayList, we need to add the element one by one
                    result.add(helper[i].get(j));
                }
            }
            i++;
        }
        return result;
    }
}