package com.smart.userCenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.userCenter.entity.User;

/**
 * 功能描述
 *
 * @since 2023-11-29
 * extends JpaRepository<User, String>
 */
@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
}
