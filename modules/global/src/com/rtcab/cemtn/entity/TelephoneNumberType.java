package com.rtcab.cemtn.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TelephoneNumberType implements EnumClass<Integer> {

    HOME(10),
    MOBILE(20),
    WORK(30),
    OTHER(40);

    private Integer id;

    TelephoneNumberType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TelephoneNumberType fromId(Integer id) {
        for (TelephoneNumberType at : TelephoneNumberType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}