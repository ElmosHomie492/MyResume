package models;

public class VolunteerWork {
    private String organization;
    private String description;
    private String startDate;
    private String endDate;

    public VolunteerWork() {}

    public VolunteerWork(String organization, String description, String startDate, String endDate) {
        this.organization = organization;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "VolunteerWork{" +
                "organization='" + organization + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
