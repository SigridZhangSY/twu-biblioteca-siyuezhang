package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookList {
    private List<Map<String, Object>> bookList = new ArrayList<Map<String, Object>>();

    public void Show(){
        bookList.add(new HashMap<String, Object>(){{
            put("name", "Core Java");
            put("author", "Cay S.Horstmann/Gary Cornell");
            put("year published", "2004");
        }});
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print((i+1) + ".");
            System.out.println(bookList.get(i).get("name") + " (" + bookList.get(i).get("author")
                                + ", " + bookList.get(i).get("year published") + ")");
        }

    }
}
