package org.skillgrowth.springdatajpah2.repositories;

import org.skillgrowth.springdatajpah2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
