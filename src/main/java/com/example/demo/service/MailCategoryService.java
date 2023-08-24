/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.MailCategory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.MailCategoryRepository;

/**
 *
 * @author DELL
 */
@Service
public class MailCategoryService {

    @Autowired
    MailCategoryRepository repository;

    public boolean save(MailCategory data) {

        try {
            repository.save(data);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public List<MailCategory> findAll() {
        return repository.findAll();
    }
    
     public MailCategory findOne(Long id) {
        return repository.findOne(id);
    }
}
