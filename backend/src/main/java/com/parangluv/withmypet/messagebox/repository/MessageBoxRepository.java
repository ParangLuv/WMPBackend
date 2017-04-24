package com.parangluv.withmypet.messagebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.messagebox.domain.MessageBox;

public interface MessageBoxRepository extends JpaRepository<MessageBox, Long> {

}
