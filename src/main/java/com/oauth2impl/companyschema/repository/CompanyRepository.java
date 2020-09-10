package com.oauth2impl.companyschema.repository;

import com.oauth2impl.companyschema.model.Company;

import java.util.List;

public interface CompanyRepository {

    Company find(Long id);
    Company find(String name);
    List<Company> findAll();
    void create(Company company);
    Company update(Company company);
    void delete(Long id);
    void delete(Company company);
}
