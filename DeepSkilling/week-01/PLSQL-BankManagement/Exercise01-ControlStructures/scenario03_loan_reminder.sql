SET SERVEROUTPUT ON;

BEGIN

    FOR loan IN
    (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate <= SYSDATE + 30
    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || loan.CustomerID
            || ' has Loan '
            || loan.LoanID
            || ' due on '
            || TO_CHAR(loan.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/