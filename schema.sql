CREATE DATABASE IF NOT EXISTS pwmanager;
USE pwmanager;

DROP TABLE IF EXISTS Passwords CASCADE;
DROP TABLE IF EXISTS Folders CASCADE;
DROP TABLE IF EXISTS Users CASCADE;

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
inputpassword  VARCHAR(100),
username  VARCHAR(100),
pw_for VARCHAR(255),
folder_id INTEGER,
uid INTEGER NOT NULL,
CONSTRAINT passwords_pk PRIMARY KEY (pid),
FOREIGN KEY (folder_id) REFERENCES Folders (folder_id) ON DELETE CASCADE,
FOREIGN KEY (uid) REFERENCES Users (uid)
);

INSERT INTO users VALUES(1,'john','smith','john123@gmail.com','password123');
INSERT INTO users VALUES(2,'mary','jane','maryjane@gmail.com','password');
INSERT INTO folders VALUES(1,'johnFolder1',1);
INSERT INTO folders VALUES(2,'johnFolder2',1);
INSERT INTO passwords VALUES(1,'gmailpassword','gmailusername','gmail',1,1);
INSERT INTO passwords VALUES(2,'yahoopassword','yahoousername','yahoo',1,1);
