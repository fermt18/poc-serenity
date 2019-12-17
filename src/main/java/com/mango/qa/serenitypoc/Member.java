package com.mango.qa.serenitypoc;

import static com.mango.qa.serenitypoc.MemberGrade.Bronze;

public class Member {

    private int points;
    private MemberGrade grade;

    public MemberGrade getGrade(){ return this.grade; }
    public int getPoints(){ return this.points; }

    public Member(){
        this.points = 10;
        this.grade = Bronze;
    }
}
