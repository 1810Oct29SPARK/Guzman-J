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





