package com.example.demo.service

import com.example.demo.dto.TaskRepository
import com.example.demo.entity.TaskEntity
import com.example.demo.request.TaskDTORequest
import com.example.demo.response.TaskDTOResponse
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class TaskService (var repository: TaskRepository) {
    fun creatTask(newTask: TaskDTORequest): TaskDTOResponse {
        val save = repository.save(TaskEntity(id = null, name = newTask.name, description = newTask.description, done = newTask.done))
        return TaskDTOResponse (id = save.id !!, name = save.name, description = save.description, done = save.done)

    }
}