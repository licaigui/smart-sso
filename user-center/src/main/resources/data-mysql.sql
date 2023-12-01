#user
INSERT into user (id, name, email, password, status) values (1, '大机巴', 'dajiba@spacex.com', 'jiba123', 0);
INSERT into user (id, name, email, password, status) values (2, '狗几把', 'gouzazhong@spacex.com', 'jiba123', 1);
INSERT into user (id, name, email, password, status) values (3, '草拟吗', 'caonima@spacex.com', 'jiba123', 2);

#role
insert into role(id, role, description) values('1', 'admin', '管理员，可以管其他角色，及所有系统设置。');
insert into role(id, role, description) values('2', 'seller', '销售员，可以创建订单。');
insert into role(id, role, description) values('3', 'deliver', '送货员，送货后关闭订单。');

#user_role
insert into user_role(user_id, role_id) values(1, 1);
insert into user_role(user_id, role_id) values(2, 2);
insert into user_role(user_id, role_id) values(3, 3);
