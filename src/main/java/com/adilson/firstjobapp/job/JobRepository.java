package com.adilson.firstjobapp.job;

import com.adilson.firstjobapp.job.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {


}
