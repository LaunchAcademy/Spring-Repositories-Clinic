package com.launchacademy.springexample.seeders;

import com.launchacademy.springexample.models.Contact;
import com.launchacademy.springexample.repositories.ContactRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ContactSeeder implements CommandLineRunner {
  @Autowired
  private ContactRepository repo;

  @Override
  public void run(String... args) throws Exception {
    List<Contact> contacts = new ArrayList<Contact>();

    Contact greatCaptain = new Contact();
    greatCaptain.setFirstName("Ook ook eek");
    greatCaptain.setLastName("The Hairless");
    greatCaptain.setEmailAddress("Ookookeek@DeliciousTaco.com");
    greatCaptain.setPurchaseTotal(2000);
    contacts.add(greatCaptain);

    Contact narwhal = new Contact();
    narwhal.setFirstName("Commotion");
    narwhal.setLastName("Horny");
    narwhal.setEmailAddress("hornycommotion@awesome.com");
    narwhal.setPurchaseTotal(5000);
    contacts.add(narwhal);

    for(Contact contact : contacts){
        repo.save(narwhal);
      }
    }
  }

