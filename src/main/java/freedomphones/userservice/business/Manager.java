package freedomphones.userservice.business;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freedomphones.userservice.data.UserDbClient;

@Service
public class Manager {
    @Autowired
    UserDbClient userDbClient;
    public String getUser(String username) {
        return userDbClient.getUserData(username); 
    }
}