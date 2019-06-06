package com.capstone6.TaskList.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6.TaskList.pojo.Task;

public interface TaskRepo extends JpaRepository<Task, Integer> {
}
