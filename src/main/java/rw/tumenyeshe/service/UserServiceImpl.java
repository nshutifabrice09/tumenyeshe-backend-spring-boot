package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.User;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUserById(UUID id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
