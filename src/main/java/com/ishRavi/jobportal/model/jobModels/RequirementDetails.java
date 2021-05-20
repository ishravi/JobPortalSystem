package com.ishRavi.jobportal.model.jobModels;

public class RequirementDetails {
    private String  minExpecrience;
    private String  maxExperience;
    private String  minEducation;

    public RequirementDetails(String minExpecrience, String maxExperience, String minEducation) {
        this.minExpecrience = minExpecrience;
        this.maxExperience = maxExperience;
        this.minEducation = minEducation;
    }

    public String getMinExpecrience() {
        return minExpecrience;
    }

    public void setMinExpecrience(String minExpecrience) {
        this.minExpecrience = minExpecrience;
    }

    public String getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(String maxExperience) {
        this.maxExperience = maxExperience;
    }

    public String getMinEducation() {
        return minEducation;
    }

    public void setMinEducation(String minEducation) {
        this.minEducation = minEducation;
    }
}
