package com.github.edimirj.citiesapi.countries.repository;

import com.github.edimirj.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
