package com.example.demo.controller

import com.example.demo.request.TaskDTORequest
import com.example.demo.response.TaskDTOResponse
import com.example.demo.service.TaskService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TaskController (var taskService: TaskService) {

    @PostMapping("/create")
    fun createTask(@RequestBody newTask: TaskDTORequest): TaskDTOResponse {
        return taskService.creatTask(newTask);
    }
}