package com.ishRavi.jobportal.controller;

import com.ishRavi.jobportal.config.JsonNullableUtils;
import com.ishRavi.jobportal.model.Job;
import com.ishRavi.jobportal.model.JobUpdate;
import com.ishRavi.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    private  JobService jobService;

    @PostMapping("/v1/jobs")
    public ResponseEntity createJob(@RequestBody Job job) {
        if (!isJobValid(job)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        jobService.createJob(job);
        return ResponseEntity.ok().build();
    }

    private boolean isJobValid(Job job) {
        if(job.getUserId() == null || job.getJobId().isEmpty() || job.getBasicDetails() == null
        || job.getTechDetails() == null || job.getRequirementDetails() == null) return false;

        return true;
    }



    @GetMapping("/v1/jobs")
    public ResponseEntity getAllJobs() {
        Optional<List<Job>> readings = Optional.ofNullable(jobService.getAllJobs());
        return readings.isPresent()
                ? ResponseEntity.ok(readings.get())
                : ResponseEntity.notFound().build();
    }



    @GetMapping("/v1/jobs/{jobId}")
    public ResponseEntity getJobById(@PathVariable String jobId) {
        Job job = jobService.getJob(jobId);
        return job != null
                ? ResponseEntity.ok(job)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping ("/v1/jobs/{jobId}")
    public ResponseEntity deleteJobById(@PathVariable String jobId) {
        String id = jobService.deleteById(jobId);
        return id != null
                ? ResponseEntity.ok(id)
                : ResponseEntity.notFound().build();
    }

    @PutMapping  ("/v1/jobs/{jobid}")
    public ResponseEntity updateJob(@PathVariable String jobid,@RequestBody Job job) {
        String id = jobService.update(jobid,job);
        return id != null
                ? ResponseEntity.ok(id)
                : ResponseEntity.notFound().build();
    }

    @PatchMapping("v1/jobs/{jobid}")
    public ResponseEntity partialUpdate(@PathVariable String jobid, @RequestBody JobUpdate jobUpdate){
        Optional<Job> jobOptional = Optional.ofNullable(jobService.getJob(jobid));
        if (!jobOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Job job = jobOptional.get();

        JsonNullableUtils.changeIfPresent(jobUpdate.getUserId(), job::setUserId);

        JsonNullableUtils.changeIfPresent(jobUpdate.getTitle(), job.getBasicDetails()::setTitle);
        JsonNullableUtils.changeIfPresent(jobUpdate.getDescription(), job.getBasicDetails()::setDescription);
        JsonNullableUtils.changeIfPresent(jobUpdate.getCompany_name(), job.getBasicDetails()::setCompany_name);
        JsonNullableUtils.changeIfPresent(jobUpdate.getLocationList(), job.getBasicDetails()::setLocationList);
        JsonNullableUtils.changeIfPresent(jobUpdate.getSalary(), job.getBasicDetails()::setSalary);

        JsonNullableUtils.changeIfPresent(jobUpdate.getIndustry(), job.getTechDetails()::setIndustry);
        JsonNullableUtils.changeIfPresent(jobUpdate.getFunction(), job.getTechDetails()::setFunction);
        JsonNullableUtils.changeIfPresent(jobUpdate.getSkillList(), job.getTechDetails()::setSkillList);

        JsonNullableUtils.changeIfPresent(jobUpdate.getMinExpecrience(), job.getRequirementDetails()::setMinExpecrience);
        JsonNullableUtils.changeIfPresent(jobUpdate.getMaxExperience(), job.getRequirementDetails()::setMaxExperience);
        JsonNullableUtils.changeIfPresent(jobUpdate.getMinEducation(), job.getRequirementDetails()::setMinEducation);


        String id = jobService.update(jobid,job);
        return id != null
                ? ResponseEntity.ok(id)
                : ResponseEntity.notFound().build();
    }

}
