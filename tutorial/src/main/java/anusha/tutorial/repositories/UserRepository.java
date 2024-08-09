package anusha.tutorial.repositories;

import anusha.tutorial.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

