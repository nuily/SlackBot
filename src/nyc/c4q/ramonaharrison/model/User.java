package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:

    private String id;
    private static String name;
    private boolean deleted;
    private String color;
    private boolean isAdmin;
    private boolean isOwner;
    private boolean isPrimaryOwner;
    private boolean isRestricted;
    private boolean isUltraRestricted;
    private boolean has2Fa;
    private String twoFactorType;
    private boolean hasFiles;

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json

        if (json.containsKey("id")) {
            this.id = (String) json.get("id");
        }

        if (json.containsKey("name")) {
            this.name = (String) json.get("name");
        }

        if (json.containsKey("deleted")) {
            this.deleted = (Boolean) json.get("deleted");
        }

        if (json.containsKey("color")) {
            this.color = (String) json.get("color");
        }

        if (json.containsKey("profile")) {
            JSONObject profile = (JSONObject) json.get("profile");
            String firstName = (String) profile.get("first_name");
            String lastName = (String) profile.get("last_name");
            String realName = (String) profile.get("real_name");
            String email = (String) profile.get("email");
            // found the profile object
            // get methods and variables all stored in profile class
            // how to access that?

        }

        if (json.containsKey("is_admin")) {
            this.isAdmin = (Boolean) json.get("is_admin");
        }

        if (json.containsKey("is_owner")) {
            this.isOwner = (Boolean) json.get("is_owner");
        }
        if (json.containsKey("is_primary_owner")) {
            this.isPrimaryOwner = (Boolean) json.get("is_primary_owner");
        }

        if (json.containsKey("is_restricted")) {
            this.isRestricted = (Boolean) json.get("is_restricted");

        }
        if (json.containsKey("is_ultra_restricted")) {
            this.isUltraRestricted = (Boolean) json.get("is_ultra_restricted");
        }

        if (json.containsKey("has_2fa")) {
            this.has2Fa = (Boolean) json.get("has_2fa");
        }

        if (json.containsKey("two_factor_type")) {
            this.twoFactorType = (String) json.get("two_factor_type");
        }

        if (json.containsKey("has_files")) {
            this.hasFiles = (Boolean) json.get("has_files");
        }


    }

    // TODO add getters to access private fields


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public boolean isDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public boolean isUltraRestricted() {
        return isUltraRestricted;
    }

    public boolean isHas2Fa() {
        return has2Fa;
    }

    public String getTwoFactorType() {
        return twoFactorType;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }
}
