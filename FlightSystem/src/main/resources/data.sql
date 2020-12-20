SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE airways(
   airwayid INT NOT NULL AUTO_INCREMENT,
   brand VARCHAR(100)  NOT NULL,
   PRIMARY KEY ( airwayid )
);

CREATE TABLE flight (
    Fid INT AUTO_INCREMENT,
	Fromm VARCHAR(100),
	too VARCHAR(100),
	aid INT ,
	PRIMARY KEY (`Fid`),
	FOREIGN KEY (`aid`) REFERENCES `airways` (`airwayid`)
 
);
  


CREATE TABLE tickets(
   tid INT  ,
   FlyNo INT  ,
   PRIMARY KEY ( `tid`),
   FOREIGN KEY (`FlyNo`) REFERENCES `flight` (`Fid`) 
	
   
);

CREATE TABLE airports(
   portid INT   AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   PRIMARY KEY ( portid )
);

SET FOREIGN_KEY_CHECKS = 1;