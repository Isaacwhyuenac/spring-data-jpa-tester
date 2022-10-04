package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.PTSTemplateEntityPK;
import com.example.demo.domain.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, PTSTemplateEntityPK> {
}
