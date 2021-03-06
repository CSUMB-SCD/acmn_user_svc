package freedomphones.userservice.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import freedomphones.userservice.Login;
import freedomphones.userservice.users.User;


@Repository
public class UserDbClient {
    public ResponseEntity<?> getUserData(String username){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/user-db-service/getUser/{username}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", username);
        User user = restTemplate.getForObject(uri, User.class, params);
        Login login = new Login();
        if(user == null){
            login.loginFailed();
        }
        else{
            login.loginSuccess();
        }
        return login.getStatus();
    }
    public Double getFunds(String username){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/user-db-service/getFunds/{username}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", username);
        Double funds = restTemplate.getForObject(uri, Double.class, params);
        return funds;
    }
    public String removeFunds(String username, String amount){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/user-db-service/removeFunds/{username}/{amount}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", username);
        params.put("amount", amount);
        return restTemplate.getForObject(uri, String.class, params);
    }
}