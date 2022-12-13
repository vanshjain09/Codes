public class permu {
    public static void permu(String pr , String Unpr){
        String first="",second="";
        if(Unpr.isEmpty()){
            System.out.println(pr);
            return;
        }
        char ch = Unpr.charAt(0);
        for(int i = 0 ;i<=pr.length();i++){
            first = pr.substring(0,i);
            second = pr.substring(i);
            permu(first+ch+second, Unpr.substring(1));
        }
        
    }
    public static void main(String[] args) {
        permu("", "abc");
    }
}
