package com.shopme.admin.country;

import java.util.List;

import com.shopme.admin.setting.country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shopme.common.entity.Country;

@RestController
public class CountryRestController {
    @Autowired private CountryRepository repo;

    @GetMapping("/countries/list")
    public List<Country> listAll(){
        return repo.findAllByOrderByNameAsc();
    }

    @PostMapping("/countries/save")
    public String save(@RequestBody Country country) {
        Country savedCountry = repo.save(country);
        return String.valueOf(savedCountry.getId());
    }

    @DeleteMapping("/countries/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

}