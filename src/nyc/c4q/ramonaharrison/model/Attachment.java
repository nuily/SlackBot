package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    // TODO: implement private fields for each of the following attachment JSON keys:
    // could be null (no keys) so check for it

    private String fallback;
    private String color;
    private String pretext;
    private String authorName;
    private String authorLink;
    private String authorIcon;
    private String title;
    private String titleLink;
    private String text;
    private List<Field> fields;
    private String imageUrl;
    private String thumbUrl;
    private String footer;
    private String footerIcon;
    private Long ts;

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json

        if (json.containsKey("fallback")) {
            this.fallback = (String) json.get("fallback");
        }

        if (json.containsKey("color")) {
            this.color = (String) json.get("color");
        }

        if (json.containsKey("pretext")) {
            this.pretext = (String) json.get("pretext");
        }

        if (json.containsKey("author_name")) {
            this.authorName = (String) json.get("author_name");
        }

        if (json.containsKey("author_link")) {
            this.authorLink = (String) json.get("author_link");
        }

        if (json.containsKey("author_icon")) {
            this.authorIcon = (String) json.get("author_icon");
        }

        if (json.containsKey("title")) {
            this.title = (String) json.get("title");
        }

        if (json.containsKey("title_link")) {
            this.titleLink = (String) json.get("title_link");
        }

        if (json.containsKey("text")) {
            this.text = (String) json.get("text");
        }

        if (json.containsKey("fields")) {
            JSONArray jsonFields = (JSONArray) json.get("fields");
            this.fields = new ArrayList<Field>();
            for(int i = 0; i < jsonFields.size(); i++) {
                Field field = new Field((JSONObject)jsonFields.get(i));
                this.fields.add(field);

            }
        }

        if (json.containsKey("image_url")) {
            this.imageUrl = (String) json.get("image_url");
        }

        if (json.containsKey("thumb_url")) {
            this.thumbUrl = (String) json.get("thumb_url");
        }

        if (json.containsKey("footer")) {
            this.footer = (String) json.get("footer");
        }

        if (json.containsKey("footer")) {
            this.footerIcon = (String) json.get("footer");
        }

        if (json.containsKey("ts")) {
            this.ts = (Long) json.get("ts");
        }

    }

    // TODO add getters to access private fields


    public String getFallback() {
        return fallback;
    }

    public String getColor() {
        return color;
    }

    public String getPretext() {
        return pretext;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public String getText() {
        return text;
    }

    public List<Field> getFields() {
        return fields;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public String getFooter() {
        return footer;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public Long getTs() {
        return ts;

        // will have to alternate back between String and Long
    }
}
