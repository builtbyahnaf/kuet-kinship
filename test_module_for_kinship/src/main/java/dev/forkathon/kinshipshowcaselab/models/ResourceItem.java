package dev.forkathon.kinshipshowcaselab.models;

public class ResourceItem {
    private String id;
    private String title;
    private String type;
    private String uri;
    private long sizeBytes;
    private String owner;

    public ResourceItem(String id, String title, String type, String uri, long sizeBytes, String owner) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.uri = uri;
        this.sizeBytes = sizeBytes;
        this.owner = owner;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
    public String getUri() { return uri; }
    public void setUri(String value) { this.uri = value; }
    public long getSizeBytes() { return sizeBytes; }
    public void setSizeBytes(long value) { this.sizeBytes = value; }
    public String getOwner() { return owner; }
    public void setOwner(String value) { this.owner = value; }

    @Override public String toString() {
        return "ResourceItem{" + "id=, title=, type=, uri=, sizeBytes=, owner=" + "}";
    }
}
