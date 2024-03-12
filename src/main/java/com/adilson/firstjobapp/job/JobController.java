package com.adilson.firstjobapp.job;


import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController{

    /* Endpoints and examples below
    GET /jobs: Get all jobs
    GET {base_url}/jobs

    GET /jobs/{id}: Get a specific job by ID
    GET {base_url}/jobs/1

    POST /jobs: Create a new job (request body should contain the job details)
    POST {base_url}/jobs

    DELETE /jobs/{id}: Delete a specific job by ID
    DELETE {base_url}/jobs/1

    PUT /jobs/{id}: Update a specific job by ID (request body should contain the job details)
    PUT {base_url}/jobs/1

    GET /jobs/{id}/company: Get the company associated with a specific job by ID
    GET {base_url}/jobs/1/company
     */



    private final List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }

}