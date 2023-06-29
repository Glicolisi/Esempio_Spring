package com.example.springinizio.repositories;

import com.example.springinizio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository//JpaRepository deve avere l'interfaccia(Sostituisce i dao)
public interface UserRepository extends JpaRepository<User, Integer> {  //Classe e chiave

    Optional<User> findbyUsername(String string);


}
