package dev.forkathon.kinshipshowcaselab.models;

public class NotificationItem {
    private String id;
    private String title;
    private String body;
    private String type;
    private long timestamp;
    private boolean read;

    public NotificationItem(String id, String title, String body, String type, long timestamp, boolean read) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.type = type;
        this.timestamp = timestamp;
        this.read = read;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
    public String getBody() { return body; }
    public void setBody(String value) { this.body = value; }
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }
    public boolean getRead() { return read; }
    public void setRead(boolean value) { this.read = value; }

    @Override public String toString() {
        return "NotificationItem{" + "id=, title=, body=, type=, timestamp=, read=" + "}";
    }
}
