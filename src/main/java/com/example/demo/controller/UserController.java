// package com.example.demo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
// import com.example.demo.model.User;
// import com.example.demo.service.UserService;

// @RestController
// public class UserController {

//     @Autowired
//     private UserService crs;

//     @PostMapping("/users")
//     public User registerUser(@RequestBody User user) {
        
//         return crs.register(user);
//     }

//     @GetMapping("/users/{email}")
//     public User findByEmail(@PathVariable String email) {
//         return crs.findByEmail(email);
//     }
// }

package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ POST /users → 200 OK
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.register(user);
        return ResponseEntity.ok(savedUser);
    }

    // 🔒 GET /users/{email} (JWT protected)
    @GetMapping("/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.findByEmail(email));
    }
}
