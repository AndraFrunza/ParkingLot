/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.common;

/**
 *
 * @author Andra Frunza
 */
public class UserDetails implements java.io.Serializable{
    
    private Integer id;
    private String username;
    private String email;
    private String position;

    public UserDetails(Integer id, String username, String email, String position) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.position = position;
    }

    public UserDetails(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Integer getId(){
        return id;
    }


    
}
