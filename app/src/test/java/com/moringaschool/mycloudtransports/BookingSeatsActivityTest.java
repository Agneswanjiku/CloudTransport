package com.moringaschool.mycloudtransports;

import android.preference.TwoStatePreference;
import android.widget.Button;
import android.widget.RadioGroup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

public class BookingSeatsActivityTest {

    private TwoStatePreference radioButton;

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void canBeToggledBetweenCheckedState() throws Exception {
        assertFalse(radioButton.isChecked());

        radioButton.toString();
        assertTrue(radioButton.isChecked());

        radioButton.toString();
        assertTrue(radioButton.isChecked()); // radio buttons can't be turned off again with a click
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }
}