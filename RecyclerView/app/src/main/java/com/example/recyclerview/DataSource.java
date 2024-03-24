package com.example.recyclerview;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Student> students = generateDummyStudents();

    private static ArrayList<Student> generateDummyStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jung Hyun-bin", "Seoul National University", R.drawable.hyun_bin));
        students.add(new Student("Song Hyun-seok", "Seoul National University", R.drawable.hyun_seok));
        students.add(new Student("Kyung Do-hyun", "Seoul National University", R.drawable.do_hyun));
        students.add(new Student("Park Hyun-min", "Seoul National University", R.drawable.hyun_min));
        students.add(new Student("Kim Ki-hong", "Yonsei University", R.drawable.ki_hong));
        students.add(new Student("Lee Dong-kyu", "Korea University", R.drawable.dong_kyu));
        students.add(new Student("Chae Seung-min", "Korea University", R.drawable.seung_min));
        students.add(new Student("Shin Jae-yoon", "Pohang University ", R.drawable.jae_yoon));
        students.add(new Student("Shin Min-sub", "Pohang University", R.drawable.min_sub));
        students.add(new Student("Kwak Dong-hyeon", "Harvard University", R.drawable.dong_hyeon));
        return students;
    }
}
