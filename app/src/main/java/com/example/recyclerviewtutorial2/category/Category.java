package com.example.recyclerviewtutorial2.category;

import com.example.recyclerviewtutorial2.book.Book;

import java.util.List;

public class Category {
    private String nameCategory;
    private List<Book> books;

    public Category(String nameCategory, List<Book> books) {
        this.nameCategory = nameCategory;
        this.books = books;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
