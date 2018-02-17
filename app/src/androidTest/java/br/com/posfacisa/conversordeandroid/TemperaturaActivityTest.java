package br.com.posfacisa.conversordeandroid;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import static org.junit.Assert.*;

/**
 * Created by bruno on 17/02/2018.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class TemperaturaActivityTest {

    @Rule
    public ActivityTestRule<TemperaturaActivity> mActivityRule = new ActivityTestRule<TemperaturaActivity>(TemperaturaActivity.class);

    @Test
    public void invertButtonTest() {
        onView(withId(R.id.editTextOrigem)).perform(typeText("212"));
        onView(withId(R.id.buttonConverter)).perform(click());
        onView(withId(R.id.editTextDestino)).check(matches(hasText("100")));
    }

}