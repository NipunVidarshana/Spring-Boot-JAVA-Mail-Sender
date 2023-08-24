/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.MailConfiguration;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.MailConfigurationRepository;

/**
 *
 * @author DELL
 */
@Service
public class MailConfigurationService {

    @Autowired
    MailConfigurationRepository repository;

    public boolean save(MailConfiguration data) {
        try {
            repository.save(data);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public List<MailConfiguration> findAll() {
        return repository.findAll();
    }
    
     public MailConfiguration findOne(Long id) {
        return repository.findOne(id);
    }
}
