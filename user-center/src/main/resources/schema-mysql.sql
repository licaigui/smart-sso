CREATE TABLE `user` (
                        id INT NOT NULL AUTO_INCREMENT,
                        name varchar(100),
                        email VARCHAR(100),
                        password VARCHAR(100),
                        create_DATE date,
                        status int,
                        PRIMARY key(id, email)
    )engine=INNODB default charset=utf8;

create table role(
                     id int not null auto_increment,
                     role varchar(100),
                     description varchar(500),
                     primary key(id, role)
                 )engine=INNODB default charset=utf8;

create table user_role(
                          user_id varchar(100),
                          role_id varchar(100),
                          primary key(user_id, role_id)
)engine=INNODB default charset=utf8;