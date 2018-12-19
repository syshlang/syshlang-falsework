create table user_model
(
  id          int auto_increment comment '用户ID'
    primary key,
  dept_id     int                       null comment '部门ID',
  login_name  varchar(30)               not null comment '登录账号',
  user_name   varchar(30)               not null comment '用户昵称',
  user_type   varchar(2)   default '00' null comment '用户类型（00系统用户）',
  email       varchar(50)  default ''   null comment '用户邮箱',
  phonenumber varchar(11)  default ''   null comment '手机号码',
  sex         char         default '0'  null comment '用户性别（0男 1女 2未知）',
  avatar      varchar(100) default ''   null comment '头像路径',
  password    varchar(50)  default ''   null comment '密码',
  salt        varchar(20)  default ''   null comment '盐加密',
  status      char         default '0'  null comment '帐号状态（0正常 1停用）',
  del_flag    char         default '0'  null comment '删除标志（0代表存在 2代表删除）',
  login_ip    varchar(50)  default ''   null comment '最后登陆IP',
  login_date  datetime                  null comment '最后登陆时间',
  create_by   varchar(64)  default ''   null comment '创建者',
  create_time datetime                  null comment '创建时间',
  update_by   varchar(64)  default ''   null comment '更新者',
  update_time datetime                  null comment '更新时间',
  remark      varchar(500) default ''   null comment '备注'
)
  comment '用户信息表';

