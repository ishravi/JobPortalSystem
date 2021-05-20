package com.ishRavi.jobportal.model.jobModels;

import java.util.List;

public class TechDetails {

    private String industry;
    private String function;
    private List<String>  skillList;

    public TechDetails(String industry, String function, List<String> skillList) {
        this.industry = industry;
        this.function = function;
        this.skillList = skillList;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public List<String> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<String> skillList) {
        this.skillList = skillList;
    }
}
