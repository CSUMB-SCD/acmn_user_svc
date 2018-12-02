package freedomphones.userservice.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class UserDbClient {
    public String getUserData(String username){
        final String uri = "https://freedomphones-zuul-svc.herokuapp.com/user-service/userExist/{username}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<String, String>();
        params.put("username", username);
        return restTemplate.getForObject(uri, String.class, params);
    }
}