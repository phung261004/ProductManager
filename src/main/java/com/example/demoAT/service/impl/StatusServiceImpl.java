package com.example.demoAT.service.impl;

import com.example.demoAT.entity.Status;
import com.example.demoAT.repository.StatusRepository;
import com.example.demoAT.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;


    @Override
    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    @Override
    public Status getStatusById(Long id) {
        return statusRepository.findById(id).orElse(null);
    }

    @Override
    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void deleteStatus(Long id) {
        statusRepository.deleteById(id);
    }

    @Override
    public Status updateStatus(Long id, Status status) {
        Status existingStatus = statusRepository.findById(id).orElse(null);
        if(existingStatus != null) {
            existingStatus.setStatusName(status.getStatusName());
            return statusRepository.save(existingStatus);
        } else {
            return null;
        }
    }
}
