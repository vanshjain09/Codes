class Insta{
    private String password;
    public void setKey(String s){  // setter
        password=s;
    }
    void getKey(){ //getter
        System.out.println("Your password is: "+password);
    }
}

public class data_hiding {
public static void main(String[] args) {
// we can't directly access private methods or variables 
// so we use getters and setters
Insta i_am_vansh = new Insta();
i_am_vansh.setKey("Vansh@09");
i_am_vansh.getKey();
}
    
}