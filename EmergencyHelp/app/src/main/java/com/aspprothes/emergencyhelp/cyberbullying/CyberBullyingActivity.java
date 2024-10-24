package com.aspprothes.emergencyhelp.cyberbullying;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.aspprothes.emergencyhelp.R;

public class CyberBullyingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setNavigationBarColor(getResources().getColor(R.color.colors1));
        this.getWindow().setStatusBarColor(getResources().getColor(R.color.colors1));
        setContentView(R.layout.cyber_bullying_activity);

    }
}