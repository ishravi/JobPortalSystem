package com.ishRavi.jobportal.model;


import org.openapitools.jackson.nullable.JsonNullable;
import java.util.List;

@SuppressWarnings("FieldMayBeFinal")
public class JobUpdate {

    private   JsonNullable<String> userId = JsonNullable.undefined();
    private JsonNullable<String> title = JsonNullable.undefined();
    private  JsonNullable<String> description = JsonNullable.undefined();
    private JsonNullable<String> company_name = JsonNullable.undefined();
    private JsonNullable<List<String>> locationList = JsonNullable.undefined();
    private  JsonNullable<String> salary = JsonNullable.undefined();
    private JsonNullable<String> industry = JsonNullable.undefined();
    private JsonNullable<String> function = JsonNullable.undefined();
    private JsonNullable<List<String>>  skillList = JsonNullable.undefined();
    private JsonNullable<String>  minExpecrience = JsonNullable.undefined();
    private JsonNullable<String>  maxExperience = JsonNullable.undefined();
    private JsonNullable<String>  minEducation = JsonNullable.undefined();

    public JobUpdate() {

    }

    public JsonNullable<String> getUserId() {
        return userId;
    }

    public JsonNullable<String> getTitle() {
        return title;
    }

    public JsonNullable<String> getDescription() {
        return description;
    }

    public JsonNullable<String> getCompany_name() {
        return company_name;
    }

    public JsonNullable<List<String>> getLocationList() {
        return locationList;
    }

    public JsonNullable<String> getSalary() {
        return salary;
    }

    public JsonNullable<String> getIndustry() {
        return industry;
    }

    public JsonNullable<String> getFunction() {
        return function;
    }

    public JsonNullable<List<String>> getSkillList() {
        return skillList;
    }

    public JsonNullable<String> getMinExpecrience() {
        return minExpecrience;
    }

    public JsonNullable<String> getMaxExperience() {
        return maxExperience;
    }

    public JsonNullable<String> getMinEducation() {
        return minEducation;
    }
}
