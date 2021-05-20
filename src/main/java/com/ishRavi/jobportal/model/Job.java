package com.ishRavi.jobportal.model;

import com.ishRavi.jobportal.model.jobModels.BasicDetails;
import com.ishRavi.jobportal.model.jobModels.RequirementDetails;
import com.ishRavi.jobportal.model.jobModels.TechDetails;

import java.util.UUID;

public class Job {
    private  String jobId;
    private  String userId;
    private  BasicDetails basicDetails;
    private  TechDetails techDetails;
    private   RequirementDetails requirementDetails;



    public Job(String userId, BasicDetails basicDetails, TechDetails techDetails, RequirementDetails requirementDetails) {
        String jobId = UUID.randomUUID().toString();
        this.jobId= jobId;
        this.userId = userId;
        this.basicDetails = basicDetails;
        this.techDetails = techDetails;
        this.requirementDetails = requirementDetails;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BasicDetails getBasicDetails() {
        return basicDetails;
    }

    public void setBasicDetails(BasicDetails basicDetails) {
        this.basicDetails = basicDetails;
    }

    public TechDetails getTechDetails() {
        return techDetails;
    }

    public void setTechDetails(TechDetails techDetails) {
        this.techDetails = techDetails;
    }

    public RequirementDetails getRequirementDetails() {
        return requirementDetails;
    }

    public void setRequirementDetails(RequirementDetails requirementDetails) {
        this.requirementDetails = requirementDetails;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
