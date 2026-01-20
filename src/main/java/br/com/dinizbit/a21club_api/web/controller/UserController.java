package br.com.dinizbit.a21club_api.web.controller;

import br.com.dinizbit.a21club_api.entity.User;
import br.com.dinizbit.a21club_api.service.UserSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "*") // Permite que o seu HTML acesse a API
public class UserController {


    private final UserSevice userSevice;

    @PostMapping
    public ResponseEntity<User> createdUser(@RequestBody User user){
     User usuario = userSevice.save(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }


}