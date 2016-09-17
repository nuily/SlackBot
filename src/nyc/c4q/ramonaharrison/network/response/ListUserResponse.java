package nyc.c4q.ramonaharrison.network.response;

import nyc.c4q.ramonaharrison.model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huilin on 9/17/16.*/


public class ListUserResponse extends Response{
    private String name;
    private String id;
    private String firstName;
    private String lastName;
    private String realName;
//    private JSONObject profile;

//    private List<User> Profile = new ArrayList<User>();


    public ListUserResponse(JSONObject json) {
        super(json);

        if (json.containsKey("user")) {
            json = (JSONObject) json.get("user");
            if (json.containsKey("id")) {
                this.id = (String) json.get("id");
            }

            if (json.containsKey("name")) {
                this.name = (String) json.get("name");
            }

//            if (json.containsKey("profile")) {
//                JSONObject profileObj = (JSONObject) json.get("profile");
//                JSONArray array = (JSONArray) profileObj.get("profile");
//                this.Profile = new ArrayList<User>();
//                for (int i = 0; i < array.size(); i++) {
//                    Profile.add(new User((JSONObject) array.get(i)));
//
////                this.profile = (JSONObject) json.get("profile");
////                this.firstName = (String) this.profile.get("first_name");
////                this.lastName = (String) this.profile.get("last_name");
////                this.realName = (String) this.profile.get("real_name");
//                }
        }
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRealName() {
        return realName;
    }

//    public JSONObject getProfile() {
//        return profile;
//    }


//    public List<User> getProfile() {
//        return Profile;
//    }

    public String getId() {
        return id;
    }
}



