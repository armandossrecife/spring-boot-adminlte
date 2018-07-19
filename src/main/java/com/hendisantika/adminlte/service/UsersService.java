package com.hendisantika.adminlte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Users;
import com.hendisantika.adminlte.repository.UsersRepository;

@Service
public class UsersService extends AbstractService<Users, Long>{

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	protected JpaRepository<Users, Long> getRepository(){
		return usersRepository;
	}
}
