package com.streamflowsolutions.streamflow.controller;

import com.streamflowsolutions.streamflow.dto.UserDto;
import com.streamflowsolutions.streamflow.service.UserService;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotBlank;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    private final UserService userService;

    private final ModelMapper modelMapper;

    public UserController(
            UserService userService,
            ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        return this.modelMapper.map(
                this.userService.create(userDto),
                UserDto.class
        );
    }

    @GetMapping("/{id}")
    public UserDto readUser(@NotBlank @PathVariable long id) {
        return this.modelMapper.map(
                this.userService.readById(id),
                UserDto.class
        );
    }

    @PutMapping
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return this.modelMapper.map(
                this.userService.update(userDto),
                UserDto.class
        );
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@NotBlank @PathVariable long id) {
        this.userService.delete(id);
    }

    @GetMapping
    public List<UserDto> readAll() {
        return this.userService.getAll().stream()
                .map(user -> this.modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

}
