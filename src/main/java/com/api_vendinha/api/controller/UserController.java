package com.api_vendinha.api.controller;

import com.api_vendinha.api.domain.dtos.request.UserRequestDto;
import com.api_vendinha.api.domain.dtos.response.UserResponseDto;
import com.api_vendinha.api.domain.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para gerenciar operações relacionadas aos usuários.
 */
@RestController
@RequestMapping("/api/users") // Define o caminho base para as requisições deste controlador.
public class UserController {


    private final UserServiceInterface userService;

    @Autowired
    public UserController(UserServiceInterface userService) {
        this.userService = userService;
    }

    /**
     * Método para salvar um novo usuário.
     *
     * @param userRequestDto DTO que contém os dados do usuário a ser salvo.
     * @return DTO com as informações do usuário salvo, incluindo o ID gerado.
     */
    @PostMapping
    public UserResponseDto salvar(@RequestBody UserRequestDto userRequestDto) {
        // System.out.println(userRequestDto);
        // Chama o serviço para salvar o usuário e retorna a resposta.
        return userService.save(userRequestDto);
    }

    @GetMapping("/{id}")
    public UserResponseDto get(
            @PathVariable Long id
    ) {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public UserResponseDto update(
            @PathVariable Long id,
            @RequestBody UserRequestDto userRequestDto
    ) {
        return userService.update(id, userRequestDto);
    }

    @PutMapping("/{id}/status")
    public UserResponseDto updateStatus(
            @PathVariable Long id,
            @RequestBody UserRequestDto userRequestDto
    ) {
        return userService.updateStatus(id, userRequestDto);
    }
}
