package com.umsign.blog.jooq.service;

import com.umsign.blog.jooq.dao.JooqBoardDao;
import com.umsign.blog.jooq.dto.TitleDto;
import org.springframework.stereotype.Service;

import javax.swing.border.TitledBorder;
import java.util.List;
import java.util.Map;

@Service
public class JooqBoardService {
    private final JooqBoardDao jooqBoardDao;

    public JooqBoardService(JooqBoardDao jooqBoardDao) {
        this.jooqBoardDao = jooqBoardDao;
    }

    /*public List<Map<String, Object>> list() {
        return jooqBoardDao.list();
    }*/
    public List<TitleDto> list() {
        return jooqBoardDao.list();
    }
}
