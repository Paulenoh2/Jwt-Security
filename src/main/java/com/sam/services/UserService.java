package com.sam.services;

import com.sam.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    public static final int MAX_FAILED_ATTEMPTS = 5;

    User save(User user);

    Page<User> findAllUser(Pageable pageable);

    List<User> findAll();

    User findByUsername(String username);

    void delete(Long id);

    void delete(User user);

    User updateFailedAttempts(Integer failedAttempts, String username);

    void lockUser(User user);
}
