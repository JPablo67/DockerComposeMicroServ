package com.jpablo.jp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpablo.jp.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
