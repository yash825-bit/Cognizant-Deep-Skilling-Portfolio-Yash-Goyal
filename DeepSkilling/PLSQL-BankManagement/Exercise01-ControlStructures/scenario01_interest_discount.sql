DECLARE
BEGIN
    FOR customer IN (
        SELECT CustomerID, Age
        FROM Customers
    )
    LOOP
        IF customer.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount of 1% applied to Customer '
                || customer.CustomerID
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/