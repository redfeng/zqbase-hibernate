CREATE TABLE sys_user (
	id INTEGER NOT NULL AUTO_INCREMENT,
	username varchar(100) NOT NULL,
	password varchar(100) NOT NULL,
	CONSTRAINT sys_user_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;

CREATE TABLE sys_role (
	id INTEGER NOT NULL AUTO_INCREMENT,
	rolename varchar(100) NOT NULL,
	CONSTRAINT sys_role_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;


CREATE TABLE sys_user_role (
	user_id INTEGER NOT NULL,
	role_id INTEGER NOT NULL,
	CONSTRAINT sys_user_role_pk PRIMARY KEY (user_id,role_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;


CREATE TABLE sys_permission (
	id INTEGER NOT NULL,
	permissionname varchar(100) NOT NULL,
	role_id INTEGER NOT NULL,
	CONSTRAINT sys_permission_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
