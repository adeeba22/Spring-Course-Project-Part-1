package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId;
    @Column( nullable = false)
    private String locationName;
    @Column( nullable = false)
    private String address;
    @Column( nullable = false)
    private int cityId;
    @Column( nullable = false)
    private String pincode;
    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
    List<Vehicle> vehicle;
    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
    List<Booking> booking;
    @ManyToOne
    private City city;

    public Location() {
    }

    public Location(int locationId, String locationName, String address, int cityId, String pincode) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.address = address;
        this.cityId = cityId;
        this.pincode = pincode;
    }
}
