package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public class CarRepository {
	@Autowired
	private JdbcTemplate template;
	
	public int sellCar(Car entity) {
		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);

		inserter.withTableName("car").usingColumns("model", "yom","kmsTravelled","price","status");
		
		BeanPropertySqlParameterSource sql =new BeanPropertySqlParameterSource(entity);
		return inserter.execute(sql);
	}
	
	public List<Car> getAllCars(){
		String sql ="select * from car";
		
		List<Car> carList = template.query(sql,BeanPropertyRowMapper.newInstance(Car.class) );
		return carList;
	}
	
	public List<Car> getCarsForSale(){
		String sql ="select * from car where status=\'unsold\'";
		List<Car> carList1 = template.query(sql,BeanPropertyRowMapper.newInstance(Car.class) );
		return carList1;
		
	}
	
	public String[] getModel()
	{
		String sql = "select distinct(model) from car";
		List<String> list = template.queryForList(sql, String.class);
		String[] modelslist = list.toArray(new String[list.size()]);
	
		return  modelslist;
	}
	public List<Car> getCarsByModel(String model)
	{
		String sql = "select * from cars where model=?";
		
		@SuppressWarnings("deprecation")
		List<Car> carList2 =template.query(sql, new Object[]{model},new BeanPropertyRowMapper<>(Car.class));
		return carList2;
	}

}
