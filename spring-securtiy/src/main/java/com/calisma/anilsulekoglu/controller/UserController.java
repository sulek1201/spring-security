package com.calisma.anilsulekoglu.controller;


import com.calisma.anilsulekoglu.dto.UserDto;
import com.calisma.anilsulekoglu.service.UserService;
import com.calisma.anilsulekoglu.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(
            path = "/save"
    )
    public ResponseEntity<UserDto> createProject(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @RequestMapping("/hello")
    public String index() {
        return "Spring Boot Example!!";
    }


}
