SELECT s.student_id,s.student_name ,sub.subject_name, COUNT(e.student_id) as attended_exams
FROM STUDENTS s 
CROSS JOIN  SUBJECTS sub
LEFT JOIN  EXAMINATIONS e
on s.student_id=e.student_id and e.subject_name=sub.subject_name
GROUP BY s.student_id,s.student_name,sub.subject_name
ORDER BY s.student_id,sub.subject_name;