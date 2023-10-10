package com.example.demoAT.service;


import com.example.demoAT.entity.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatus();
    Status getStatusById(Long id);

    Status createStatus(Status status);

    void deleteStatus(Long id);

    Status updateStatus(Long id, Status status);
}
