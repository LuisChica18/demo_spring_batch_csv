package com.example.demo_spring_batch_csv.dao;

import com.example.demo_spring_batch_csv.model.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVoltageRepository extends JpaRepository<Voltage, Long> {
}
