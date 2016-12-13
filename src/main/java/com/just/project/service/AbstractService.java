package com.just.project.service;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public abstract class AbstractService<T> {

    public abstract  Long getCount();

    public abstract List<T> list();

    public abstract T getObjectById(Integer id);

    public abstract Integer save(T t);

    public abstract void update(T t);

    public abstract void delete(T t);
}
