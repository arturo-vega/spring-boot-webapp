package com.example.demo.domain;

import com.example.demo.repositories.InhousePartRepository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("1")
public class InhousePart extends Part{

    long partId;
    public InhousePart() {

    }

    public InhousePart(long partId, String name, double price, int inv, int invMax, int invMin) {
        this.partId = partId;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.invMax = invMax;
        this.invMin = invMin;
    }


    public long getPartId() {
        return partId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }
}
