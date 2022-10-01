import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonConverter {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public JsonConverter(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;

    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Популярные факты о котиках" +
                "\n id = " + id +
                "\n title = " + text +
                "\n type = " + type +
                "\n user = " + user +
                "\n upvotes = " + upvotes;
    }
}
