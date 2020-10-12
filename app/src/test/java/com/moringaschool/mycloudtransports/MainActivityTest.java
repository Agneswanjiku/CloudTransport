package com.moringaschool.mycloudtransports;

import android.content.Intent;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
       activity = Robolectric.setupActivity(MainActivity.class);

    }
//    @Test
//    public void validateTextViewContent(){
//        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
//        assertTrue("My CloudTransports".equals(appNameTextView.getText().toString()));
//    }


    @Test
    public void clickingLogin_shouldStartSelectionVehicleActivity() {
        SelectionVehicleActivity activity = Robolectric.setupActivity(SelectionVehicleActivity.class);
        activity.findViewById(R.id.login).performClick();
        Intent expectedIntent = new Intent(activity, BookingSeatsActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
    @Test

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }
}