CREATE TABLE Customers
(
    CustomerID   NUMBER(10),
    Name         VARCHAR2(100),
    DOB          DATE,
    Balance      NUMBER(12,2),
    LastModified DATE,

    CONSTRAINT PK_Customers PRIMARY KEY (CustomerID)
);

CREATE TABLE Accounts
(
    AccountID    NUMBER(10),
    CustomerID   NUMBER(10),
    AccountType  VARCHAR2(20),
    Balance      NUMBER(12,2),
    LastModified DATE,

    CONSTRAINT PK_Accounts PRIMARY KEY (AccountID),
    CONSTRAINT FK_Accounts_Customers
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions
(
    TransactionID   NUMBER(10),
    AccountID       NUMBER(10),
    TransactionDate DATE,
    Amount          NUMBER(12,2),
    TransactionType VARCHAR2(10),

    CONSTRAINT PK_Transactions PRIMARY KEY (TransactionID),
    CONSTRAINT FK_Transactions_Accounts
        FOREIGN KEY (AccountID)
        REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans
(
    LoanID       NUMBER(10),
    CustomerID   NUMBER(10),
    LoanAmount   NUMBER(12,2),
    InterestRate NUMBER(5,2),
    StartDate    DATE,
    EndDate      DATE,

    CONSTRAINT PK_Loans PRIMARY KEY (LoanID),
    CONSTRAINT FK_Loans_Customers
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees
(
    EmployeeID NUMBER(10),
    Name       VARCHAR2(100),
    Position   VARCHAR2(50),
    Salary     NUMBER(12,2),
    Department VARCHAR2(50),
    HireDate   DATE,

    CONSTRAINT PK_Employees PRIMARY KEY (EmployeeID)
);