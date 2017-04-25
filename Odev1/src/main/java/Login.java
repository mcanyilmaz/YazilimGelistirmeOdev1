/**
 * Created by Can on 23.4.2017.
 */
public class Login {

    String Username = "Mustafa";
    int Password = 12345;

    public boolean UsernamePassword(String Username, int Password){
        if(this.Username.equals(Username) && this.Password==Password){
            return true;
        }
        return false;
    }
}
