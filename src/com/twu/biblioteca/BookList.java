package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<String> bookList = new ArrayList<String>();

    public void Show(){
        bookList.add("1. Core Java");
        for (int i = 0; i < bookList.size(); i++)
            System.out.println(bookList.get(i));
    }
}
