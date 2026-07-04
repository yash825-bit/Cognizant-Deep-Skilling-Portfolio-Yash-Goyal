CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP CHAR(1)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    CONSTRAINT fk_customer
        FOREIGN KEY (CustomerID)
        REFERENCES Customers (CustomerID)
);