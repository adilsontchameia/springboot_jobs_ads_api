package com.adilson.firstjobapp.job;

import com.adilson.firstjobapp.job.models.Job;

import java.util.List;

public interface JobService {
   List<Job> findAll();
   void createJob(Job job);
}
