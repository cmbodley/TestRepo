/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
   // or import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author cbodley
 */
@ManagedBean(name = "test")
@SessionScoped
public class FormBean implements Serializable{

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String firstName;
    private String lastName;
    

    /**
     * Creates a new instance of FormBean
     */
    public FormBean() {
    }
    
    public String getUpdate() {
      return this.firstName + ", " + this.lastName;
    }
    
}
