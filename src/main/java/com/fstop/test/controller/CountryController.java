package com.fstop.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fstop.test.entity.country;
import com.fstop.test.service.CountryService;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/test")
@Slf4j
public class CountryController {
	@Autowired
	CountryService countryS;
	private String message = "Pages";

	@GetMapping("/test")
	public String index(Map<String, Object> model) {
		log.info("TEST controller");
		this.message = "請輸入ID and NAME:";
		model.put("message", this.message);
		return "test";

	}

	@RequestMapping("/result")
	public String saveData(@RequestParam Map<String, Object> test, Map<String, Object> model) {
		log.info("result controller");
		this.message = "確認ID and NAME";
		if (test.get("id").equals("123")|| test.get("name").equals("wayne")){
			log.info("details controller");
			List list = countryS.getCountryList();
			model.put("list", list);
			return "manage";
		}else{
			model.put("message", this.message);
			country saveCou = new country((String) test.get("id"), (String) test.get("name"));
			countryS.createCountry(saveCou);
			model.put("id", test.get("id"));
			model.put("name", test.get("name"));
			return "result";
		}
	}

	@PostMapping("/details")
	public String Data(Map<String, Object> model) {
		log.info("details controller");
		List list = countryS.getCountryList();
		model.put("list", list);
		return "details";
	}

//	//修改資料
	@PostMapping("/update/{id}")
	public String updateData(@PathVariable("id") String id, Map<String, Object> model) {
		log.info("Update Data");
		this.message = "修改資料";
		country updateCou = countryS.egtCoun(id);
		model.put("message", this.message);
		model.put("id", updateCou.getId());
		model.put("name", updateCou.getName());
		return "test";
	}

	//刪除資料
	@PostMapping("/delete/{id}")
	public String deleteData(@PathVariable("id") String id, Map<String, Object> model) {
		log.info("All Datas");
		this.message = "使用者資料";
		countryS.deleteById(id);
		List<country> list = countryS.getCountryList();
		model.put("message", this.message);
		model.put("list", list);
		return "manage";
	}


}
