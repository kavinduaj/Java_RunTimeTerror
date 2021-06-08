
 
package Model;


public class User {

    
    private String Username;
    private String password;
    
    public User (String username, String password)
    {
        this.password = password;
        this.Username = username;
    }
    
    public String getUsername ()
    {
        return Username;
    }
    public String getpassword ()
    {
        return password;
    }
    public void setPassword(String pass)
   {
       this.password=pass;
   }
    public void setUserName(String username)
   {
       this.Username=username;
   }
}
