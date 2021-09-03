package br.com.vitor.exchangeratesapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitor.exchangeratesapi.entities.User;
import br.com.vitor.exchangeratesapi.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/add/user")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
	
	private final UserService userService;

	//Metodo responsável por salvar o usuário no banco de dados
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	public User save(@RequestBody @Valid User user) {
		return userService.saveUser(user);
	}

}
