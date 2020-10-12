package com.moringaschool.mycloudtransports;

import android.content.Context;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    private static final String FAKE_STRING = "Login was successful";

    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        MainActivity myObjectUnderTest = new MainActivity(mMockContext);

        // ...when the string is returned from the object under test...
//        String result = myObjectUnderTest.validate("Name","password");

        // ...then the result should be the expected one.
//        assertThat(result, is(FAKE_STRING));
    }



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }
}