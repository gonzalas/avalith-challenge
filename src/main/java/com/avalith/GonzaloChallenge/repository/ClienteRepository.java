package com.avalith.GonzaloChallenge.repository;

import com.avalith.GonzaloChallenge.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Integer> {
}
