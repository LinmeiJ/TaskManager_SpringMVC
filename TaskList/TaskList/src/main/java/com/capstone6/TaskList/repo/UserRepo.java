package com.capstone6.TaskList.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6.TaskList.pojo.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
