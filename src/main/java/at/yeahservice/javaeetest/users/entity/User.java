/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.yeahservice.javaeetest.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dominik
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public User() {
        
    }
    
}
