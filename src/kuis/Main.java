/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;

/**
 *
 * @author Eka Pryhananto
 */
public class Main {
    public static void main(String[] args){
        String name, email, phoneNumber, cari, ulang;
        
        
        do {
            ContactsManager Manager = new ContactsManager();

            name = "Eka";
            email = "eka.pryhananto@gmail.com";
            phoneNumber = "083866731132";
            Contact kontak = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak);

            name = "Pryhananto";
            email = "pryhananto@gmail.com";
            phoneNumber = "0123456789";
            Contact kontak2 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak2);

            name = "Ayi";
            email = "ayiprovallo@gmail.com";
            phoneNumber = "0897456321";
            Contact kontak3 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak3);

            name = "Riris";
            email = "Ririssssssssss@gmail.com";
            phoneNumber = "0855555555";
            Contact kontak4 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak4);
            
            name = "Sugiono";
            email = "onosugiwak@gmail.com";
            phoneNumber = "081122334455";
            Contact kontak5 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak5);

            Scanner input = new Scanner(System.in);
            System.out.print("Search Name : "); cari = input.nextLine();
            System.out.println("Looking for " + cari + "'s contact . . .");
            
            Contact result = Manager.searchContact(cari.toLowerCase());
            
            if(result != null){
                System.out.println("Name        : " + result.getName());
                System.out.println("Phone Number: " + result.getPhoneNumber());
                System.out.println("E-mail      : " + result.getEmail());
            }else{
                System.out.println("Data Tidak Ditemukan Ya, Mohon Coba Lagi");
            }
            
            System.out.println("Again? (y/n)"); ulang = input.nextLine();
            if("n".equals(ulang)){
                System.exit(0);
            }
        } while (true);
        
        
        
        
    }
    
}
