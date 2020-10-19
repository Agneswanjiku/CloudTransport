package com.moringaschool.mycloudtransports;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;


@RunWith(RobolectricTestRunner.class)


public class MainActivityTest {

    private MainActivity activity;
    private Button btnlogin;

    @Before
    public void setUp() throws Exception {
        activity = new MainActivity();
        activity.onCreate(null);
        btnlogin = (Button) activity.findViewById(R.id.btnLogin);
    }

    @Test
    public void shouldUpdateResultsWhenButtonIsClicked() throws Exception {
        btnlogin.performClick();
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