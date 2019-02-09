package com.example.kavindutheekshana.bordimelk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {
    private Button buttonSearch;
    private Button buttonPostAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        buttonPostAdd=(Button) findViewById(R.id.btnPostAdd);
        buttonPostAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPostAdd();
            }
        });

        buttonSearch=(Button) findViewById(R.id.btnSearch);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
    }

    private void openSearch() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    private void openPostAdd() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
