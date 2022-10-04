package com.example.demo.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@IdClass(PTSTemplateEntityPK.class)
@Table(name = "test")
public class TestEntity implements Serializable {
  @Id
//  @SequenceGenerator(name = "pts_dpst", sequenceName = "sq_pts_test_dpst_sequence", allocationSize = 1)
//  @GeneratedValue(generator = "pts_dpst", strategy = GenerationType.SEQUENCE)
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "dpstId")
  private int dpstId;

  @Id
//  @SequenceGenerator(name = "pts_arst", sequenceName = "sq_pts_test_arst_sequence", allocationSize = 1)
//  @GeneratedValue(generator = "pts_arst", strategy = GenerationType.SEQUENCE)
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "arstId")
//  @GeneratedValue(strategy = GenerationType.AUTO)
  private int arstId;

  private BigDecimal name;

  private BigDecimal location;

}
