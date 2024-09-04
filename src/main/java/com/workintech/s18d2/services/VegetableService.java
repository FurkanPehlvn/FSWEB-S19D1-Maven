package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;

import java.util.List;
import java.util.Optional;

public interface VegetableService {

    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();

    Fruit getById(long id);

    Fruit save(Fruit fruit);

    Fruit delete(long id);

    List<Fruit> searchByName(String name);

}
