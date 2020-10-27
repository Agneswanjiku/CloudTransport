package ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.moringaschool.mycloudtransports.R;

import butterknife.ButterKnife;

public class RegisterActivity  extends Activity {
    private Button mFindRestaurantsButton;
    private EditText meditName;
    private EditText meditPass;
    private EditText meditemail;
    private Button mbuttonAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        ButterKnife.bind(this);

    }
}
