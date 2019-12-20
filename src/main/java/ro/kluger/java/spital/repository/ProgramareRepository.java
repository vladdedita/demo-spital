package ro.kluger.java.spital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ro.kluger.java.spital.entity.Programare;

public interface ProgramareRepository extends JpaRepository<Programare, Long>, QuerydslPredicateExecutor<Programare> {
    
}
