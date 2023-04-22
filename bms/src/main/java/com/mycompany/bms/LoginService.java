/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

import java.util.HashMap;

/**
 *
 * @author swetu
 */
public class LoginService {

    private static HashMap<String, Userlogin> hmap = new HashMap<String, Userlogin>() {
        {
            put("admin", new Userlogin("admin", "admin123", "admin", "hr", true));
            put("kevin1Patel", new Userlogin("Kevin1Patel", "KP123", "Kevin", "Patel", true));
            put("Rahul2Shah", new Userlogin("Rahul2Shah", "RS456", "Rahul", "Shah", true));
            put("Kavita3Sukhadia", new Userlogin("Kavita3Sukhadia", "KS789", "Kavita", "Sukhadia", true));
            put("Shilpi4Sharma", new Userlogin("Shilpi4Sharma", "SS007", "Shilpi", "Sharma", true));
            boolean False = false;
            put("Mahasweta01Thakkar", new Userlogin("Mahasweta01Thakkar", "MT001c", "Mahasweta", "Thakkar", False));
            put("Margrate02Yesuvijs", new Userlogin("Margrate02Yesuvijs", "MY002c", "Margrate", "Yesuvijs", False));

        }
    };

    static HashMap<String, Userlogin> getUsers() {
        return hmap;
    }

    /*int authenticateUser(String username, String password) {
       if (hmap.get(username) == null){
           return 1; // uernsame does not exist
       }
       else {
           if (hmap.get(username).equals(password)) {
               return 0; // success
           }
       }
       return 2;
   }*/
    Userlogin authenticateUser(String username, String password) {
        if (hmap.get(username) == null) {
            return null; // uernsame does not exist
        } else {
            Userlogin userlogin = hmap.get(username);
            if (userlogin.getPassword().equals(password)) {
                return userlogin; // success
            } else {
                return null;
            }
        }
    }
}
