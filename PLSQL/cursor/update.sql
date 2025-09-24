DECLARE
CURSOR prod_cursor IS
SELECT pid, price FROM product WHERE price < 5000;
v_pid product.pid%TYPE;
v_price product.price%TYPE;
BEGIN
OPEN prod_cursor;
LOOP 
FETCH prod_cursor INTO v_pid, v_price;
 EXIT WHEN prod_cursor%NOTFOUND;
UPDATE product 
SET price= v_price* 1.10 
WHERE pid= v_pid; 
END LOOP;
CLOSE prod_cursor;
COMMIT;
DBMS_OUTPUT.PUT_LINE('Prices updated.');
END;
/
