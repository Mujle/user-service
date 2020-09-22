create table role (
id int not null auto_increment,
role varchar(255),
user_id integer,
primary key (id)
) engine=InnoDB;

create table user (
id int not null auto_increment,
first_name varchar(255),
last_name varchar(255),
password varchar(255),
user_name varchar(255),
primary key (id)
) engine=InnoDB;

alter table role
add constraint FK61g3ambult7v7nh59xirgd9nf
foreign key (user_id)
references user (id);