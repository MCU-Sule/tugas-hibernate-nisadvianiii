module com.example.t07_2072051 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires mysql.connector.java;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens com.example.t07_2072051 to javafx.fxml;
    exports com.example.t07_2072051;
    exports com.example.t07_2072051.model;
    opens com.example.t07_2072051.model;
    exports com.example.t07_2072051.controller;
    opens com.example.t07_2072051.controller to javafx.fxml;
    exports com.example.t07_2072051.dao;

}