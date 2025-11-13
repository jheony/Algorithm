SELECT ins.animal_id, ins.name
FROM ANIMAL_INS as ins 
left join ANIMAL_OUTS as outs on 
ins.ANIMAL_ID = outs.ANIMAL_ID
where ins.datetime > outs.datetime
order by ins.datetime