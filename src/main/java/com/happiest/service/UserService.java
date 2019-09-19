/**
 * 
 */
package com.happiest.service;
import com.happiest.model.User;
/**
 * @author Rajkumar
 *
 */
public interface UserService {
	void save(User user);

	User findByUsername(String username);

}
