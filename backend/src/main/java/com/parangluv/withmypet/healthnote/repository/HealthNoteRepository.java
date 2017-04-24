package com.parangluv.withmypet.healthnote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.healthnote.domain.HealthNote;

public interface HealthNoteRepository extends JpaRepository<HealthNote, Long> {

}
