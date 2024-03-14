package com.adilson.firstjobapp.job.impl;

import com.adilson.firstjobapp.job.models.Job;
import com.adilson.firstjobapp.job.service.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
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

    @Override
    public Job getJobById(Long id) {
        for(Job job : jobs) {
            if(job.getId().equals(id)){
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {
        Iterator<Job> iterator = jobs.iterator();

        while (iterator.hasNext()){
            Job job = iterator.next();
            if(job.getId().equals(id)){
                iterator.remove();
                return true;
            }

        }
       return false;
    }
}
