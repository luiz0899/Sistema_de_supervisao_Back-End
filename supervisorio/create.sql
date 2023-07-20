create table login (id bigserial not null, email varchar(255) not null unique, password varchar(255) not null unique, primary key (id));
create table operation_water_pump (id serial not null, manual boolean not null, solenoid boolean not null, water_pump boolean not null, primary key (id));
create table water_level (fluxostato_reading float(53) not null, id serial not null, water_level_reading float(53) not null, primary key (id));
