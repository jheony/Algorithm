SELECT ANIMAL_ID, name, CASE
    WHEN SEX_UPON_INTAKE like "Neutered%" then  "O"
    WHEN SEX_UPON_INTAKE like "Spayed%" then  "O"
    ELSE "X"
END AS "중성화"
FROM ANIMAL_INS
