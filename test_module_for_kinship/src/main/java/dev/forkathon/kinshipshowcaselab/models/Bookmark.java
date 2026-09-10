package dev.forkathon.kinshipshowcaselab.models;

public class Bookmark {
    private String id;
    private String targetId;
    private String targetType;
    private long createdAt;

    public Bookmark(String id, String targetId, String targetType, long createdAt) {
        this.id = id;
        this.targetId = targetId;
        this.targetType = targetType;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getTargetId() { return targetId; }
    public void setTargetId(String value) { this.targetId = value; }
    public String getTargetType() { return targetType; }
    public void setTargetType(String value) { this.targetType = value; }
    public long getCreatedAt() { return createdAt; }
    public void setCreatedAt(long value) { this.createdAt = value; }

    @Override public String toString() {
        return "Bookmark{" + "id=, targetId=, targetType=, createdAt=" + "}";
    }
}
