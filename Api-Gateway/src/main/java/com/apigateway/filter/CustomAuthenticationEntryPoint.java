// package com.apigateway.filter;

// import java.io.IOException;
// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.http.MediaType;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.web.AuthenticationEntryPoint;
// import org.springframework.stereotype.Component;

// import com.fasterxml.jackson.databind.ObjectMapper;

// import jakarta.servlet.ServletException;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;
// import lombok.extern.slf4j.Slf4j;

// @Component
// @Slf4j
// public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

//     @Override
//     public void commence(HttpServletRequest request, HttpServletResponse response,
//                          AuthenticationException authException) throws IOException, ServletException {

//         log.error("Unauthorized error: {}", authException.getMessage());

//         response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//         response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

//         Map<String, Object> responseMap = new HashMap<>();
//         responseMap.put("status", HttpServletResponse.SC_UNAUTHORIZED);
//         responseMap.put("error", "Unauthorized");
//         responseMap.put("message", authException.getMessage());
//         responseMap.put("path", request.getServletPath());

//         ObjectMapper mapper = new ObjectMapper();
//         mapper.writeValue(response.getOutputStream(), responseMap);
//     }
// }
