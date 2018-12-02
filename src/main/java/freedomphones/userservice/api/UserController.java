package freedomphones.userservice.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.userservice.business.Manager;

@RestController
public class UserController{
    @Autowired
    Manager manager;
    @GetMapping("/getUser/{username}")
    @ResponseBody
    public String getUser(@PathVariable String username){
        return manager.getUser(username);
    }
}