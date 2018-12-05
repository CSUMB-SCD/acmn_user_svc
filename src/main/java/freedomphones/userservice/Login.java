package freedomphones.userservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Login{
    private ResponseEntity<?> status;

    public Login(){}

    public void loginSuccess(){
        this.status = new ResponseEntity<>(HttpStatus.NO_CONTENT); 
    }
    public void loginFailed() {
        this.status =  new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    public ResponseEntity<?> getStatus(){
        return this.status;
    }
}