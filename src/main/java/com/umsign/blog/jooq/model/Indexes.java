/*
 * This file is generated by jOOQ.
 */
package com.umsign.blog.jooq.model;


import com.umsign.blog.jooq.model.tables.Author;
import com.umsign.blog.jooq.model.tables.Book;
import com.umsign.blog.jooq.model.tables.BookStore;
import com.umsign.blog.jooq.model.tables.BookToBookStore;
import com.umsign.blog.jooq.model.tables.JooqBoard;
import com.umsign.blog.jooq.model.tables.Language;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>jooq</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index AUTHOR_PRIMARY = Indexes0.AUTHOR_PRIMARY;
    public static final Index BOOK_FK_BOOK_AUTHOR_IDX = Indexes0.BOOK_FK_BOOK_AUTHOR_IDX;
    public static final Index BOOK_FK_BOOK_LANGUAGE_IDX = Indexes0.BOOK_FK_BOOK_LANGUAGE_IDX;
    public static final Index BOOK_PRIMARY = Indexes0.BOOK_PRIMARY;
    public static final Index BOOK_STORE_NAME_UNIQUE = Indexes0.BOOK_STORE_NAME_UNIQUE;
    public static final Index BOOK_TO_BOOK_STORE_FK_B2BS_BOOK_IDX = Indexes0.BOOK_TO_BOOK_STORE_FK_B2BS_BOOK_IDX;
    public static final Index BOOK_TO_BOOK_STORE_PRIMARY = Indexes0.BOOK_TO_BOOK_STORE_PRIMARY;
    public static final Index JOOQ_BOARD_PRIMARY = Indexes0.JOOQ_BOARD_PRIMARY;
    public static final Index LANGUAGE_PRIMARY = Indexes0.LANGUAGE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index AUTHOR_PRIMARY = Internal.createIndex("PRIMARY", Author.AUTHOR, new OrderField[] { Author.AUTHOR.ID }, true);
        public static Index BOOK_FK_BOOK_AUTHOR_IDX = Internal.createIndex("fk_book_author_idx", Book.BOOK, new OrderField[] { Book.BOOK.AUTHOR_ID }, false);
        public static Index BOOK_FK_BOOK_LANGUAGE_IDX = Internal.createIndex("fk_book_language_idx", Book.BOOK, new OrderField[] { Book.BOOK.LANGUAGE_ID }, false);
        public static Index BOOK_PRIMARY = Internal.createIndex("PRIMARY", Book.BOOK, new OrderField[] { Book.BOOK.ID }, true);
        public static Index BOOK_STORE_NAME_UNIQUE = Internal.createIndex("name_UNIQUE", BookStore.BOOK_STORE, new OrderField[] { BookStore.BOOK_STORE.NAME }, true);
        public static Index BOOK_TO_BOOK_STORE_FK_B2BS_BOOK_IDX = Internal.createIndex("fk_b2bs_book_idx", BookToBookStore.BOOK_TO_BOOK_STORE, new OrderField[] { BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID }, false);
        public static Index BOOK_TO_BOOK_STORE_PRIMARY = Internal.createIndex("PRIMARY", BookToBookStore.BOOK_TO_BOOK_STORE, new OrderField[] { BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID }, true);
        public static Index JOOQ_BOARD_PRIMARY = Internal.createIndex("PRIMARY", JooqBoard.JOOQ_BOARD, new OrderField[] { JooqBoard.JOOQ_BOARD.SEQ }, true);
        public static Index LANGUAGE_PRIMARY = Internal.createIndex("PRIMARY", Language.LANGUAGE, new OrderField[] { Language.LANGUAGE.ID }, true);
    }
}
