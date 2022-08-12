package com.dbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.models.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, String>{

}
