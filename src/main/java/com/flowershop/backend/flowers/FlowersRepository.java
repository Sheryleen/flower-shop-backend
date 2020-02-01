package com.flowershop.backend.flowers;

import com.flowershop.backend.flowers.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowersRepository extends JpaRepository<Flower, Integer> {
}
