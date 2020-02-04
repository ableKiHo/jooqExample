package com.umsign.blog.jooq.controller;

import com.umsign.blog.jooq.service.JooqBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/jooq_board")
public class JooqBoardController {

    private final JooqBoardService jooqBoardService;

    @Autowired
    public JooqBoardController(JooqBoardService jooqBoardService) {
        this.jooqBoardService = jooqBoardService;
    }

    @GetMapping("/list")
    public Callable<Map<String, Object>> list() {
        Map<String, Object> result = new HashMap<>();
        result.put("list", jooqBoardService.list());
        return () -> result;
    }
}
