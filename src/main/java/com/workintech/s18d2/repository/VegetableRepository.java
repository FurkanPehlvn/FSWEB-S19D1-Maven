package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query(value = "SELECT v.id,v.name,v.price,v.fruit_type FROM fsweb.vegetable v ORDER by v.price DESC", nativeQuery = true)
    List<Fruit> getByPriceDesc();


    @Query(value = "SELECT v.id,v.name,v.price,v.fruit_type FROM fsweb.vegetable v ORDER by v.price ASC", nativeQuery = true)
    List<Fruit> getByPriceAsc();


    @Query("SELECT v FROM Vegetable v where v.name LIKE %:name%")
    List<Fruit> searchByName(String name);
}
