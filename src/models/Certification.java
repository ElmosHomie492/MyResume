package models;

public class Certification {
    private String title;
    private String description;
    private String institution;
    private String dateOfCompletion;

    public Certification() {}

    public Certification(String title, String description, String institution, String dateOfCompletion) {
        this.title = title;
        this.description = description;
        this.institution = institution;
        this.dateOfCompletion = dateOfCompletion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(String dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }
}
