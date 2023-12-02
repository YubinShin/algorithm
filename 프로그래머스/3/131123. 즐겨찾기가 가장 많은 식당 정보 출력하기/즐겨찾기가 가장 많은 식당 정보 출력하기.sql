SELECT RI.FOOD_TYPE, RI.REST_ID, RI.REST_NAME, RI.FAVORITES
FROM REST_INFO RI
-- 쿼리에서 REST_INFO RI라고 쓰여 있으면, REST_INFO 테이블에 RI라는 별칭을 지정한 것입니다. 
JOIN (
        SELECT FOOD_TYPE, MAX(FAVORITES) AS FAVORITES
        FROM REST_INFO
        GROUP BY FOOD_TYPE
) AS MaxFav 
-- 서브쿼리 + AS 로 새로운 테이블을 만든 것
ON RI.FOOD_TYPE = MaxFav.FOOD_TYPE  
-- ON 키워드 join 할때 RI.FOOD_TYPE = MaxFav.FOOD_TYPE이 일치하는 것을 찾겠다는 조건
AND RI.FAVORITES = MaxFav.FAVORITES
ORDER BY RI.FOOD_TYPE DESC;

-- 쿼리에서 특정 JOIN 유형을 명시하지 않았다면, SQL은 자동으로 INNER JOIN을 사용합니다. 
-- INNER JOIN은 두 테이블 간의 정확한 일치를 찾는데 사용됩니다.