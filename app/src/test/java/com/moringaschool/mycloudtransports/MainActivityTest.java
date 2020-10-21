package com.moringaschool.mycloudtransports;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowContextWrapper;

import static org.junit.Assert.*;


@RunWith(RobolectricTestRunner.class)


public class MainActivityTest {

    private MainActivity activity;
    private Button login;

    @Before
    public void setUp() throws Exception {
        activity = new MainActivity();
        activity.onCreate(null);
        login = (Button) activity.findViewById(R.id.btnLogin);
    }

    @Test
    public void clickingLogin_shouldStartMainActivity() {
        SelectionVehicleActivity activity = Robolectric.setupActivity(SelectionVehicleActivity.class);
        activity.findViewById(R.id.btnLogin).performClick();
        Intent expectedIntent = new Intent(activity, BookingSeatsActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    private ShadowContextWrapper shadowOf(Application application) {
        return null;
    }

    @Test
    public void shouldUpdateResultsWhenButtonIsClicked() throws Exception {
        login.performClick();
        ShadowActivity shadowActivity = shadowOf(activity);
        Intent intent = shadowActivity.getResultIntent();
        System.out.print(intent.toString());
    }

    @Test
    public void validateTextViewContent() {
        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
        assertTrue("My CloudTransports".equals(appNameTextView.getText().toString()));
    }

    private ShadowActivity shadowOf(MainActivity activity) {
        return null;
    }

    private class ShadowActivity {
        public Intent getResultIntent() {
            return null;
        }
    }


}