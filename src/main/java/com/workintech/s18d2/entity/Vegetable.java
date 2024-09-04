package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "vegetable", schema="fsweb")
public class Vegetable extends Plant{


  @Column(name = "is_grown_on_tree")
  private boolean isGrownOnTree;



}
