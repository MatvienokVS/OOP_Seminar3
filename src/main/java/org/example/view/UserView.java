package org.example.view;

import org.example.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber); //POST
    void removeUser(String fullName); //DELETE
}
