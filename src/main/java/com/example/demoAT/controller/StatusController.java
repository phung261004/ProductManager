package com.example.demoAT.controller;

import com.example.demoAT.entity.Status;
import com.example.demoAT.service.impl.StatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/status")
public class StatusController {
    @Autowired
    private StatusServiceImpl statusServiceImpl;

    @GetMapping
    public List<Status> getAllStatus() {
        return statusServiceImpl.getAllStatus();
    }

    @GetMapping("/{id}")
    public Status getStatusById(@PathVariable Long id) {
        return statusServiceImpl.getStatusById(id);
    }

    @PostMapping("/")
    public Status createStatus(@RequestBody Status status) {
        return statusServiceImpl.createStatus(status);
    }

    @PutMapping("/{id}")
    public Status updateStatus(@PathVariable Long id, @RequestBody Status status) {
        return statusServiceImpl.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public void deleteStatus(@PathVariable Long id) {
        statusServiceImpl.deleteStatus(id);
    }
}
