/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author DELL
 */
@Entity(name = "email_category")//table name create as "student"
public class MailCategory {

    @Id//use @id for tell this feild is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is use to tell hibernate to create a auto increment number
    private Long id; //database feild create as id 

    @Column(name = "category", length = 40, nullable = false, unique = true)
    private String category;//database feild create as email category --- Ex:user registration,security,notification etc.

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id", updatable = false, insertable = false)
    private List<MailConfiguration> mails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<MailConfiguration> getMails() {
        return mails;
    }

    public void setMails(List<MailConfiguration> mails) {
        this.mails = mails;
    }
}
