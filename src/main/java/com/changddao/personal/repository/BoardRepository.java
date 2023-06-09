package com.changddao.personal.repository;

import com.changddao.personal.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

}
