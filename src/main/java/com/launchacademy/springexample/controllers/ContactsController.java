package com.launchacademy.springexample.controllers;

import com.launchacademy.springexample.models.Contact;
import com.launchacademy.springexample.repositories.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
  @Autowired
  private ContactRepository contactRepo;

  @GetMapping
  public String getList(Model model){
    List<Contact> contacts = (List<Contact>)contactRepo.findAll();
    model.addAttribute("contacts", contacts);
    return "contacts/index";
  }
  @GetMapping("/{id}")
  public String showContact(@PathVariable int id, Model model){
    Contact show = contactRepo.findById(id);
    model.addAttribute("show", show);
    return "contacts/show";
  }
}
