package models;

import java.util.ArrayList;
import java.util.List;

public class WorkExperience {
    private String company;
    private String title;
    private String location;
    private String startDate;
    private String endDate;
    private List<String> accomplishments;

    public WorkExperience() {}

    public WorkExperience(String company, String title, String location, String startDate, String endDate) {
        this.company = company;
        this.title = title;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public List<String> getAccomplishments() {
        return accomplishments;
    }

    public void addAccomplishment(String accomplishment) {
        if (this.accomplishments == null) {
            this.accomplishments = new ArrayList<>();
        }
        this.accomplishments.add(accomplishment);
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", accomplishments=" + accomplishments +
                '}';
    }
}
