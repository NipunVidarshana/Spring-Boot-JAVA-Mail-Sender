/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.MailCategory;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface MailCategoryRepository extends CrudRepository<MailCategory, Long> {

    @Override
    MailCategory save(MailCategory data);

    @Override
    List<MailCategory> findAll();

    @Query("select u from MailCategory u where id = :id")
    MailCategory findOne(long id);

}
