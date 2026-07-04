SET SERVEROUTPUT ON;

DECLARE
BEGIN
    FOR customer IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF customer.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = customer.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ID ' || customer.CustomerID || ' promoted to VIP.'
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/