package com.company.LessonList;

import java.util.LinkedList;

public interface Books {
    void list(LinkedList<Book>list);
    void add(LinkedList<Book>list);
    void search(LinkedList<Book>list);
    void  remove();
}
