package com.adilson.firstjobapp.company.services;

import com.adilson.firstjobapp.company.models.Company;
import com.adilson.firstjobapp.job.models.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
