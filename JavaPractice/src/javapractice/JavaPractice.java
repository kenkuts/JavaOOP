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
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author[] aut = new Author[2];
        aut[0] = new Author("Jhonny", 'm');
        aut[1] = new Author("Jane", 'f');
        aut[0].setEmail("GoJhonnyGo@gmail.com");
        aut[1].setEmail("GIJane@hotmail.com");
        System.out.println(aut[0]);
        System.out.println(aut[1]);
        
        Book book = new Book("Rich Dad, Poor Dad", aut, 19.99, 2000);
        
        System.out.println(book);
    }
    
}
