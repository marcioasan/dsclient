package com.marcio.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
