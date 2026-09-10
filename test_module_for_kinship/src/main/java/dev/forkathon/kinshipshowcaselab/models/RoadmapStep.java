package dev.forkathon.kinshipshowcaselab.models;

public class RoadmapStep {
    private int order;
    private String title;
    private String detail;
    private boolean completed;
    private boolean optional;

    public RoadmapStep(int order, String title, String detail, boolean completed, boolean optional) {
        this.order = order;
        this.title = title;
        this.detail = detail;
        this.completed = completed;
        this.optional = optional;
    }

    public int getOrder() { return order; }
    public void setOrder(int value) { this.order = value; }
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
    public String getDetail() { return detail; }
    public void setDetail(String value) { this.detail = value; }
    public boolean getCompleted() { return completed; }
    public void setCompleted(boolean value) { this.completed = value; }
    public boolean getOptional() { return optional; }
    public void setOptional(boolean value) { this.optional = value; }

    @Override public String toString() {
        return "RoadmapStep{" + "order=, title=, detail=, completed=, optional=" + "}";
    }
}
