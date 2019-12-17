package com.mango.qa.serenitypoc.features.steps;

import com.mango.qa.serenitypoc.Member;
import com.mango.qa.serenitypoc.MemberGrade;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class MemberStatusSteps {

    private Member member;

    @Step("Given a client joins the member program")
    public void aClientJoinsTheMemberProgram(){
        member = new Member();
    }

    @Step("Then a member has {0} points")
    public void theMemberShouldHavePointsOf(int points) {
        assertThat(member.getPoints(), equalTo(points));
    }

    @Step("Then the member grade should be {0}")
    public void theMemberShouldHaveAStatusOf(MemberGrade grade) {
        assertThat(member.getGrade(), equalTo(grade));
    }
}