/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.MailCategory;
import com.example.demo.model.MailConfiguration;
import com.example.demo.service.MailCategoryService;
import com.example.demo.service.MailConfigurationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class GetController {

    @Autowired
    MailCategoryService serviceCategory;

    @Autowired
    MailConfigurationService serviceConfiguration;

    @RequestMapping(value = "/restapi/get/one/mail/category/{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<MailCategory> findOneCategory(@PathVariable Long id) {
        //this method is use for get one mail category from db. 
        //ex: place category id as a parameter.
        //ex: /restapi/get/one/mail/category/1
        MailCategory outputData = serviceCategory.findOne(id);
        if (outputData == null) {
            return new ResponseEntity<MailCategory>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<MailCategory>(outputData, HttpStatus.OK);
    }

    @RequestMapping(value = "/restapi/get/all/mail/categories", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<MailCategory>> findAllCategory() {
        //this method is use for get all catogories list from db
        List<MailCategory> outputData = serviceCategory.findAll();
        if (outputData.isEmpty()) {
            return new ResponseEntity<List<MailCategory>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<MailCategory>>(outputData, HttpStatus.OK);
    }

    @RequestMapping(value = "/restapi/get/one/mail/category/configuration/{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<MailConfiguration> findOneConfiguration(@PathVariable Long id) {
        //this method is use for get one mail category from db. 
        //ex: place category id as a parameter.
        //ex: /restapi/get/one/mail/category/1
        MailConfiguration outputData = serviceConfiguration.findOne(id);
        if (outputData == null) {
            return new ResponseEntity<MailConfiguration>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<MailConfiguration>(outputData, HttpStatus.OK);
    }

    @RequestMapping(value = "/restapi/get/all/mail/categories/configuration", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<MailConfiguration>> findAllConfiguration() {
        //this method is use for get all catogories list from db
        List<MailConfiguration> outputData = serviceConfiguration.findAll();
        if (outputData.isEmpty()) {
            return new ResponseEntity<List<MailConfiguration>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<MailConfiguration>>(outputData, HttpStatus.OK);
    }

}
