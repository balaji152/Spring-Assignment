package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import Controller.Users;
@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {

	Users findByName(String employeeName);

}
