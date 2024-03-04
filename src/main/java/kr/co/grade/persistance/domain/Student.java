package kr.co.grade.persistance.domain;

import lombok.Getter;

@Getter
public class Student {
    private static Long idCounter = 0L;
    private final Long id;
    private final String name;
    private final int score;

    public Student(String name, int score) {
        this.id = ++idCounter;
        this.name = name;
        this.score = score;
    }
}
