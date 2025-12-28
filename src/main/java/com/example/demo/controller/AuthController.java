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
// public class AuthController {

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




// // package com.example.demo.controller;

// // import com.example.demo.model.User;
// // import com.example.demo.service.UserService;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.http.ResponseEntity;
// // import org.springframework.web.bind.annotation.*;

// // @RestController
// // @RequestMapping("/users")
// // public class UserController {

// //     @Autowired
// //     private UserService userService;

// //     // ✅ POST /users → 200 OK
// //     @PostMapping
// //     public ResponseEntity<User> createUser(@RequestBody User user) {
// //         User savedUser = userService.register(user);
// //         return ResponseEntity.ok(savedUser);
// //     }

// //     // 🔒 GET /users/{email} (JWT protected)
// //     @GetMapping("/{email}")
// //     public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
// //         return ResponseEntity.ok(userService.findByEmail(email));
// //     }
// // }







// // @PostMapping("/login")
// // public AuthResponse login(@RequestBody LoginRequest request) {

// //     User user = userService.findByEmail(request.getEmail());

// //     if (!user.getPassword().equals(request.getPassword())) {
// //         throw new RuntimeException("Invalid credentials");
// //     }

// //     // ✅ TOKEN GENERATED ONLY HERE
// //     String token = jwtUtil.generateToken(
// //             user.getEmail(),
// //             user.getId(),
// //             user.getRole()
// //     );

// //     return new AuthResponse(token);
// // }

package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    // ✅ LOGIN → TOKEN
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody User request) {

        User user = userService.findByEmail(request.getEmail());

        // 🔥 THIS CHECK PREVENTS 500 ERROR
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = jwtUtil.generateToken(
                user.getEmail(),
                user.getId(),
                user.getRole()
        );

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return ResponseEntity.ok(response);
    }
}
