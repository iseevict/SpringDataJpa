package studydatajpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studydatajpa.datajpa.entity.Team;

// @Repository : 생략 가능
public interface TeamRepositry extends JpaRepository<Team, Long> {
}
