/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class Author {
    
    private String name;
    private String email;
    private char gender; 
    
    public Author(String name, char gender){
        
        this.name = name;
        this.gender = gender;
    }
    
    public String getEmail(){
        
        return email;
    }
    
    public void setEmail(String email){
        
        this.email = email;
    }
    
    public String toString(){
        
        String str = "\nName: " + name + "\nEmail: " + email +
                     "\nGender: " + gender;
        
        return str;
    }
}
