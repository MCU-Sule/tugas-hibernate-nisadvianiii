package com.example.t07_2072051.dao;

import com.example.t07_2072051.model.Movie;
import com.example.t07_2072051.utility.HiberUtility;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class MovieDao implements DaoInterface<Movie> {
    @Override
    public ObservableList<Movie> getData() {
        ObservableList<Movie> mlist = FXCollections.observableArrayList();
        Session s = HiberUtility.getSession();
        CriteriaBuilder bob = s.getCriteriaBuilder();
        CriteriaQuery<Movie> q = bob.createQuery(Movie.class);
        q.from(Movie.class);
        mlist.addAll(s.createQuery(q).getResultList());
        s.close();
        return mlist;
    }

    @Override
    public void addData(Movie data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.save(data);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void updateData(Movie data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.update(data);
        s.getTransaction().commit();
        s.close();
    }
    @Override
    public int delData(Movie data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.delete(data);
        s.getTransaction().commit();
        s.close();
        return 0;
    }
}
