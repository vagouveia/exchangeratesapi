package br.com.vitor.exchangeratesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitor.exchangeratesapi.entities.User;
import br.com.vitor.exchangeratesapi.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

	private UserRepository userRepository;
	
	public User saveUser(User user) {
		
		User userAdd = userRepository.save(user);
		
		return userAdd;
		
	}
	
}
