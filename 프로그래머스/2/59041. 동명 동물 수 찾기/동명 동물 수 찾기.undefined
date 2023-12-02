SELECT NAME, COUNT(NAME) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(NAME) >= 2
ORDER BY NAME ASC;

# SELECT NAME, COUNT(NAME) AS COUNT
-- 결과로 조회할 부분

# FROM ANIMAL_INS
-- 쿼리가 조회할 테이블 지정

# WHERE NAME IS NOT NULL
-- NULL 이 아닌 행을 고른다

# GROUP BY NAME
-- GROUP BY 절은 지정된 열의 값에 따라 결과 세트를 그룹화합니다.
-- NAME 의 값에 따라 결과 세트를 그룹화 한다.
-- 여기서 COUNT(NAME)는 NAME 열의 전체 개수를 계산합니다. 
-- GROUP BY 절이 없다면 전체 테이블에 대해 NAME 열의 개수를 단일 값으로 계산합니다.

# HAVING COUNT(NAME) >= 2
-- HAVING 은 GROUP BY 의 부하입니다.
-- 새로 생성한 그룹 중 조건에 부합하는 것들만 남겨둡니다.
-- 각 그룹에 대한 집계 결과는 임시 결과 세트에 저장됩니다. 이 세트는 NAME 열의 값과 해당 이름이 나타난 횟수를 포함합니다.

# ORDER BY NAME ASC;
-- 각 그룹에 대한 집계 결과는 임시 결과 세트에 저장됩니다. 
-- 이 세트는 NAME 열의 값과 해당 이름이 나타난 횟수를 포함합니다.
