package com.example.SK_Project2.UserService.service;

import com.example.SK_Project2.UserService.dto.user.ManagerCreateDto;
import com.example.SK_Project2.UserService.dto.user.ManagerDto;


import java.util.List;

public interface ManagerService {
    List<ManagerDto> findAll();

    ManagerDto findById(Long id);

    ManagerDto addManager(ManagerCreateDto managerCreateDto);

    Boolean deleteManager(Long id);

    ManagerDto updateManager(ManagerDto managerDto);

    Boolean verificationEmail(String link);
}
