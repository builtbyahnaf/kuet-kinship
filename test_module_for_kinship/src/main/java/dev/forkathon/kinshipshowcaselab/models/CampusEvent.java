package dev.forkathon.kinshipshowcaselab.models;

public class CampusEvent {
    private String id;
    private String name;
    private String venue;
    private long startTime;
    private long endTime;
    private String category;

    public CampusEvent(String id, String name, String venue, long startTime, long endTime, String category) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.startTime = startTime;
        this.endTime = endTime;
        this.category = category;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
    public String getVenue() { return venue; }
    public void setVenue(String value) { this.venue = value; }
    public long getStartTime() { return startTime; }
    public void setStartTime(long value) { this.startTime = value; }
    public long getEndTime() { return endTime; }
    public void setEndTime(long value) { this.endTime = value; }
    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }

    @Override public String toString() {
        return "CampusEvent{" + "id=, name=, venue=, startTime=, endTime=, category=" + "}";
    }
}
