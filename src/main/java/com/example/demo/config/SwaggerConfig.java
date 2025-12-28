package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // You need to change the port as per your server
                .servers(List.of(
                        new Server().url("https://9014.32procr.amypo.ai/")
                ));
        }
}
// package com.example.demo.config;

// import io.swagger.v3.oas.models.OpenAPI;
// import io.swagger.v3.oas.models.Components;
// import io.swagger.v3.oas.models.servers.Server;
// import io.swagger.v3.oas.models.security.SecurityScheme;
// import io.swagger.v3.oas.models.security.SecurityRequirement;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import java.util.List;

// @Configuration
// public class SwaggerConfig {

//     @Bean
//     public OpenAPI customOpenAPI() {

//         // 🔐 JWT Bearer Security Scheme
//         SecurityScheme bearerScheme = new SecurityScheme()
//                 .type(SecurityScheme.Type.HTTP)
//                 .scheme("bearer")
//                 .bearerFormat("JWT");

//         return new OpenAPI()
//                 // 🌍 Server URL
//                 .servers(List.of(
//                         new Server().url("https://9014.32procr.amypo.ai/")
//                 ))

//                 // 🔧 Register security scheme
//                 .components(new Components()
//                         .addSecuritySchemes("BearerAuth", bearerScheme)
//                 )

//                 // 🔒 Apply security globally
//                 .addSecurityItem(new SecurityRequirement()
//                         .addList("BearerAuth")
//                 );
//     }
// }
