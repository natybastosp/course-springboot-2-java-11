package com.educandoweb.couse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.couse.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Maria", "maria@gamil.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
