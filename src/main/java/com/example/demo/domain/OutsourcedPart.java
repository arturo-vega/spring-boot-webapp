package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("2")
public class OutsourcedPart extends Part{
    String companyName;

    long partId;
    public OutsourcedPart(){}

    public OutsourcedPart(long partId, String name, String companyName, double price, int inv, int invMax, int invMin) {
        this.partId = partId;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.inv = inv;
        this.invMax = invMax;
        this.invMin = invMin;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getPartId() {
        return partId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }
}
