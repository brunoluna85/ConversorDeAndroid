package br.com.posfacisa.conversordeandroid;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

/**
 * Created by bruno on 17/02/2018.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MenuActivityTest {

    @Rule
    public ActivityTestRule<MenuActivity> mActivityRule = new ActivityTestRule<MenuActivity>(MenuActivity.class);

    @Test
    public void menuScreenApearsOnOpening(){
        onView(withId(R.id.buttonTemperatura)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonArea)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonComprimento)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonVolume)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonVelocidade)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonPeso)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonSair)).check(matches(isDisplayed()));

    }
}
