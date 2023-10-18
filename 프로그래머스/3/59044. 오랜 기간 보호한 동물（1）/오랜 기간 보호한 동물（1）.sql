-- 코드를 입력하세요
SELECT AI.NAME, AI.DATETIME
FROM ANIMAL_INS AS AI LEFT JOIN ANIMAL_OUTS AS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE AO.DATETIME IS NULL
ORDER BY DATETIME LIMIT 3