package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityId;
    @Column( nullable = false)
    private String cityName;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    List<Location> location;


    public City() {
    }

    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }
}
