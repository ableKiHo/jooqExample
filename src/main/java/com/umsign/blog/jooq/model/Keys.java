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
import com.umsign.blog.jooq.model.tables.records.AuthorRecord;
import com.umsign.blog.jooq.model.tables.records.BookRecord;
import com.umsign.blog.jooq.model.tables.records.BookStoreRecord;
import com.umsign.blog.jooq.model.tables.records.BookToBookStoreRecord;
import com.umsign.blog.jooq.model.tables.records.JooqBoardRecord;
import com.umsign.blog.jooq.model.tables.records.LanguageRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>jooq</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<JooqBoardRecord, Integer> IDENTITY_JOOQ_BOARD = Identities0.IDENTITY_JOOQ_BOARD;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME_UNIQUE = UniqueKeys0.KEY_BOOK_STORE_NAME_UNIQUE;
    public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_TO_BOOK_STORE_PRIMARY;
    public static final UniqueKey<JooqBoardRecord> KEY_JOOQ_BOARD_PRIMARY = UniqueKeys0.KEY_JOOQ_BOARD_PRIMARY;
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = UniqueKeys0.KEY_LANGUAGE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR = ForeignKeys0.FK_BOOK_AUTHOR;
    public static final ForeignKey<BookRecord, LanguageRecord> FK_BOOK_LANGUAGE = ForeignKeys0.FK_BOOK_LANGUAGE;
    public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BOOK_STORE = ForeignKeys0.FK_B2BS_BOOK_STORE;
    public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_BOOK = ForeignKeys0.FK_B2BS_BOOK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<JooqBoardRecord, Integer> IDENTITY_JOOQ_BOARD = Internal.createIdentity(JooqBoard.JOOQ_BOARD, JooqBoard.JOOQ_BOARD.SEQ);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = Internal.createUniqueKey(Author.AUTHOR, "KEY_author_PRIMARY", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = Internal.createUniqueKey(Book.BOOK, "KEY_book_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME_UNIQUE = Internal.createUniqueKey(BookStore.BOOK_STORE, "KEY_book_store_name_UNIQUE", BookStore.BOOK_STORE.NAME);
        public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "KEY_book_to_book_store_PRIMARY", BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
        public static final UniqueKey<JooqBoardRecord> KEY_JOOQ_BOARD_PRIMARY = Internal.createUniqueKey(JooqBoard.JOOQ_BOARD, "KEY_jooq_board_PRIMARY", JooqBoard.JOOQ_BOARD.SEQ);
        public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = Internal.createUniqueKey(Language.LANGUAGE, "KEY_language_PRIMARY", Language.LANGUAGE.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR = Internal.createForeignKey(com.umsign.blog.jooq.model.Keys.KEY_AUTHOR_PRIMARY, Book.BOOK, "fk_book_author", Book.BOOK.AUTHOR_ID);
        public static final ForeignKey<BookRecord, LanguageRecord> FK_BOOK_LANGUAGE = Internal.createForeignKey(com.umsign.blog.jooq.model.Keys.KEY_LANGUAGE_PRIMARY, Book.BOOK, "fk_book_language", Book.BOOK.LANGUAGE_ID);
        public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BOOK_STORE = Internal.createForeignKey(com.umsign.blog.jooq.model.Keys.KEY_BOOK_STORE_NAME_UNIQUE, BookToBookStore.BOOK_TO_BOOK_STORE, "fk_b2bs_book_store", BookToBookStore.BOOK_TO_BOOK_STORE.NAME);
        public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_BOOK = Internal.createForeignKey(com.umsign.blog.jooq.model.Keys.KEY_BOOK_PRIMARY, BookToBookStore.BOOK_TO_BOOK_STORE, "fk_b2bs_book", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }
}