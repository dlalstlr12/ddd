package com.example.reservation.board.controller;

import com.example.reservation.board.model.User;
import com.example.reservation.board.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}