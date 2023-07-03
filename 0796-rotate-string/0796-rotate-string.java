class Solution {
    // Pattern search kind of problem, concatenate s with itself. if goal is a rotation of s, it should be present. 
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()){return false;}
        return (s+s).contains(goal);
    }
}