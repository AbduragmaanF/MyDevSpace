package com.example.abduragmaan_devspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OptionsActivity extends AppCompatActivity {

    private TextView UserWelcome;
    private String Username;
    private Button AboutBtn;
    private Button DevBtn;
    private Button CalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            Username = extras.getString( "UserWelcome");
            TextView UserWelcome = (TextView) findViewById(R.id.userWelcome);
            UserWelcome.setText( Username +"," + " " + "Welcome to Abduragmaans App" );
        }



        Button homeBtn = (Button) findViewById(R.id.btnHome);
        homeBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                homePage();
            }
        });

        CalBtn = (Button)findViewById(R.id.btnCal);
        CalBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                calScreen();
            }
        });

        DevBtn = (Button)findViewById(R.id.btnProfile);
        DevBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                devPage();
            }
        });

        AboutBtn = (Button)findViewById(R.id.btnAbout);
        AboutBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                aboutPage();
            }
        });

    }

    public void homePage(){
        Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
        startActivity(intent);
    }

   public void calScreen(){
        Intent intent = new Intent(OptionsActivity.this, CalActivity.class);
        startActivity(intent);
    }

    public void aboutPage(){
        Intent intent = new Intent(OptionsActivity.this, AboutMe.class);
        startActivity(intent);
    }

    public void devPage(){
        Intent intent = new Intent(OptionsActivity.this, DevProfileActivity.class);
        startActivity(intent);
    }
}