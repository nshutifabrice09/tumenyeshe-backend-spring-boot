package rw.tumenyeshe.service;

import rw.tumenyeshe.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUser();
    User getUserById(UUID id);
    User saveUser (User user);
    User updateUser (UUID id, User user);
    void deleteById (UUID id);
}
