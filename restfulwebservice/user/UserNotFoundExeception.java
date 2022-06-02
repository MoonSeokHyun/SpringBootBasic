package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 2xx -> ok
// 4xx -> 클라이언트가 잘못
// 5xx -> 서버가 잘못
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExeception extends RuntimeException {
    public UserNotFoundExeception(String message) {
        super(message);
    }
}
