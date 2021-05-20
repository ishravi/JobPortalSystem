package com.ishRavi.jobportal.service;


import com.ishRavi.jobportal.model.Job;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class JobService {
    private  final   Map<String, Job> jobs ;

    public JobService() {
        this.jobs = new HashMap<>();
    }

    public Job createJob( Job job) {
        while(jobs.containsKey(job.getJobId())){
            job.setJobId(UUID.randomUUID().toString());
        }
        jobs.put(job.getJobId(), job);
        return job;
    }

    public Job getJob(String jobId) {
        if (!jobs.containsKey(jobId)) {
            return null;
        }
        return jobs.get(jobId);
    }

    public List<Job> getAllJobs() {
     List<Job> jobList = jobs.values().stream().collect(Collectors.toList());

     return jobList;
    }

    public String deleteById(String jobId){

        for(String key:jobs.keySet()){
            if(key.equals(jobId)){
                jobs.remove(jobId,jobs.get(jobId));
                return jobId;
            }
        }
        return null;
    }

    public String update( String id, Job job){
         String jobId = id;
        for(String key:jobs.keySet()){
            if(key.equals(jobId)){
                jobs.replace(jobId,jobs.get(jobId),job);
                return jobId;
            }
        }
        return null;
    }

}

