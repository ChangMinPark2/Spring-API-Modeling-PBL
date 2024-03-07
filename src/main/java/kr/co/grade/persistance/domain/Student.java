package kr.co.grade.persistance.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Student {
    private static Long idCounter = 0L;
    private final Long id;
    private final String name;
    private final int grade;

    private Student(String name, int grade) {
        this.id = ++idCounter;
        this.name = name;
        this.grade = grade;
    }

    public static Student create(String name, int grade) {
        return new Student(name, grade);
    }
}
