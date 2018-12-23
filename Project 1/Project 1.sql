INSERT ALL 
INTO EMPLOYEE
VALUES (1, 'Michael', 'Scott', 'bestboss@gmail.com', 'Head Supervisor', 'Yes')
INTO EMPLOYEE
VALUES (2, 'Jimmy', 'Rodgers', 'jrodgers@gmail.com', 'Accountant', 'No')
INTO EMPLOYEE
VALUES (3, 'Natalie', 'Stevens', 'natstevens@gmail.com', 'Sales Manager', 'Yes')
INTO EMPLOYEE
VALUES (4, 'John', 'Anderton', 'johnAndton@yahoo.com', 'Accountant', 'No')
INTO EMPLOYEE
VALUES (5, 'Aubrey', 'Graham', 'Drakeheartbreak@yahoo.com', 'Finance Reporter', 'No')
INTO EMPLOYEE
VALUES (6, 'Paul', 'Walker', 'Pdub40@gmail.com', 'Sales Manager', 'Yes')
INTO EMPLOYEE
VALUES (7, 'Jared', 'Thompson', 'jthompson32@yahoo.com', 'Software Developer', 'No')
INTO EMPLOYEE
VALUES (8, 'Matthew', 'Lucio', 'matthewlucio@live.com', 'Security Analyst', 'No')
INTO EMPLOYEE
VALUES (9, 'Matthew', 'Kallead', 'DJKallead30@gmail.com', 'HR analyst', 'No')
INTO EMPLOYEE
VALUES (10, 'Shawn', 'Guerrero', 'ShawnSwole1@yahoo.com', 'Finance reporter', 'No')
INTO EMPLOYEE
VALUES (11, 'Ehsan', 'Arshad', 'jrodgers@gmail.com', 'Accountant', 'No')
INTO EMPLOYEE
VALUES (12, 'Natalie', 'Stevens', 'natstevens@gmail.com', 'Sales Manager', 'Yes')
INTO EMPLOYEE
VALUES (13, 'Ashley', 'Gutierrez', 'ashleyg45@yahoo.com', 'HR analyst', 'No')
INTO EMPLOYEE
VALUES (14, 'Henry', 'Gonzalez', 'HenryGoatGonzelez@outlook.com', 'Senior Security Analyst', 'Yes')
INTO EMPLOYEE
VALUES (15, 'Sarah', 'Barnes', 'sarahbarnes94@gmail.com', 'Accountant', 'No')
INTO EMPLOYEE
VALUES (16, 'Amanda', 'Tovar', 'amandaT22@yahoo.com', 'Financial analyst', 'No')
INTO EMPLOYEE
VALUES (17, 'Brittany', 'Gomez', 'johnAndton@yahoo.com', 'Accountant', 'No')
INTO EMPLOYEE
VALUES (18, 'Misael', 'Benavides', 'mbenavides@gmail.com', 'HR analyst', 'No')
INTO EMPLOYEE
VALUES (19, 'Nick', 'Goodpaster', 'nickgoodpaster2@gmail.com', 'Senior IT Engineer', 'Yes')
INTO EMPLOYEE
VALUES (20, 'Lisa', 'Ramos', 'Lisaaramos24@yahoo.com', 'Accounting Director', 'Yes')
INTO EMPLOYEE
VALUES (21, 'Michelle', 'Williams', 'Michellewilliams13@yahoo.com', 'Software Developer', 'No')
INTO EMPLOYEE
VALUES (22, 'Justin', 'Guzman', 'ws6transam2k2@outlook.com', 'Senior Software Developer', 'Yes')
INTO EMPLOYEE
VALUES (23, 'Joseph', 'Ryan', 'joeryan4life@gmail.com', 'Chief Executive Officer', 'Yes')
INTO EMPLOYEE
VALUES (24, 'Emily', 'Parker', 'johnAndton@yahoo.com', 'Chief Financial Officer', 'Yes')
INTO EMPLOYEE
VALUES (25, 'Josh', 'Reyes', 'reyes28@yahoo.com', 'Chief Technology Officer', 'Yes')
INTO EMPLOYEE
VALUES (26, 'Nathan', 'Carrizales', 'jrodgers@gmail.com', 'Communications Director', 'Yes')
INTO EMPLOYEE
VALUES (27, 'Elliott', 'Soler', 'natstevens@gmail.com', 'Sales Manager', 'Yes')
INTO EMPLOYEE
VALUES (28, 'Christian', 'McCaffrey', 'christianmacc22@yahoo.com', 'HR Supervisor', 'Yes')
INTO EMPLOYEE
VALUES (29, 'Alyssa', 'Tapia', 'alyssaTapia@yahoo.com', 'Accountant', 'No')
INTO EMPLOYEE
VALUES (30, 'Justin', 'Timberlake', 'jtimberlake@yahoo.com', 'Chief Operating Officer', 'Yes')
INTO EMPLOYEE
VALUES (31, 'Nicolas', 'Zaitz', 'NickZaitz84@gmail.com', 'Senior Java Developer', 'Yes')
INTO EMPLOYEE
VALUES (32, 'Emily', 'Parker', 'emilyparker9245@outlook.com', 'Software Developer', 'No')
SELECT * FROM DUAL;

ALTER TABLE REIMBURSEMENTS
ADD DESCRIPTION VARCHAR2(100);
/

CREATE SEQUENCE SQ_REIMBURSEMENT_PK
START WITH 1000
INCREMENT BY 1;
/

CREATE OR REPLACE TRIGGER TR_INSERT_REIMBURSEMENT
BEFORE INSERT ON REIMBURSEMENT
FOR EACH ROW
BEGIN
    SELECT SQ_REIMBURSEMENT_PK.NEXTVAL INTO :NEW.REIMBURSEMENT_ID FROM DUAL;
END;
/

UPDATE EMPLOYEE
SET PASSWORD = 'yDYpU7pH'
WHERE EMPLOYEE_ID = 1;
/
UPDATE EMPLOYEE
SET PASSWORD = 'olxWzKnB'
WHERE EMPLOYEE_ID = 2;
/
UPDATE EMPLOYEE
SET PASSWORD = '649OXkss'
WHERE EMPLOYEE_ID = 3;
/
UPDATE EMPLOYEE
SET PASSWORD = 'bHL2pB3m'
WHERE EMPLOYEE_ID = 4;
/
UPDATE EMPLOYEE
SET PASSWORD = 'Ka6QZVL8'
WHERE EMPLOYEE_ID = 5;
/
UPDATE EMPLOYEE
SET PASSWORD = '9gK41nj2'
WHERE EMPLOYEE_ID = 6;
/
UPDATE EMPLOYEE
SET PASSWORD = 'YRhgVJyi'
WHERE EMPLOYEE_ID = 7;
/
UPDATE EMPLOYEE
SET PASSWORD = 'tAGjusVS'
WHERE EMPLOYEE_ID = 8;
/
UPDATE EMPLOYEE
SET PASSWORD = 'wpPTsLGT'
WHERE EMPLOYEE_ID = 9;
/
UPDATE EMPLOYEE
SET PASSWORD = 'MJCNWfTn'
WHERE EMPLOYEE_ID = 10;
/
UPDATE EMPLOYEE
SET PASSWORD = 'HDhDRh9R'
WHERE EMPLOYEE_ID = 11;
/
UPDATE EMPLOYEE
SET PASSWORD = 'dqaS1rJF'
WHERE EMPLOYEE_ID = 12;
/
UPDATE EMPLOYEE
SET PASSWORD = 'eTNGD8SL'
WHERE EMPLOYEE_ID = 13;
/
UPDATE EMPLOYEE
SET PASSWORD = 'OQr6tR8A'
WHERE EMPLOYEE_ID = 14;
/
UPDATE EMPLOYEE
SET PASSWORD = 'tcO3zTY7'
WHERE EMPLOYEE_ID = 15;
/
UPDATE EMPLOYEE
SET PASSWORD = 'CXyuDwl9'
WHERE EMPLOYEE_ID = 16;
/
UPDATE EMPLOYEE
SET PASSWORD = 'ULpDHFWb'
WHERE EMPLOYEE_ID = 17;
/
UPDATE EMPLOYEE
SET PASSWORD = 'txAXY75P'
WHERE EMPLOYEE_ID = 18;
/
UPDATE EMPLOYEE
SET PASSWORD = 'mbTnsQrS'
WHERE EMPLOYEE_ID = 19;
/
UPDATE EMPLOYEE
SET PASSWORD = 'tRzxSiTu'
WHERE EMPLOYEE_ID = 20;
/
UPDATE EMPLOYEE
SET PASSWORD = 'Xi9DWvEM'
WHERE EMPLOYEE_ID = 21;
/
UPDATE EMPLOYEE
SET PASSWORD = 'J2icjuhW'
WHERE EMPLOYEE_ID = 22;
/
UPDATE EMPLOYEE
SET PASSWORD = 'JoeisGoat4'
WHERE EMPLOYEE_ID = 23;
/
UPDATE EMPLOYEE
SET PASSWORD = 'z0BUIAJE'
WHERE EMPLOYEE_ID = 24;
/
UPDATE EMPLOYEE
SET PASSWORD = 'kjhzWrX9'
WHERE EMPLOYEE_ID = 25;
/
UPDATE EMPLOYEE
SET PASSWORD = 'x59PfBtb'
WHERE EMPLOYEE_ID = 26;
/
UPDATE EMPLOYEE
SET PASSWORD = 'XBS6M9MC'
WHERE EMPLOYEE_ID = 27;
/
UPDATE EMPLOYEE
SET PASSWORD = 'KTJInkTz'
WHERE EMPLOYEE_ID = 28;
/
UPDATE EMPLOYEE
SET PASSWORD = 'bsMWTkPO'
WHERE EMPLOYEE_ID = 29;
/
UPDATE EMPLOYEE
SET PASSWORD = 'bP3DkrRq'
WHERE EMPLOYEE_ID = 30;
/
UPDATE EMPLOYEE
SET PASSWORD = 'uYC8Rbfg'
WHERE EMPLOYEE_ID = 31;
/
UPDATE EMPLOYEE
SET PASSWORD = '1znMqpqU'
WHERE EMPLOYEE_ID = 32;
/

ALTER TABLE EMPLOYEE
ADD PRIMARY KEY (EMPLOYEE_ID);
/
ALTER TABLE REIMBURSEMENTS
ADD FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID);
/

INSERT ALL
INTO REIMBURSEMENTS
VALUES (1, 45.86, 'pending', 1, 'Reimbursing for travel')
INTO REIMBURSEMENTS
VALUES (2, 283.49, 'approved', 2, 'Reimbursing for OT')
INTO REIMBURSEMENTS
VALUES (3, 3917.38, 'pending', 2, 'Reimbursing for OT')
INTO REIMBURSEMENTS
VALUES (4, 291.72, 'denied', 3, 'Medical leave')
INTO REIMBURSEMENTS
VALUES (5, 128.94, 'pending', 4, 'Sick leave')
INTO REIMBURSEMENTS
VALUES (6, 682.01, 'pending', 8, 'Business travel')
INTO REIMBURSEMENTS
VALUES (7, 221.94, 'pending', 5, 'OT')
INTO REIMBURSEMENTS
VALUES (8, 190.93, 'approved', 9, 'Tech Convention')
INTO REIMBURSEMENTS
VALUES (9, 94.28, 'pending', 12, 'Tech Convention')
INTO REIMBURSEMENTS
VALUES (10, 829.39, 'approved', 14, 'Med leave')
INTO REIMBURSEMENTS
VALUES (11, 262.94, 'pending', 5, 'OT')
INTO REIMBURSEMENTS
VALUES (12, 390.93, 'approved', 9, 'Tech Convention')
INTO REIMBURSEMENTS
VALUES (13, 54.28, 'pending', 12, 'Tech Convention')
INTO REIMBURSEMENTS
VALUES (14, 729.39, 'approved', 23, 'Business trip')
INTO REIMBURSEMENTS
VALUES (15, 932.82, 'pending', 23, 'OverTime Prod Week')
INTO REIMBURSEMENTS
VALUES (16, 597.93, 'approved', 23, 'Medical leave')
SELECT * FROM DUAL;
/
