package com.github.edimirj.citiesapi;

import java.util.List;
import com.github.edimirj.citiesapi.countries.Country;
import com.github.edimirj.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/countries")
public class CountryResource {
    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }
}
