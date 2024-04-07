package com.adilson.firstjobapp.job.controller;


import java.util.List;


import com.adilson.firstjobapp.job.services.JobService;
import com.adilson.firstjobapp.job.models.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/jobs") //base url globally
public class JobController{
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>>  findAll(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job){
          jobService.createJob(job);
          return new  ResponseEntity<>("Job added successfully",HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){

        Job job = jobService.getJobById(id);
        if(job != null){
            return  new ResponseEntity<>(job,HttpStatus.OK);
        }else{
         return  new ResponseEntity<>(job,HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        boolean deleted = jobService.deleteJobById(id);

        if(deleted) return new ResponseEntity<>("Job deleted successfully",HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping("/{id}") //Specialized  and reduced code
    //@RequestMapping(value = "/jobs/{id}",method = RequestMethod.PUT)
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updatedJob){
        boolean updated = jobService.updateJob(id,updatedJob);
        if(updated) return new ResponseEntity<>("Job updated succesfully", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}