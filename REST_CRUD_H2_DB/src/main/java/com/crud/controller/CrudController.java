package com.crud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.crud.repository.ChangeRequestRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.crud.entity.ChangeRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CrudController {
	
	@Autowired
	private ChangeRequestRepository changeRequestRepository;
	
	@GetMapping("/test")
	public String requestMethodName() {
		return "Test Example";
	}
	
	@GetMapping("/listAll")
	public List<ChangeRequest> getAllChangeRequest() {
		return changeRequestRepository.findAll();
	}
	
	@GetMapping("/list/{id}")
	public ResponseEntity<ChangeRequest> getChangeRequestById(@PathVariable Long id) {
		Optional<ChangeRequest> cr = changeRequestRepository.findById(id);
		return cr.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/add")
	public ChangeRequest addChangeRequest(@RequestBody ChangeRequest entity) {
		return changeRequestRepository.save(entity);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ChangeRequest> updateChangeRequest(@RequestBody ChangeRequest entity, @PathVariable Long id) {
		Optional<ChangeRequest> cr = changeRequestRepository.findById(id);
		if(cr.isPresent()) {
			ChangeRequest chReq = cr.get();
			chReq.setChangeRequestName(entity.getChangeRequestName());
			chReq.setCompany(entity.getCompany());
		return ResponseEntity.ok(changeRequestRepository.save(chReq));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteChangeRequest(@PathVariable Long id){
		changeRequestRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/listByName/{changeRequestName}")
	public ResponseEntity<ChangeRequest> getChangeRequestById(@PathVariable String changeRequestName) {
		Optional<ChangeRequest> cr = changeRequestRepository.findByChangeRequestName(changeRequestName);
		return cr.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	/*@GetMapping("/hello")
	public List<ChangeRequest> getByQueryMethod() {
		return changeRequestRepository.findSimpleAllRecords();
	}*/
	
	@PostMapping("/addAll")
	public List<ChangeRequest> addChangeRequestMultiple(@RequestBody List<ChangeRequest> entity) {
		return changeRequestRepository.saveAll(entity);
	}
	

}
