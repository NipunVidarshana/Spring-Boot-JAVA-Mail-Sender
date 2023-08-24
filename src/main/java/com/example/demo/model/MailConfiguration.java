/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.*;

/**
 *
 * @author DELL
 */
@Entity(name = "email_Configuration")//table name create as "student"
public class MailConfiguration {

    @Id//use @id for tell this feild is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this is use to tell hibernate to create a auto increment number
    private Long id_pk; //database feild create as id 

    @Column(name = "service_provider", length = 200, nullable = false)
    private String serviceProvider;
    
    @Column(name = "max_daily_mails", length = 6, nullable = false)
    private int maxDailyMails;
    
    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;

    @Column(name = "port", length = 9999, nullable = false)
    private int port;

    @Column(name = "protocol", length = 5, nullable = false)
    private String protocol;

    @Column(name = "auth", length = 6, nullable = false)
    private String auth;

    @Column(name = "start_tls", length = 6, nullable = false)
    private String starttls;

    @Column(name = "start_tls_required", length = 6, nullable = false)
    private String starttlsrequired;

    @Column(name = "username", length = 20, nullable = false)
    private String username;

    @Column(name = "password", length = 20, nullable = false)
    private String password;
    
     private Long id;

    public Long getId_pk() {
        return id_pk;
    }

    public void setId_pk(Long id_pk) {
        this.id_pk = id_pk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getStarttls() {
        return starttls;
    }

    public void setStarttls(String starttls) {
        this.starttls = starttls;
    }

    public String getStarttlsrequired() {
        return starttlsrequired;
    }

    public void setStarttlsrequired(String starttlsrequired) {
        this.starttlsrequired = starttlsrequired;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public int getMaxDailyMails() {
        return maxDailyMails;
    }

    public void setMaxDailyMails(int maxDailyMails) {
        this.maxDailyMails = maxDailyMails;
    }
}
