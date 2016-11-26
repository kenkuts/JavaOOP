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
public class Book {
    
    private String bookName;
    private Author[] authors; 
    private double price; 
    private int qty = 0;
    
    public Book(String name, Author[] authors, double price){
        
        this.bookName = name;
        this.authors= authors;
        this.price = price; 
        
    }
    public Book(String name, Author[] authors, double price, int qty){
        
        this.bookName = name;
        this.authors= authors;
        this.price = price; 
        this.qty = qty;
    }
    
    public String getName(){
        
        return bookName;
    }
    
    public Author[] getAuthors(){
        int len = authors.length; 
        Author[] aut = new Author[len];
        return authors;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public String getAuthorName(){
        int len = authors.length;
        String str = ""; 
        
        for(int x = 0; x < len;x++)
        {
            str = authors[x].toString() + " ";
        }
        return str;
    }
    
    public String toString(){
        
        String str = "\nBook Name: " + bookName + "\nPrice: $" + price
                    + "\nQuantity: " + qty;
        
        int len = authors.length;
        String aut = ""; 
                
        for(int x = 0; x < len;x++)
        {
            aut += authors[x].toString();
        }
        return str + "\n\nAuthors: " + aut;
    }
    
}
