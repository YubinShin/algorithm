-- 코드를 입력하세요
SELECT  UGB.TITLE, UGB.BOARD_ID, UGR.REPLY_ID, UGR.WRITER_ID, UGR.CONTENTS, date_format(UGR.CREATED_DATE, "%Y-%m-%d") AS CREATED_DATE
FROM USED_GOODS_BOARD UGB
JOIN (
SELECT BOARD_ID, REPLY_ID, WRITER_ID , CONTENTS, CREATED_DATE 
    FROM USED_GOODS_REPLY
) AS UGR 
WHERE UGB.CREATED_DATE >= '2022-10-01' 
AND UGB.CREATED_DATE < '2022-11-01'
AND UGB.BOARD_ID = UGR.BOARD_ID
ORDER BY UGR.CREATED_DATE, UGB.TITLE;

--  작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일


-- , WRITER_ID, , CONTENTS, PRICE, CREATED_DATE, STATUS, VIEWS
-- USED_GOODS_REPLY 테이블은 다음과 같으며 
-- , , , ,