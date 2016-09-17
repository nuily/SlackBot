package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by huilin on 9/11/16.
 */
public class Profile {

    // TODO: implement private fields for each of the following user JSON keys:

    private String firstName;
    private String lastName;
    private String realName;
    private String email;
    private String skype;
    private String phone;
    private String image24;
    private String image32;
    private String image48;
    private String image72;
    private String image192;
    private String image512;

    public Profile(JSONObject json) {
        // TODO: parse profile from the incoming json

        if (json.containsKey("first_name")) {
            this.firstName = (String) json.get("first_name");
        }

        if (json.containsKey("last_name")) {
            this.lastName = (String) json.get("last_name");
        }
        if (json.containsKey("real_name")) {
            this.realName = (String) json.get("real_name");
        }

        if (json.containsKey("email")) {
            this.email = (String) json.get("email");
        }
        if (json.containsKey("skype")) {
            this.skype = (String) json.get("skype");
        }

        if (json.containsKey("phone")) {
            this.phone = (String) json.get("phone");
        }
        if (json.containsKey("image_24")) {
            this.image24 = (String) json.get("title");
        }

        if (json.containsKey("image_32")) {
            this.image32 = (String) json.get("image_32");
        }
        if (json.containsKey("image_48")) {
            this.image48 = (String) json.get("image_48");
        }
        if (json.containsKey("images_72")) {
            this.image72 = (String) json.get("image_72");
        }

        if (json.containsKey("image_192")) {
            this.image192 = (String) json.get("image_192");
        }
        if (json.containsKey("image_512")) {
            this.image512 = (String) json.get("image_512");
        }

    }

    // TODO add getters to access private

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage24() {
        return image24;
    }

    public String getImage32() {
        return image32;
    }

    public String getImage48() {
        return image48;
    }

    public String getImage72() {
        return image72;
    }

    public String getImage512() {
        return image512;
    }

    public String getImage192() {
        return image192;
    }
}

