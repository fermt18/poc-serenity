package com.mango.qa.serenitypoc.features;

import com.mango.qa.serenitypoc.features.steps.MemberStatusSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.model.TestResult;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.mango.qa.serenitypoc.MemberGrade.Bronze;

@RunWith(SerenityRunner.class)
public class MemberStatusLiveTest {

    @Steps
    private MemberStatusSteps memberSteps;

    @Test
    public void membersShouldStartWithBronzeStatus() {
        memberSteps.aClientJoinsTheMemberProgram();
        memberSteps.theMemberShouldHaveAStatusOf(Bronze);
    }

    @Test
    public void membersShouldStartWithSomePoints(){
        memberSteps.aClientJoinsTheMemberProgram();
        memberSteps.theMemberShouldHavePointsOf(10);
    }

    @Manual
    @Test
    public void membersShouldBeAbleToExchangePoints(){
    }

    @Manual(result = TestResult.SUCCESS)
    @Test
    public void membersShouldGetPointsFromPhysicalShops(){
    }

    @Manual(result = TestResult.FAILURE, reason = "Shit happens")
    @Test
    public void membersShouldUsePointsAtPhysicalShops(){
    }
}
