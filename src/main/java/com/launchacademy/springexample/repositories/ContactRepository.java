package com.launchacademy.springexample.repositories;

import com.launchacademy.springexample.models.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
  public Contact findByEmailAddress(String email);
  public Contact findById(int id);
}
