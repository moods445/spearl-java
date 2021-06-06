create table if not exists questions_simple (
    id bigint not null primary key AUTO_INCREMENT,
    question varchar(255) not null comment '问题',
    answer_type varchar(85) not null comment '类型',
    answer varchar(255) not null comment '答案',
    tag varchar(85) not null comment '标签',
    categories varchar(85) not null comment '分类',
    creator_id bigint not null default '-1' comment '创建人id',
    version bigint not null default '1' comment '乐观锁版本号',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);