package freedomphones.userservice.business;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import freedomphones.userservice.data.UserDbClient;

@Service
public class Manager {
    @Autowired
    UserDbClient userDbClient;
    public ResponseEntity<?> getUser(String username) {
        return userDbClient.getUserData(username); 
    }
}