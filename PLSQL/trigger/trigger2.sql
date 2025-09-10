create or replace trigger errortrigger
before delete or update on auditt
begin
if rtrim(upper(To_char(sysdate,'day')))='WEDNESDAY' then
RAISE_APPLICATION_ERROR(-200000,'cannot perform delete or upadte operation');
end if;
end;
/
