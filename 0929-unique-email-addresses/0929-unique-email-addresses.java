class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> set = new HashSet<>();
        for(String e: emails){
            String local = e.substring(0,e.indexOf("@"));
            if(local.contains("+")){
                local = local.substring(0,local.indexOf("+"));
            }
            local = local.replace(".","");
            String domain = e.substring(e.indexOf("@"));
            String email = local + domain ;
            set.add(email);
        }
        return set.size();
    }
    
    
}