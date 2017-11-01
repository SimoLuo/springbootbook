package cn.ilimhumar.springbootbook.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  用户持久层接口
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
