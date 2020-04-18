package com.astrogazer.astrogazer.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class WeatherInformation {
    //TODO: этот класс будет храниться в базе, нужно включить сюда какую-то информацию

    @Id
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;//кстати, в Java надо всегда писать private - по умолчанию там другое

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
