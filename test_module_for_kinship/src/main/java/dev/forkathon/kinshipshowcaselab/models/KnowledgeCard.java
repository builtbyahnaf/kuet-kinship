package dev.forkathon.kinshipshowcaselab.models;

public class KnowledgeCard {
    private String id;
    private String title;
    private String summary;
    private String category;
    private String author;
    private long timestamp;
    private double trustScore;

    public KnowledgeCard(String id, String title, String summary, String category, String author, long timestamp, double trustScore) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.category = category;
        this.author = author;
        this.timestamp = timestamp;
        this.trustScore = trustScore;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
    public String getSummary() { return summary; }
    public void setSummary(String value) { this.summary = value; }
    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }
    public String getAuthor() { return author; }
    public void setAuthor(String value) { this.author = value; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }
    public double getTrustScore() { return trustScore; }
    public void setTrustScore(double value) { this.trustScore = value; }

    @Override public String toString() {
        return "KnowledgeCard{" + "id=, title=, summary=, category=, author=, timestamp=, trustScore=" + "}";
    }
}
