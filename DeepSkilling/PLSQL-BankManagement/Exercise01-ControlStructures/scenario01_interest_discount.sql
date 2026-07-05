SET SERVEROUTPUT ON;

BEGIN

    FOR customer IN
    (
        SELECT CustomerID,
               DOB
        FROM Customers
    )

    LOOP

        IF TRUNC(MONTHS_BETWEEN(SYSDATE, customer.DOB) / 12) > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount of 1% applied to Customer ID '
                || customer.CustomerID
            );

        END IF;

    END LOOP;

END;
/