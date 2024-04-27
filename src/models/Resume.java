package models;

import java.util.ArrayList;
import java.util.List;

public class Resume {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String email;
    private String phone;
    private String linkedInProfile;
    private List<WorkExperience> workExperiences;
    private List<Certification> certifications;
    private List<VolunteerWork> volunteerWork;
    private List<Skill> skills;

    public Resume(){}
    public Resume(String firstName, String lastName, String jobTitle, String email, String phone, String linkedInProfile) {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkedInProfile() {
        return linkedInProfile;
    }

    public void setLinkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void addWorkExperience(WorkExperience workExperience) {
        if (workExperiences == null) {
            workExperiences = new ArrayList<>();
        }
        this.workExperiences.add(workExperience);
    }

    public List<Certification> getCertifications() {
        return certifications;
    }

    public void addCertification(Certification certification) {
        if (certifications == null) {
            certifications = new ArrayList<>();
        }
        this.certifications.add(certification);
    }

    public List<VolunteerWork> getVolunteerWork() {
        return volunteerWork;
    }

    public void addVolunteerWork(VolunteerWork volunteerWork) {
        if (this.volunteerWork == null) {
            this.volunteerWork = new ArrayList<>();
        }
        this.volunteerWork.add(volunteerWork);
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", linkedInProfile='" + linkedInProfile + '\'' +
                ", workExperiences=" + workExperiences +
                ", certifications=" + certifications +
                ", volunteerWork=" + volunteerWork +
                ", skills=" + skills +
                '}';
    }
}
