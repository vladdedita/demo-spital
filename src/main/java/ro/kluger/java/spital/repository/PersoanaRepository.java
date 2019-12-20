package ro.kluger.java.spital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ro.kluger.java.spital.entity.Persoana;

public interface PersoanaRepository extends JpaRepository<Persoana,Long>, QuerydslPredicateExecutor<Persoana> {

}
