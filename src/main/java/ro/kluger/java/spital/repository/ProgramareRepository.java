package ro.kluger.java.spital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import ro.kluger.java.spital.entity.Programare;

@Repository
public interface ProgramareRepository extends JpaRepository<Programare, Integer>, QuerydslPredicateExecutor<Programare> {
}
