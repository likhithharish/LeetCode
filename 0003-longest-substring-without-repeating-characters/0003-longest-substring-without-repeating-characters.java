class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> str = new ArrayList<>();
        
        int result = 0;
        for( int i=0; i<s.length(); i++){
            // System.out.println("Start");
            // printList(str);

            if(str.contains(s.charAt(i))){
                //if character already exists, remove the previous character
                int index = str.indexOf(s.charAt(i));
                str.remove(index);
                // System.out.println("Removed");
                // printList(str);
                //remove all prev elem before this index case - abc (b)
                if( index> 0){
                    str.subList(0, index).clear();
                }
                //printList(str);
            }
            str.add(s.charAt(i)); // add the character
            // System.out.println("Added");
            // printList(str);
            result = Math.max( result, str.size());
        }
        
        return result;
    }
    
    // public static void printList(List<Character> list){
    //     for( char c : list){
    //         System.out.print(c+",");
    //     }
    //     System.out.println("\n");
    // }
}