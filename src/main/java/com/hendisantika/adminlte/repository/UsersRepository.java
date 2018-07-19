package com.hendisantika.adminlte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hendisantika.adminlte.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}