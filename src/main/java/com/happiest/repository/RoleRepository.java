/**
 * 
 */
package com.happiest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.happiest.model.Role;

/**
 * @author Rajkumar
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

}
