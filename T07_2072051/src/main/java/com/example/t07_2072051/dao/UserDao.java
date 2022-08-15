package com.example.t07_2072051.dao;

import com.example.t07_2072051.model.User;
import com.example.t07_2072051.utility.HiberUtility;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class UserDao implements DaoInterface<User> {
    @Override
    public ObservableList<User> getData() {
        ObservableList<User> ulist = FXCollections.observableArrayList();
        Session s = HiberUtility.getSession();
        CriteriaBuilder bob = s.getCriteriaBuilder();
        CriteriaQuery<User> q = bob.createQuery(User.class);
        q.from(User.class);
        ulist.addAll(s.createQuery(q).getResultList());
        s.close();
        return ulist;
    }

    @Override
    public void addData(User data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.save(data);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void updateData(User data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.update(data);
        s.getTransaction().commit();
        s.close();
    }
    @Override
    public int delData(User data) {
        Session s = HiberUtility.getSession();
        s.beginTransaction();
        s.delete(data);
        s.getTransaction().commit();
        s.close();
        return 0;
    }
}
