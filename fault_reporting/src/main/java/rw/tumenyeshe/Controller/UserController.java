package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.User;
import rw.tumenyeshe.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable ("id")UUID id){
        return userService.getUserById(id);
    }

    @PutMapping("/update/user/{id}")
    public User updateUser(@PathVariable("id") UUID id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        userService.deleteById(id);
    }
}
