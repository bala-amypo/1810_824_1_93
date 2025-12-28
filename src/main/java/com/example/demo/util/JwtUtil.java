// package com.example.demo.util;

// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import org.springframework.stereotype.Component;
// import org.springframework.security.core.userdetails.UserDetails;
// import java.util.Date;

// @Component
// public class JwtUtil {
//     private final String SECRET_KEY = "secret";

//     public String generateToken(String username, Long userId, String role) {
//         return Jwts.builder()
//             .setSubject(username)
//             .claim("userId", userId)
//             .claim("role", role)
//             .setIssuedAt(new Date())
//             .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
//             .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
//             .compact();
//     }

//     public String extractUsername(String token) {
//         return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
//     }

//     public Long extractUserId(String token) {
//         return ((Number) Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token)
//                 .getBody().get("userId")).longValue();
//     }

//     public String extractRole(String token) {
//         return (String) Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token)
//                 .getBody().get("role");
//     }

//     public boolean validateToken(String token, UserDetails userDetails) {
//         return extractUsername(token).equals(userDetails.getUsername());
//     }
    
// }

package com.example.demo.util;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    // ⚠️ MUST be at least 32 characters
    private static final String SECRET_KEY =
            "mysecretkeymysecretkeymysecretkey123";

    private static final long EXPIRATION_TIME = 86400000; // 1 day

    public String generateToken(String email, Long userId, String role) {

        return Jwts.builder()
                .setSubject(email)
                .claim("userId", userId)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    public String extractUsername(String token) {
        return getClaims(token).getSubject();
    }

    public boolean validateToken(String token, org.springframework.security.core.userdetails.UserDetails userDetails) {
        return extractUsername(token).equals(userDetails.getUsername());
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }
}
