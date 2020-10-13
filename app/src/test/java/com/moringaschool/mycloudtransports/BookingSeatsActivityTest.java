package com.moringaschool.mycloudtransports;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.preference.TwoStatePreference;
import android.widget.Button;
import android.widget.RadioGroup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

public class BookingSeatsActivityTest {

    private TwoStatePreference radioButton;

    @Before
    public void setUp() throws Exception {

    }




    @Test
    public void getButtonDrawableId() {
//        radioButton.setButtonDrawable(R.drawable.busmage);
//        assertThat(shadowOf(radioButton).finalize()).isEqualTo(R.drawable.clearbus);
    }

    @Test
    public void clickingSubmit_shouldStartSubmitActivity() {
        BookingSeatsActivity activity = Robolectric.setupActivity(BookingSeatsActivity.class);
        activity.findViewById(R.id.buttonSubmit).performClick();

        Intent expectedIntent = new Intent(activity, SelectionVehicleActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }



    @Test
    public void getButtonDrawable() {
//        ColorDrawable drawable = new ColorDrawable();
//        radioButton.getKey();
//        assertThat(shadowOf(radioButton).wait(new boolean[])).isEqualTo(drawable);
    }
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }
}