package project.udacity.example.com.projecttwomovie.model;

import org.json.JSONException;
import org.json.JSONObject;


public class Review {

    private String author;
    private String id;
    private String content;

    public Review() {

    }

    public Review(JSONObject trailer) throws JSONException {
        this.author = trailer.getString("author");
        this.id = trailer.getString("id");
        this.content = trailer.getString("content");
    }

    public String getContent() { return content; }

    public String getId() { return id; }

    public String getAuthor() { return author; }

}
