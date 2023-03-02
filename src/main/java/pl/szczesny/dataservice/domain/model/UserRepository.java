package pl.szczesny.dataservice.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szczesny.dataservice.domain.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {



}
