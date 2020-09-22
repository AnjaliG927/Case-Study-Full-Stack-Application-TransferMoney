INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(1,'AnjaliG','Anjali','G','abcdefg','abc@123.com',DATE '2013-12-3','F');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(2,'Sammyk','Sammy','K','qwertyu','def@456.com',DATE '1978-2-8','M');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(3,'GarryH','Garry','H','iop34as','ghi@789.com',DATE '1983-1-10','M');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(4,'CarolM','Carrol','M','deftgy45','carolM@yahoo.com',DATE '1993-2-7','F');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(5,'Micheal','Mickey','T','mickey654','mickey@wertty.com',DATE '2013-12-8','M');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(6,'SoniaBlue','Sonia','Bruce','soniabruce','sonia@bruce.com',DATE '2014-11-6','F');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(7,'MariaF','Maria','Fred','vfrbgt456','maria@fred.com',DATE '2013-12-3','F');
INSERT INTO user_table (userid,username,firstName,lastName,password,email,birthdate,gender)
VALUES(8,'AnishkaH','Anishka','Hari','zaqxsw123','anishkaH@hari.com',DATE '1997-4-2','F');


----------------------------------------------------------------------------------------------------
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (1,'123456','ABC');
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (2,'245678','BCD');
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (3,'986532','DEF');
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (4,'567297','HYJ');
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (5,'764208','KIL');
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (6,'240623','NHY');
INSERT into recipient_details (recipient_id,recipient_acc_num,recipient_bank_name)
VALUES (7,'307426','CDF');

-------------------------------------------------------------------------------------------------------------------------

Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (1,45.24,'USA','AUSTRALIA','delivered',DATE '2015-12-17',2,1);
Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (2,73.24,'USA','INDIA','pending',DATE '2014-10-14',3,2);
Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (3,30.45,'USA','UAE','delivered',DATE '1995-2-16',1,3);
Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (4,1.82,'USA','CANADA','delivered',DATE '1945-12-17',4,4);
Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (5,20.2,'USA','AUSTRALIA','delivered',DATE '1975-11-1',4,3);
Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (6,51.2,'USA','CHINA','delivered',DATE '2015-4-27',2,2);
Insert into transaction_details (transaction_id,exchangerate,fromcountry,tocountry,status,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (7,62.14,'USA','PHILIPPINES','delivered',DATE '2019-12-31',1,1);


------------------------------------------------------------------------------------------------------------------------



