package dev.forkathon.kinshipshowcaselab.models;

public class CampusUser {
    private String id;
    private String displayName;
    private String department;
    private String batch;
    private int reputation;
    private boolean verified;

    public CampusUser(String id, String displayName, String department, String batch, int reputation, boolean verified) {
        this.id = id;
        this.displayName = displayName;
        this.department = department;
        this.batch = batch;
        this.reputation = reputation;
        this.verified = verified;
    }

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getDisplayName() { return displayName; }
    public void setDisplayName(String value) { this.displayName = value; }
    public String getDepartment() { return department; }
    public void setDepartment(String value) { this.department = value; }
    public String getBatch() { return batch; }
    public void setBatch(String value) { this.batch = value; }
    public int getReputation() { return reputation; }
    public void setReputation(int value) { this.reputation = value; }
    public boolean getVerified() { return verified; }
    public void setVerified(boolean value) { this.verified = value; }

    @Override public String toString() {
        return "CampusUser{" + "id=, displayName=, department=, batch=, reputation=, verified=" + "}";
    }
}
