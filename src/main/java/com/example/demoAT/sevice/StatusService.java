package com.example.demoAT.sevice;


import com.example.demoAT.entity.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatus();
    Status getStatusById(Integer id);

    Status createStatus(Status status);

    void deleteStatus(Integer id);

    Status updateStatus(Integer id, Status status);
}
