package com.vectortest.Test.Repo;
import com.vectortest.Test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
