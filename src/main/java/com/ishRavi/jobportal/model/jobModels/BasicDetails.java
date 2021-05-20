package com.ishRavi.jobportal.model.jobModels;

import java.util.List;

public class BasicDetails {
    private String title;
    private  String description;
    private String company_name;
    private  List<String> locationList;
    private  String Salary;

    public BasicDetails(String title, String description, String company_name, List<String> locationList, String salary) {
        this.title = title;
        this.description = description;
        this.company_name = company_name;
        this.locationList = locationList;
        this.Salary = salary;
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

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public List<String> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<String> locationList) {
        this.locationList = locationList;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
