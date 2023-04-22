/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author swetu
 */
public class ShowUsers {
    public static void main(String args[]) {
        HashMap<String, Userlogin> hmap = LoginService.getUsers();
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                System.out.print("" + mentry.getKey() + "=");
                Userlogin user = (Userlogin)mentry.getValue();
                System.out.print(user.getFirstName() 
                        + " " + user.getLastName());
                if (user.isEmployee)
                    System.out.println(" Employee");
                else 
                    System.out.println(" Customer");
        }
    }
}
