package com.adilson.firstjobapp.job.impl;

import com.adilson.firstjobapp.job.models.Job;
import com.adilson.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private final List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        //Set current ID to the object and will increment
        job.setId(nextId++);

        jobs.add(job);

    }
}
