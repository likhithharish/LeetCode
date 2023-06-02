class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        if(s.length()==1){ return map.get(s.charAt(0));}
        
        int number = 0;
        for( int i=0; i< s.length(); i++){
            if(i!=s.length()-1){
                if((s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')) ||
              (s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')) ||
              (s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))){
                number+= map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                    i++;
                }else{
                    number += map.get(s.charAt(i));
                }
            }else{
                if(s.charAt(i-1)!='I' || s.charAt(i-1)!='X' || s.charAt(i-1)!='C'){
                    number += map.get(s.charAt(i));
                }else{
                    number += map.get(s.charAt(i)) - 2*  map.get(s.charAt(i-1));
                }
            }
        }
        return number;
    }
}