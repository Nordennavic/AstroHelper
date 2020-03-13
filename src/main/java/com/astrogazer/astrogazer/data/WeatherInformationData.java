package com.astrogazer.astrogazer.data;

import com.astrogazer.astrogazer.model.WeatherInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherInformationData extends JpaRepository<WeatherInformation, Integer> {
}
