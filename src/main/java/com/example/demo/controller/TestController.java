package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TestEntity;
import com.example.demo.repository.TestRepository;

@RestController
@RequestMapping(value = "/test")
public class TestController {
  private TestRepository testRepository;

  private static List<TestEntity> testEntities = new ArrayList<>();

  static {
    for (int i = 0; i <= 2; i++) {
      TestEntity testEntity = new TestEntity();
//      testEntity.setArstId(i);
//      testEntity.setDpstId(i);

//      testEntity.setName("Name" + i);
      testEntity.setLocation(new BigDecimal(i));
      testEntities.add(testEntity);
    }
  }

  public TestController(TestRepository testRepository) {
    this.testRepository = testRepository;
  }


  @GetMapping
  public ResponseEntity<List<TestEntity>> insertData() {
    testRepository.saveAll(testEntities);
    List<TestEntity> all = testRepository.findAll();
    return ResponseEntity.ok().body(all);
  }
}
