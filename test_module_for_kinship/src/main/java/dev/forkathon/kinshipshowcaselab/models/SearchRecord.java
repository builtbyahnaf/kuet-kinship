package dev.forkathon.kinshipshowcaselab.models;

public class SearchRecord {
    private String query;
    private int resultCount;
    private long timestamp;
    private String category;

    public SearchRecord(String query, int resultCount, long timestamp, String category) {
        this.query = query;
        this.resultCount = resultCount;
        this.timestamp = timestamp;
        this.category = category;
    }

    public String getQuery() { return query; }
    public void setQuery(String value) { this.query = value; }
    public int getResultCount() { return resultCount; }
    public void setResultCount(int value) { this.resultCount = value; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long value) { this.timestamp = value; }
    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }

    @Override public String toString() {
        return "SearchRecord{" + "query=, resultCount=, timestamp=, category=" + "}";
    }
}
