package com.adilson.firstjobapp.job.controller;


import java.util.List;


import com.adilson.firstjobapp.job.service.JobService;
import com.adilson.firstjobapp.job.models.Job;
import org.springframework.web.bind.annotation.*;


@RestController
public class JobController{
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
          jobService.createJob(job);
          return  "Job added successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id){
        Job job = jobService.getJobById(id);
        if(job != null){
            return  job;
        }else{
         return  new Job(1L,"Test", "TesteJob","1000", "2000","Menongue");
        }
    }

}