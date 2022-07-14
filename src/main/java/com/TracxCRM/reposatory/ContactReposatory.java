package com.TracxCRM.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TracxCRM.entity.Contact;

public interface ContactReposatory extends JpaRepository<Contact, Long> {

}
