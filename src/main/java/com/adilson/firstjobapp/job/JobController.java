package com.adilson.firstjobapp.job;


import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController{

    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }
}