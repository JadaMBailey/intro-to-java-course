CREATE database if NOT EXISTS InstaBook;
USE InstaBook;
CREATE TABLE Profiles(
	ProfileId int NOT NULL auto_increment primary KEY,
    FullName VARCHAR(255) NOT NULL,
    UserHandle VARCHAR(255) NOT NULL,
    EmailAddress VARCHAR(255) NOT NULL,
    Description VARCHAR(1000) NULL,
    Picture VARCHAR(500) NULL
    );
    insert into Profiles
    (FullName,UserHandle,EmailAddress,Description,Picture)
    
    Values
    ('Dr. Marian Rogers Croak','marianR', 'mariancroak@engineering.com','So be yourself.','marian.jpg'
    ),
    ('Jada Bailey','JadaB','jada.baileyk@engineering.com','Im alive and well','jada.jpg'
    );
    
CREATE TABLE Posts (
	PostId int NOT NULL auto_increment primary KEY,
    ProfileId int NOT NULL,
    PostDate datetime NOT NULL,
    postPicture varchar(500) NOT NULL,
    PostCaption VARCHAR(255) NULL
);

CREATE TABLE Comments(
   CommentId    bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
   PostId       bigint NOT NULL ,
   ProfileId    int NOT NULL ,
   CommentDate  datetime NOT NULL,
   CommentText  varchar(1000) NULL
 );
 
 ALTER TABLE Posts    ADD CONSTRAINT FK_PostProfile FOREIGN KEY (ProfileId) REFERENCES Profiles(ProfileId);
ALTER TABLE Comments ADD CONSTRAINT FK_CommentPost FOREIGN KEY (PostId) REFERENCES Posts(PostId);
ALTER TABLE Comments ADD CONSTRAINT FK_CommentProfile FOREIGN KEY (ProfileId) REFERENCES Profiles(ProfileId);

INSERT INTO Profiles(FullName,UserHandle,EmailAddress,Description,Picture) VALUES('serena williams','serenawilliams','serena@tennis.com','I''m Olympia''s mom. @serena ships WORLDWIDE www.serenawilliams.com','serena.jpg');
INSERT INTO Profiles(FullName,UserHandle,EmailAddress,Description,Picture) VALUES('Beyoncé Giselle Knowles-Carter','beyoncé','bey@sashafierce.com','tiny.cc/6y3mnz','beyonce.png');
INSERT INTO Profiles(FullName,UserHandle,EmailAddress,Description,Picture) VALUES('Jane Doe','janedow','janedoe@gmail.com',NULL,NULL);

INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(1,'2019/01/24','Instafab.acs73d','Best tennis racket ever');
INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(1,'2020/02/02','Instafab.8iqfa','Picture of me on a magazine');
INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(2,'2020/04/29','Instafab.0d9ass','Jay and me with Blue Ivy');
INSERT INTO Posts(ProfileId,PostDate,PostPicture,PostCaption) VALUES(2,'2020/03/01','Instafab.aoijs','Hi bee hive');

INSERT INTO Comments(PostId,ProfileId,CommentDate,CommentText) VALUES(1,3,'2020/03/11','😍😍😍!');
INSERT INTO Comments(PostId,ProfileId,CommentDate,CommentText) VALUES(3,3,'2020/04/02','🐝😊🥺😉😍😘😚😜😂😝😳😁😣😢');

