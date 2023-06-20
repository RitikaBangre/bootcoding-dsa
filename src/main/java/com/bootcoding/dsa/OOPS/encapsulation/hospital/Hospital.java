package com.bootcoding.dsa.OOPS.encapsulation.hospital;

import java.util.UUID;

public class Hospital {
    private String name;
    private UUID id;
    private String address;
    private String service;

    public void setName(String name) {
        this.name = name;
        //return name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;

    }
}
