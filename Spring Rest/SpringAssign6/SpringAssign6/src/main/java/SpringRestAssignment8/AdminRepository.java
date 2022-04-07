package SpringRestAssignment8;



import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Component;
@Component
public interface AdminRepository extends MongoRepository<Admin, Integer> {

	Admin findByItem(String item);

}