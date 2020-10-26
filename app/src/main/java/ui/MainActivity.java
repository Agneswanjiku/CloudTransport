package ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.Constants;
import com.moringaschool.mycloudtransports.R;

import java.text.BreakIterator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static butterknife.ButterKnife.*;


//private SharedPreferences  mSharedPreferences;
//private SharedPreferences.Editor mEditor;


public class MainActivity<Public, mbtnlogin, v> extends AppCompatActivity implements View.OnClickListener {

    public static final String Tag = MainActivity.class.getSimpleName();


    @BindView(R.id.etName)
    EditText metName;
    @BindView(R.id.etPassword)
    EditText metPasssword;
    @BindView(R.id.appNameTextView)
    TextView mappNameTextView;
    @BindView(R.id.btnLogin)
    Button mbtnLogin;
    @BindView(R.id.LocationTextView)
    TextView mLocationTextView;
    @BindView(R.id.SubmitButton)
    Button mSubmitButton;
    private BreakIterator mLocationEditText;
    private Object mEditor;
    private Object mbtnlogin;
//    private Object mSubmitbutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationform);
        ButterKnife.bind(this);

        mbtnLogin.setOnClickListener(this);

        PreferenceManager PrerenceManager;
        Object mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = ((SharedPreferences) mSharedPreferences).edit();

        mbtnLogin.setOnClickListener(this);

//        mSubmitbutton.setOnclickListener(this);

    }

    ;

    @Override
    public void onClick(View v) {

        if (v == mbtnlogin) {
            String location = mLocationTextView.getText().toString();


            // TODO Auto-generated method stub
            Intent intent = new Intent(getApplicationContext(), registrationformActivity.class);
            startActivity(intent);
        }
    }


}