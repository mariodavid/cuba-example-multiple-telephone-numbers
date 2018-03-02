package com.rtcab.cemtn.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|number")
@Table(name = "CEMTN_TELEPHONE_NUMBER")
@Entity(name = "cemtn$TelephoneNumber")
public class TelephoneNumber extends StandardEntity {
    private static final long serialVersionUID = 106426194940949850L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    protected String number;

    @Column(name = "NUMBER_TYPE")
    protected Integer numberType;

    public void setNumberType(TelephoneNumberType numberType) {
        this.numberType = numberType == null ? null : numberType.getId();
    }

    public TelephoneNumberType getNumberType() {
        return numberType == null ? null : TelephoneNumberType.fromId(numberType);
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


}