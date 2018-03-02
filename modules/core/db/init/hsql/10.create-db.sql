-- begin CEMTN_CUSTOMER
create table CEMTN_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CEMTN_CUSTOMER
-- begin CEMTN_TELEPHONE_NUMBER
create table CEMTN_TELEPHONE_NUMBER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36) not null,
    NUMBER_ varchar(255) not null,
    NUMBER_TYPE integer,
    --
    primary key (ID)
)^
-- end CEMTN_TELEPHONE_NUMBER
