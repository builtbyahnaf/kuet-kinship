package dev.forkathon.kinshipshowcaselab.models;

public class ActivityEvent {
    private String id;
    private String actor;
    private String action;
    private String target;
    private long timestamp;

    public ActivityEvent(String id, String actor, String action, String target, long timestamp) {
        this.id = id;
        this.actor = actor;
        this.action = action;
        this.target = target;
        this.timestamp = timestamp;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getActor() { return actor; }
    public void setActor(String value) { this.actor = value; }
    public String getAction() { return action; }
    public void setAction(String value) { this.action = value; }
    public String getTarget() { return target; }
    public void setTarget(String value) { this.target = value; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }

    @Override public String toString() {
        return "ActivityEvent{" + "id=, actor=, action=, target=, timestamp=" + "}";
    }
}
