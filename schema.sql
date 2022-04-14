CREATE DATABASE IF NOT EXISTS pwmanager;
USE pwmanager;


CREATE TABLE Users (
uid int4 AUTO_INCREMENT,
first_name VARCHAR(100),
last_name VARCHAR(100),
email varchar(255) UNIQUE,
password varchar(255) NOT NULL,
CONSTRAINT users_pk PRIMARY KEY (uid)
);

CREATE TABLE Folders(
folder_id int4 AUTO_INCREMENT,
fname VARCHAR(100),
uid INTEGER NOT NULL,
PRIMARY KEY (folder_id),
FOREIGN KEY (uid) REFERENCES Users(uid)
);

CREATE TABLE Passwords(
pid int4 AUTO_INCREMENT,
password  VARCHAR(100),
username  VARCHAR(100),
pw_for VARCHAR(255),
folder_id INTEGER NOT NULL,
uid INTEGER NOT NULL,
CONSTRAINT passwords_pk PRIMARY KEY (pid),
FOREIGN KEY (folder_id) REFERENCES Folders (folder_id) ON DELETE CASCADE,
FOREIGN KEY (uid) REFERENCES Users (uid)
);
