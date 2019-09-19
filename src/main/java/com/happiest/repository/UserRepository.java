/**
 * 
 */
package com.happiest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.happiest.model.User;
/**
 * @author Rajkumar
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
