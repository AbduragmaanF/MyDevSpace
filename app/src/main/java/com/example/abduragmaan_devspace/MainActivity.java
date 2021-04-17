package com.example.abduragmaan_devspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText User;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = (EditText)findViewById(R.id.userName);
        Submit = (Button)findViewById(R.id.btnNext);



        Submit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                getUser( User.getText().toString());
            }
        });
    }

    private void getUser (String appUser){
        if((appUser.equals(""))){
            Toast.makeText(MainActivity.this, "Please enter a Valid Username", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(MainActivity.this, OptionsActivity.class);
            intent.putExtra("UserWelcome", User.getText().toString());
            startActivity(intent);
        }
    }
}