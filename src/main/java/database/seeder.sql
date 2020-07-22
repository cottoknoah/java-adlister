USE adlister_db;

TRUNCATE users;
TRUNCATE ads;

INSERT INTO users (id, username, email, password) VALUES (1, 'UsernameOne', 'username1@yahoo.com', 'strongerpassword');
INSERT INTO users (id, username, email, password) VALUES (2, 'UsernameTwo', 'username2@yahoo.com', 'strongerrpassword');
INSERT INTO users (id, username, email, password) VALUES (3, 'UsernameThree', 'username3@yahoo.com', 'strongerrrpassword');
INSERT INTO users (id, username, email, password) VALUES (4, 'UsernameFour', 'username4@yahoo.com', 'strongerrrrpassword');


INSERT INTO ads (id, user_id, title, description) VALUES (1, 1, 'GAMEBOY Advance SP', 'Upgraded sixth-generation handheld gaming console released February 2003');
INSERT INTO ads (id, user_id, title, description) VALUES (2, 1,'GAMEBOY Advance', 'Released in Japan March 21st, 2001');
INSERT INTO ads (id, user_id, title, description) VALUES (3, 1,'GAMEBOY Advance SP', 'Sixth-generation handheld gaming console');
INSERT INTO ads (id, user_id, title, description) VALUES (4, 1,'GAMEBOY Advance SP', 'Sixth-generation handheld gaming console');


# only one user so one user_id ?
# Cannot truncate a table referenced in a foreign key constraint (`adlister_db`.`ads`, CONSTRAINT `ads_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `adlister_db`.`users` (`id`))
# TRUNCATE ads
