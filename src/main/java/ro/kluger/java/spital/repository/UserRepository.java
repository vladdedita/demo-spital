package ro.kluger.java.spital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ro.kluger.java.spital.entity.User;

public interface UserRepository extends JpaRepository<User,Long>, QuerydslPredicateExecutor<User> {
    User findByUsername(String username);
}
