package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PTSTemplateEntityPK implements Serializable {

//  @Column(name = "arstId", unique = true, insertable = false, updatable = false)
  private int arstId;

//  @Column(name = "dpstId", unique = true, insertable = false, updatable = false)
  private int dpstId;
}
