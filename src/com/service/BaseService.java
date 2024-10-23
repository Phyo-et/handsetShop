package com.service;

import dao.AbstractDao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class BaseService<T> {

    protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private AbstractDao<T> abstractDao;

}
