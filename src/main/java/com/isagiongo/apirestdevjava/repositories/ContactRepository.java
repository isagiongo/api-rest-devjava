package com.isagiongo.apirestdevjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isagiongo.apirestdevjava.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
