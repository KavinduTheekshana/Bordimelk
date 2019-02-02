package com.example.kavindutheekshana.bordimelk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        button=(Button) findViewById(R.id.btnPostAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPostAdd();
            }
        });
    }

    private void openPostAdd() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
