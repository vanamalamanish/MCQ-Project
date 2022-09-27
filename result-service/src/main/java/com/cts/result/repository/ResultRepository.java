package com.cts.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.result.models.ResultModel;

@Repository
public interface ResultRepository extends JpaRepository<ResultModel, Integer> {

}
