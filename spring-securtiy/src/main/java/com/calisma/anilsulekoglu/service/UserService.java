package com.calisma.anilsulekoglu.service;


import com.calisma.anilsulekoglu.dto.UserDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto save(UserDto user);


}
