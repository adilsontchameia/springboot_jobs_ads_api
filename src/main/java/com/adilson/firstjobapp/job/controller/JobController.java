package com.adilson.firstjobapp.job.controller;


import java.util.List;


import com.adilson.firstjobapp.job.service.JobService;
import com.adilson.firstjobapp.job.models.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class JobController{
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>>  findAll(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job){
          jobService.createJob(job);
          return new  ResponseEntity<>("Job added successfully",HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){

        Job job = jobService.getJobById(id);
        if(job != null){
            return  new ResponseEntity<>(job,HttpStatus.OK);
        }else{
         return  new ResponseEntity<>(job,HttpStatus.NOT_FOUND);
        }
    }

}