package com.bloomtech.associations.restaurants.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    private String type;

    private Set<Restaurant> restaurants = new HashSet<>();

    public Payment()
    {
    }

    public Payment(String type, Set<Restaurant> restaurants) {
        this.type = type;
        this.restaurants = restaurants;
    }

    public Payment(String type)
    {
        this.type = type;
    }

    public long getPaymentid()
    {
        return paymentid;
    }

    public void setPaymentid(long paymentid)
    {
        this.paymentid = paymentid;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Set<Restaurant> getRestaurants()
    {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants)
    {
        this.restaurants = restaurants;
    }
}
