create or replace trigger backup
before update or delete on clientmaster
for each row
begin
insert into auditt values(:old.srno,:old.name,:old.address);
end;
/