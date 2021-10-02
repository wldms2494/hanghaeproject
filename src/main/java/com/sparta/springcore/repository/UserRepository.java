package com.sparta.springcore.repository;
import com.sparta.springcore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional <User>findByKakaoId( Long kakaoId); //java 8부터는 Optional<T>클래스를 사용해 NullPointException을 방지해준다
}