package com.avalith.GonzaloChallenge.repository;

import com.avalith.GonzaloChallenge.model.Habitacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends MongoRepository<Habitacion, Integer> {
}
