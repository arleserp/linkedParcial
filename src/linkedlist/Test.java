/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author arlese.rodriguezp
 */
public class Test {

  public static void main(String[] args) {

        Chain x = new Chain();
     
        x.add(0, new Integer(2));
        x.add(1, new Integer(6));
        x.add(2, new Integer(1));
        x.add(3, new Integer(4));
        
        System.out.println("The list is " + x);
        System.out.println("List size is " + x.size());
    }
    
}
