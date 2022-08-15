package com.example.t07_2072051.dao;

import javafx.collections.ObservableList;

public interface DaoInterface<T> {
    ObservableList<T> getData();
    void addData(T data);
    void updateData(T data);
    int delData(T data);
}
