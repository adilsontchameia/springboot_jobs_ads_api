package com.adilson.firstjobapp.company;

import com.adilson.firstjobapp.company.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
