package com.registrer.users.repositore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.registrer.users.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
