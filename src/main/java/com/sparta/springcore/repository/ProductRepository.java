package com.sparta.springcore.repository;
import com.sparta.springcore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


//jpaRepository를 상속받는것은 엄청난 힘을 가지게 된다.
//컴포넌트 @Repository도 simpleJpaRepository에 내장되어있다.
public interface ProductRepository extends JpaRepository<Product, Long> { }