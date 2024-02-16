package sn.thiare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.thiare.domain.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {

}
