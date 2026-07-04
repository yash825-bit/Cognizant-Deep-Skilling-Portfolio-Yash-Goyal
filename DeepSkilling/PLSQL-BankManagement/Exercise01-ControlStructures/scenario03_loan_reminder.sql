SET SERVEROUTPUT ON;

BEGIN

    FOR loan IN (

        SELECT LoanID,
               CustomerID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer ID '
            || loan.CustomerID
            || ' has Loan ID '
            || loan.LoanID
            || ' due on '
            || TO_CHAR(loan.DueDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/