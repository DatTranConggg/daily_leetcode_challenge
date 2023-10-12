import java.util.*;


class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i],  map.getOrDefault(arr[i], 0) + 1);
        }

        for(var entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,2,1,1,3 };

        System.out.println( uniqueOccurrences(arr) );
    }
}