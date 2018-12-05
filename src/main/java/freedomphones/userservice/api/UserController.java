package freedomphones.userservice.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.userservice.business.Manager;

@RestController
public class UserController{
    @Autowired
    Manager manager;
    @GetMapping(value = "/getUser/{username}")
    @ResponseBody
    public ResponseEntity<?> getUser(@PathVariable String username){
        return manager.getUser(username);
    }
}