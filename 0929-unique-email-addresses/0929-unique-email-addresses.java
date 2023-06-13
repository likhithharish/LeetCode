class Solution {
    public int numUniqueEmails(String[] emails) {
        
        List<String> res = new ArrayList<>();
        for(String e: emails){
            String local = e.substring(0,e.indexOf("@"));
            if(local.contains("+")){
                local = local.substring(0,local.indexOf("+"));
            }
            local = local.replace(".","");
            String domain = e.substring(e.indexOf("@"));
            String email = local + domain ;
            if(!res.contains(email)){
                res.add(email);
            }
        }
        return res.size();
    }
    
    
}