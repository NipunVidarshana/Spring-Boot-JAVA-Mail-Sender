/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.MailConfiguration;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface MailConfigurationRepository extends CrudRepository<MailConfiguration, Long> {

    @Override
    MailConfiguration save(MailConfiguration data);

    @Override
    List<MailConfiguration> findAll();

    @Query("select u from MailConfiguration u where id_pk = :id")
    MailConfiguration findOne(long id);

}
