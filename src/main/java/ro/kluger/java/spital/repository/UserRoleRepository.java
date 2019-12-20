package ro.kluger.java.spital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ro.kluger.java.spital.entity.UserRole;
import ro.kluger.java.spital.entity.User;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long>, QuerydslPredicateExecutor<UserRole> {
    List<UserRole> findByUser(User user);

}
