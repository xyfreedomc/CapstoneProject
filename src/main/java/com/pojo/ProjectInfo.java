package com.pojo;

import java.util.Objects;

public class ProjectInfo {
    private String projectID;

    private String projectTitle;

    private String projectClient;

    private String contactInfo;

    private String projectDescription;

    private String projectSkills;

    private int projectNumber;

    private String projectType;

    private String projectStatus;

    public ProjectInfo() {
        
    }

    public ProjectInfo(String projectID, String projectTitle, String projectClient, String contactInfo,
                       String projectDescription, String projectSkills, int projectNumber, String projectType, String projectStatus) {
        this.projectID = projectID;
        this.projectTitle = projectTitle;
        this.projectClient = projectClient;
        this.contactInfo = contactInfo;
        this.projectDescription = projectDescription;
        this.projectSkills = projectSkills;
        this.projectNumber = projectNumber;
        this.projectType = projectType;
        this.projectStatus = projectStatus;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectClient() {
        return projectClient;
    }

    public void setProjectClient(String projectClient) {
        this.projectClient = projectClient;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectSkills() {
        return projectSkills;
    }

    public void setProjectSkills(String projectSkills) {
        this.projectSkills = projectSkills;
    }

    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectInfo that = (ProjectInfo) o;
        return projectNumber == that.projectNumber && Objects.equals(projectID, that.projectID) && Objects.equals(projectTitle, that.projectTitle) && Objects.equals(projectClient, that.projectClient) && Objects.equals(contactInfo, that.contactInfo) && Objects.equals(projectDescription, that.projectDescription) && Objects.equals(projectSkills, that.projectSkills) && Objects.equals(projectType, that.projectType) && Objects.equals(projectStatus, that.projectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, projectTitle, projectClient, contactInfo, projectDescription, projectSkills, projectNumber, projectType, projectStatus);
    }
}
