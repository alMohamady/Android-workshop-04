package com.example.almoh.worckshop004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cJava, cKotlin, cCplus_Plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cJava = (CheckBox) findViewById(R.id.chkJava);
        cKotlin = (CheckBox) findViewById(R.id.chkKotlin);
        cCplus_Plus = (CheckBox) findViewById(R.id.chkCPlusPlus);

        cJava.setOnClickListener(listener);
        cKotlin.setOnClickListener(listener);
        cCplus_Plus.setOnClickListener(listener);

        cJava.setChecked(true);
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean check = ((CheckBox) view).isChecked();
            String message = "";
            if (check) {
                switch (view.getId()) {
                    case R.id.chkJava:
                        message = "Java Code";
                        break;
                    case R.id.chkKotlin:
                        message = "Kotlin Code";
                        break;
                    case R.id.chkCPlusPlus:
                        message = "C++ Codes";
                        break;
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        }
    };
}
