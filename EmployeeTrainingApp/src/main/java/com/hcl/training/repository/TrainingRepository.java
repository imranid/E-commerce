package com.hcl.training.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.training.entity.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer> {
	
	@Query("from Training t where t.training_name=:trainingName")
	List<Training> findByCourseName(@Param("trainingName") String trainingName);

}
