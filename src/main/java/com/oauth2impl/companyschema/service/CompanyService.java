package com.oauth2impl.companyschema.service;


import com.oauth2impl.companyschema.model.Company;

import java.util.List;

public interface CompanyService {

    Company get(Long id);

    Company get(String name);

    List<Company> getAll();

    void create(Company company);

    Company update(Company company);

    void delete(Long id);

    void delete(Company company);

}
