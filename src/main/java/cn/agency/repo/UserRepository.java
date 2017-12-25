/**
 *
 */
package cn.agency.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cn.agency.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
