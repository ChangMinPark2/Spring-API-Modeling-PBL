package kr.co.grade.persistance.repository;

import kr.co.grade.persistance.domain.Student;

import java.util.List;

public interface StudentRepository {
    //이름과 성적을 받아 회원을 저장한다.
    void save(Student student);

    //특정 성적을 받아 해당 성적의 학생만 조회한다.
    Student findByGrade(int grade);

    //2번 입력된 성적들을 통해 학생들을 조회한다. 성적을 오름차순으로 조회가 되어야 한다.
    List<Student> findAllByGrade(List<Integer> grades);
}
