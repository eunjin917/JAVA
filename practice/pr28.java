package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 미니프로젝트 5. 성적관리 프로그램
// https://codinggangsa.notion.site/60c14be913f342b79f5360ebdfe3aad3

class Student {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    void printInfo() {
        int totalScore = koreanScore+englishScore+mathScore;
        double averageScore = totalScore/3.0;

        System.out.print("이름: " + name + " ");
        System.out.print("국어: " + koreanScore + " ");
        System.out.print("영어: " + englishScore + " ");
        System.out.print("수학: " + mathScore + " ");
        System.out.print("총점: " + totalScore + " ");
        System.out.println("평균: " + averageScore);
    }

    public String getName() {
        return name;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}

public class pr28 {
    static List<Student> students = new ArrayList<Student>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------성적 관리 프로그램-------------");
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : ");
            int selectWay = scanner.nextInt();
            switch (selectWay) {
                case 1: {
                    addStudent();
                    break;
                }
                case 2: {
                    printStudents();
                    break;
                }
                case 3: {
                    findStudent();
                    break;
                }
                case 4: {
                    editStudent();
                    break;
                }
                case 5: {
                    deleteStudent();
                    break;
                }
                case 6: {
                    System.out.println("종료!!");
                    return;
                }
            }
        }
    }

    static Student findStudent(String name) {
        for (Student student : students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    static boolean isEmptyStudents() {
        if (students.size() == 0) {
            return true;
        }
        return false;
    }

    static boolean isInStudents(Student student) {
        if (student == null) {
            return false;
        }
        return true;
    }

    static void addStudent() {
        System.out.print("이름 입력 : ");
        String name = scanner.next();
        Student student = findStudent(name);
        if (isInStudents(student)) {
            System.out.println("이미 등록된 학생입니다.");
            return;
        }

        System.out.print("국어점수 입력 : ");
        int koreanScore = scanner.nextInt();
        System.out.print("영어점수 입력 : ");
        int englishScore = scanner.nextInt();
        System.out.print("수학점수 입력 : ");
        int mathScore = scanner.nextInt();

        students.add(new Student(name, koreanScore, englishScore, mathScore));
    }

    static void printStudents() {
        if (isEmptyStudents()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        for (Student student : students) {
            student.printInfo();
        }
    }

    static void findStudent() {
        if (isEmptyStudents()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.print("검색할 사람의 이름 : ");
        String name = scanner.next();
        Student student = findStudent(name);
        if (!isInStudents(student)) {
            System.out.println("등록되지 않은 학생입니다.");
            return;
        }

        student.printInfo();
    }

    static void editStudent() {
        if (isEmptyStudents()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.print("수정할 사람의 이름 : ");
        String name = scanner.next();
        Student student = findStudent(name);
        if (!isInStudents(student)) {
            System.out.println("등록되지 않은 학생입니다.");
            return;
        }

        System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 : ");
        int selectSubject = scanner.nextInt();
        switch (selectSubject) {
            case 1: {
                System.out.print("국어점수 수정 : ");
                int score = scanner.nextInt();
                student.setKoreanScore(score);
                break;
            }
            case 2: {
                System.out.print("영어점수 수정 : ");
                int score = scanner.nextInt();
                student.setEnglishScore(score);
                break;
            }
            case 3: {
                System.out.print("수학점수 수정 : ");
                int score = scanner.nextInt();
                student.setMathScore(score);
                break;
            }
        }
    }

    static void deleteStudent() {
        if (isEmptyStudents()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.print("삭제할 사람의 이름 : ");
        String name = scanner.next();
        Student student = findStudent(name);
        if (!isInStudents(student)) {
            System.out.println("등록되지 않은 학생입니다.");
            return;
        }

        students.remove(student);
    }

}
