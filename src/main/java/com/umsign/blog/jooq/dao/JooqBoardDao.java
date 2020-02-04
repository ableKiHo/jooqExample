package com.umsign.blog.jooq.dao;

import com.umsign.blog.jooq.dto.TitleDto;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.umsign.blog.jooq.model.Tables.AUTHOR;
import static com.umsign.blog.jooq.model.Tables.BOOK;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

@Repository
public class JooqBoardDao {
    private final DSLContext dslContext;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JooqBoardDao(DSLContext dslContext, JdbcTemplate jdbcTemplate) {
        this.dslContext = dslContext;
        this.jdbcTemplate = jdbcTemplate;
    }

    /*public List<Map<String, Object>> list() {
        /*String sql = dslContext.select(field("jooq_board.seq"), field("jooq_board.author"), field("jooq_board.content"), field("jooq_board.read_cnt"), field("jooq_board.add_date"), field("jooq_board.mod_date"))
                .from(table("jooq_board"))
                .where(field("jooq_board.seq").greaterThan(0))
                .limit(2)
                .offset(1)
                .getSQL();
        System.out.println("sql : " + sql);
        return jdbcTemplate.queryForList(sql, 0, 2, 1);*/
        /*Result<Record3<String, String, String>> result =
                dslContext.select(BOOK.TITLE, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME)
                        .from(BOOK)
                        .join(AUTHOR)
                        .on(BOOK.AUTHOR_ID.eq(AUTHOR.ID))
                        .where(BOOK.PUBLISHED_IN.eq(1948))
                        .fetch();
        List<Map<String, Object>> list = new ArrayList<>();
        if(result.size() > 0) {
            for (Record3<String, String, String> record3 : result) {
                Map<String, Object> map = new HashMap<>();
                map.put("title", record3.getValue(BOOK.TITLE));
                map.put("firstName", record3.getValue(AUTHOR.FIRST_NAME));
                map.put("lastName", record3.getValue(AUTHOR.LAST_NAME));

                list.add(map);
            }

        }
        return list;

    } */
    public List<TitleDto> list() {
        return dslContext.select(BOOK.TITLE, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME)
                .from(BOOK)
                .join(AUTHOR)
                .on(BOOK.AUTHOR_ID.eq(AUTHOR.ID))
                .where(BOOK.PUBLISHED_IN.eq(1948))
                .fetchInto(TitleDto.class);
    }

}
