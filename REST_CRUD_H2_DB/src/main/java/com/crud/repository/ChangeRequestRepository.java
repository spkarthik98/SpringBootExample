package com.crud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.crud.entity.ChangeRequest;

import jakarta.transaction.Transactional;

public interface ChangeRequestRepository extends JpaRepository<ChangeRequest, Long> {

	Optional<ChangeRequest> findByChangeRequestName(String changeRequestName);
	
	/*@Query("select cr from change_request cr")
	List<ChangeRequest> findSimpleAllRecords();
	
	@Modifying
    @Transactional
    @Query(value = "CREATE TABLE IF NOT EXISTS change_request (id bigint not null, change_request_name varchar(255), company varchar(255), primary key (id))", nativeQuery = true)
    void createTableIfNotExists();*/

}
