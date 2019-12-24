package com.SpringBootExample.Spring.DAO;
import java.util.List;

import com.SpringBootExample.Spring.Entities.City;;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
