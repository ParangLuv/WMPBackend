package com.parangluv.withmypet.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
