package com.fstop.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstop.test.dao.countryDao;
import com.fstop.test.entity.country;


@Service
public class CountryService {

	@Autowired
	private countryDao countrydao;

//	public country getCountryData(int id) {
//		Optional<country> stu = countrydao.findById((long) id);
//		return stu.get();
//	}

	//	新增
	public country createCountry(country country) {

		return countrydao.save(country);
	}

	//得到全部資料
	public List<country> getCountryList() {

		return countrydao.findAll();
	}

    //修改資料
    public String upDateCountry(country country) {
        countrydao.save(country);
        return "ok";
    }

    //刪除資料
    public String deleteById(String id) {
        countrydao.deleteById(id);
        return "ok";
    }
    //找ID
	public country egtCoun(String id){
		return countrydao.getById(id);
	}
}
