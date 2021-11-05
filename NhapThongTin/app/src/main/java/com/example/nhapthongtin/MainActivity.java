package com.example.nhapthongtin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editname = findViewById(R.id.edit_name);
    EditText editmssv = findViewById(R.id.edit_mssv);
    EditText editsinhnhat = findViewById(R.id.edit_date);
    EditText editdiachi = findViewById(R.id.edit_diachi);
    EditText editsdt = findViewById(R.id.edit_phone);
    EditText editemail = findViewById(R.id.edit_mail);
    EditText editkhac = findViewById(R.id.edit_khac);


    Button submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit1 = findViewById(R.id.button);
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT);
                if(editname.getText().toString().length() == 0 || editmssv.getText().toString().length() == 0 || editsinhnhat.getText().toString().length() == 0 || editemail.getText().toString().length() == 0) {
                    Toast toast = Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT);
                    toast.show();

                }

            }
        });



    }
}