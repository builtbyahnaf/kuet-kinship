package dev.forkathon.kinshipshowcaselab.models;

public class TrustSnapshot {
    private String userId;
    private double score;
    private int confirmations;
    private int disputes;
    private long calculatedAt;

    public TrustSnapshot(String userId, double score, int confirmations, int disputes, long calculatedAt) {
        this.userId = userId;
        this.score = score;
        this.confirmations = confirmations;
        this.disputes = disputes;
        this.calculatedAt = calculatedAt;
    }

    public String getUserId() { return userId; }
    public void setUserId(String value) { this.userId = value; }
    public double getScore() { return score; }
    public void setScore(double value) { this.score = value; }
    public int getConfirmations() { return confirmations; }
    public void setConfirmations(int value) { this.confirmations = value; }
    public int getDisputes() { return disputes; }
    public void setDisputes(int value) { this.disputes = value; }
    public long getCalculatedAt() { return calculatedAt; }
    public void setCalculatedAt(long value) { this.calculatedAt = value; }

    @Override public String toString() {
        return "TrustSnapshot{" + "userId=, score=, confirmations=, disputes=, calculatedAt=" + "}";
    }
}
