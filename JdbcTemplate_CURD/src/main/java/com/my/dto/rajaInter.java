package com.my.dto;

import java.util.List;

public interface rajaInter {
public void create(raja obj);

public void deleteById(int id);
public void update(int id,String name);

public List<raja> displayAll();
public raja displayById(int id);
public void reset();
}
