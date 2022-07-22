package LoginForm;

import java.util.HashMap;

public class Info {
    HashMap<String, String> users = new HashMap<>();

    Info(){
        users.put("Khanhngoc2020", "khanhngoc2907");
        users.put("Tuandinh97", "ngoctuan21797");
        users.put("ngocnupe2222", "khanhngoc2907");
    }
    protected HashMap getUsers(){
        return users;
    }
}
