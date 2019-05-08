package se.juneday.systemetappbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2_AccessDenied extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2__access_denied);
    }

    public void exitApp(View view){
        finish();
    }
}

