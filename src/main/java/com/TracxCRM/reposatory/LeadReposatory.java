package com.TracxCRM.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TracxCRM.entity.Lead;

public interface LeadReposatory extends JpaRepository<Lead, Long> {

}
