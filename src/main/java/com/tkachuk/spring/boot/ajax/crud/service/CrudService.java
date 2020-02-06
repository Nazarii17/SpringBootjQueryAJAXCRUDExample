package com.tkachuk.spring.boot.ajax.crud.service;

import com.tkachuk.spring.boot.ajax.crud.entity.Company;
import com.tkachuk.spring.boot.ajax.crud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

    @Autowired
    private CrudRepository crudRepository;

    public List<Company> getCompanyList() {
        return crudRepository.findAll();
    }

    public Company getCompanyById(Integer id) {
        return crudRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Company company) {
        crudRepository.save(company);
    }

    public void deleteCompany(Integer id) {
        crudRepository.deleteById(id);
    }
}