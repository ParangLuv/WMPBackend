package com.parangluv.withmypet.messagebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.messagebox.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
