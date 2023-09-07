class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // int i=0;
        // int res =0;
        // for(int j=0; j<s.length() && i<s.length(); j++){
        //     map.put(s.charAt(j),j);
        //     if(map.size()> k){
        //         int index = Collections.min(map.values());
        //         map.remove(s.charAt(index));
        //         i = index +1;
        //     }
        //     res = Math.max(res, j-i+1);
        // }
        // return res;
        
        int[] arr = new int[256];
        char[] ch = s.toCharArray();
        int left=0,ans=0,count=0;
        for(int i=0;i<ch.length;i++){
            if (++arr[ch[i]]==1) count++;
            while(count>k) 
				if (--arr[ch[left++]]==0) count--;
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}