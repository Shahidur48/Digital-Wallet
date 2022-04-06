package com.optimagrowth.user.repository;

import com.optimagrowth.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
