INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('TransferMoney','Transfer','G','TransferMoney','abc@123.com',DATE '2013-12-3','F');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('Sammyk','Sammy','K','qwertyu','def@456.com',DATE '1978-2-8','M');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('GarryH','Garry','H','iop34as','ghi@789.com',DATE '1983-1-10','M');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('CarolM','Carrol','M','deftgy45','carolM@yahoo.com',DATE '1993-2-7','F');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('Micheal','Mickey','T','mickey654','mickey@wertty.com',DATE '2013-12-8','M');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('SoniaBlue','Sonia','Bruce','soniabruce','sonia@bruce.com',DATE '2014-11-6','F');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('MariaF','Maria','Fred','vfrbgt456','maria@fred.com',DATE '2013-12-3','F');
INSERT INTO user_table (username,firstName,lastName,password,email,birthdate,gender)
VALUES('AnishkaH','Anishka','Hari','zaqxsw123','anishkaH@hari.com',DATE '1997-4-2','F');


----------------------------------------------------------------------------------------------------
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('123456','ABC','Maggi');
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('245678','BCD','Mahim');
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('986532','DEF','Gary');
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('567297','HYJ','Stephe');
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('764208','KIL','Maria');
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('240623','NHY','Connor');
INSERT into recipient_details (recipient_acc_num,recipient_bank_name,recipientname)
VALUES ('307426','CDF','Tania');

-------------------------------------------------------------------------------------------------------------------------

Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (45.24,'USA','AUSTRALIA','delivered',1000,DATE '2015-12-17',2,1);
Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (73.24,'USA','INDIA','pending',5000,DATE '2014-10-14',3,2);
Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (30.45,'USA','UAE','delivered',7000,DATE '1995-2-16',1,3);
Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (1.82,'USA','CANADA','delivered',1200,DATE '1945-12-17',4,4);
Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (20.2,'USA','AUSTRALIA','delivered',9000,DATE '1975-11-1',4,3);
Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (51.2,'USA','CHINA','delivered',3000,DATE '2015-4-27',2,2);
Insert into transaction_details (exchangerate,fromcountry,tocountry,status,amount,transactiondate,recipientdetails_recipient_id,user_userid)
VALUES (62.14,'USA','PHILIPPINES','delivered',7500,DATE '2019-12-31',1,1);


------------------------------------------------------------------------------------------------------------------------



