package com.adilson.firstjobapp.job.services;

import com.adilson.firstjobapp.job.models.Job;

import java.util.List;

public interface JobService {
   List<Job> findAll();
   void createJob(Job job);
   Job getJobById(Long id);
   boolean deleteJobById(Long id);
   boolean updateJob(Long id, Job updatedJob);
}
