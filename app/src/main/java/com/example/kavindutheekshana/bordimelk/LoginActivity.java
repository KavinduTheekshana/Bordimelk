package com.example.kavindutheekshana.bordimelk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button=(Button) findViewById(R.id.btnSignup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
    }


    private void openSignUp() {
        try {
           Intent intent = new Intent(this, SignupActivity.class);
           startActivity(intent);
       }catch (Exception e){
          System.out.println(e.getMessage());
        }

    }
}
