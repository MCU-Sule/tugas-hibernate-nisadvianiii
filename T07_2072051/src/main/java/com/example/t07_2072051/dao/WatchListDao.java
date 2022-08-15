package com.example.t07_2072051.dao;

import com.example.t07_2072051.model.WatchList;
import com.example.t07_2072051.utility.HiberUtility;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class WatchListDao implements DaoInterface<WatchList> {
    @Override
    public ObservableList<WatchList> getData() {
        ObservableList<WatchList> wlist = FXCollections.observableArrayList();
        Session s = HiberUtility.getSession();
        CriteriaBuilder bob = s.getCriteriaBuilder();
        CriteriaQuery<WatchList> q = bob.createQuery(WatchList.class);
        q.from(WatchList.class);
        wlist.addAll(s.createQuery(q).getResultList());
        s.close();
        return wlist;
    }

    @Override
    public void addData(WatchList data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.save(data);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void updateData(WatchList data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.update(data);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public int delData(WatchList data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.delete(data);
        s.getTransaction().commit();
        s.close();
        return 0;
    }
}