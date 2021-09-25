class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window method
        //Time complexity : O(2n) = O(n)O(2n)=O(n). Space complexity : O(min(m, n))
//         int[] chars = new int[128];

//         int left = 0;
//         int right = 0;

//         int res = 0;
//         while(right < s.length()){
//             char rightRead = s.charAt(right);
//             chars[rightRead]++;
//             while(chars[rightRead] > 1){
//                 char leftRead = s.charAt(left);
//                 chars[leftRead]--;
//                 left++;
//             }
//             res = Math.max(res, right - left + 1);
//             right ++;
//         }
//         return res;
        //Hashmap method
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length(), ans = 0;
        for(int i = 0, j = 0; j < n; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}