import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(temp, (a, b) -> 
            Integer.bitCount(a) == Integer.bitCount(b) 
            ? a - b 
            : Integer.bitCount(a) - Integer.bitCount(b)
        );
        
        return Arrays.stream(temp).mapToInt(i -> i).toArray();
    }
}