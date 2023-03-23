package com.changddao.personal.repository;

import com.changddao.personal.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BoardRepositoryTest {
    @Autowired
    EntityManager em;
    @Autowired
    BoardRepository boardRepository;

    @Test
    public void simpleTest() {
        Board board = new Board("test1", "testContent");
        boardRepository.save(board);

    }

}