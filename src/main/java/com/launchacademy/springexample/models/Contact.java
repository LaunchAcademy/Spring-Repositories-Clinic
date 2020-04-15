package com.launchacademy.springexample.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
  @Id
  @SequenceGenerator(name="contact_generator",
      sequenceName="contacts_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE,
      generator="contact_generator")
  @Column(name="id", nullable=false, unique=true)
  private Integer id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email_address")
  private String emailAddress;

  @Column(name="phone_number")
  private String phoneNumber;

  @Column(name="purchase_total")
  private Integer purchaseTotal;

  public String getFullName() {
    return String.join(" ", new String[]{firstName, lastName});
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Integer getPurchaseTotal() {
    return purchaseTotal;
  }

  public void setPurchaseTotal(Integer purchaseTotal) {
    this.purchaseTotal = purchaseTotal;
  }
}
