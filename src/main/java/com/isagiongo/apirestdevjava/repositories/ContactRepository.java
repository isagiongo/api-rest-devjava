package com.isagiongo.apirestdevjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isagiongo.apirestdevjava.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
