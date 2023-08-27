class Solution {
    // Intuition: Handle corner cases(4,9,40..) reduce the number from 1000 to 1, and append String that many times based on reminder.
    public String intToRoman(int num) {        
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        StringBuilder res = new StringBuilder();
        for(int i=0; i< arr.length; i++){
            int val = num / arr[i];
            if(val>0){
                num = num % arr[i];
            }
            while(val>0){
                res.append(getVal(arr[i]));
                val--;
            }
            
        }
        return res.toString();
    }
    
    public String getVal(int num){
        String res = "";
        switch(num){
            case 1:
                res ="I";
                break;
            case 5:
                res ="V";
                break;
            case 10:
                res ="X";
                break;
            case 50:
                res ="L";
                break;
            case 100:
                res ="C";
                break;
            case 500:
                res ="D";
                break;
            case 1000:
                res ="M";
                break;
            case 4:
                res ="IV";
                break;
            case 9:
                res ="IX";
                break;
            case 40:
                res ="XL";
                break;
            case 90:
                res ="XC";
                break;
            case 400:
                res ="CD";
                break;
            case 900:
                res ="CM";
                break;
            default:
                res ="";
        }
        return res;
    }
    
    
}