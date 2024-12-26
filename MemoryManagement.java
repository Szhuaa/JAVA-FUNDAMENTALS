/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.explicitmemorymanagement;

/**
 *
 * @author Admin
 */
public class ExplicitMemoryManagement {

    public static void main(String[] args) {
        String str = new String("Hello World!");
        
     
        System.out.println(str);

        str = null;

        System.gc();
        System.out.println("Object dereferenced and garbage collection requested.");
    }
}    

