package com.tkachuk.spring.boot.ajax.crud.repository;

import com.tkachuk.spring.boot.ajax.crud.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Company, Integer> {

}