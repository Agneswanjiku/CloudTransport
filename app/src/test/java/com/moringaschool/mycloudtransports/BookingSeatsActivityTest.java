package com.moringaschool.mycloudtransports;

import android.preference.TwoStatePreference;

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
    public void canBeExplicitlyChecked() throws Exception {
        assertFalse(radioButton.isChecked());

        radioButton.setChecked(true);
        assertTrue(radioButton.isChecked());

        radioButton.setChecked(false);
        assertFalse(radioButton.isChecked());
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