package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.jackandphantom.customtogglebutton.CustomToggle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToggle customToggle=findViewById(R.id.custom);

        customToggle.setOnToggleClickListener(new CustomToggle.OnToggleClickListener() {
            @Override
            public void onLefToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "off", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onRightToggleEnabled(boolean enabled) {
                Toast.makeText(MainActivity.this, "on", Toast.LENGTH_LONG).show();
            }
        });
    }
}
