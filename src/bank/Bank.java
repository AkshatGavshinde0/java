package bank;
   class Account{
    String name;           // default acess modifier
       protected String email; // pprotected acess modifiers
        private String password; // private acess modifiers

       // getter and setter

       public String getpassword(){
           return this.password;

       }
           public void setPassword(String pass){
            this .password=pass;

           }
}
 public class Bank
{
    public static void main(String args[]){        // public aacess modifiers
        Account account1= new Account();
        account1.name="apna account";
        account1.email="badakshatgavshinde@gmail.com";
        account1.setPassword("abcd");


        System.out.println(account1.getpassword());
    }


}

























































































