package com.example.t07_2072051.controller;

import com.example.t07_2072051.dao.UserDao;
import com.example.t07_2072051.model.User;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller2 {
    public TextField txtUserName;
    public PasswordField txtPassword;

    private ObservableList<User> ulist;
    private UserDao userDao;

    private boolean check() {
        boolean result = true;
        if (txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Isi semua field");
            alert.show();
            result = false;
        }
        return result;
    }

    public void reset() {
        txtUserName.setText("");
        txtPassword.setText("");
    }

    public void submit(ActionEvent actionEvent) {
        if (check()) {
            User user = new User(
                    txtUserName.getText(),
                    txtPassword.getText()
            );

            userDao.addData(user);
            ulist = userDao.getData();
            reset();
        }
    }
}
