package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.MyEvent;

public interface MyEventRepository extends CrudRepository<MyEvent, Integer>{

}
