-- 코드를 입력하세요
SELECT DISTINCT CRC.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR AS CRC INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS CRH
ON CRC.CAR_ID = CRH.CAR_ID
WHERE CRC.CAR_TYPE = "세단" AND MONTH(CRH.START_DATE) = 10
ORDER BY CRC.CAR_ID DESC