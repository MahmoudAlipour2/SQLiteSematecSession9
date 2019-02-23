package com.example.sqlitesematecsession9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etPersonalCode;
    EditText etLastName;
    EditText etName;


    Button btnDelete;
    Button btnView;
    Button btnSave;
    Button btnUpdate;


    String getetName;
    String getetLastName;
    String getetPersonalCode;

    DatabaseManager dbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = findViewById(R.id.etName);
        etLastName = findViewById(R.id.etLastName);
        etPersonalCode = findViewById(R.id.etPersonalCode);

        btnDelete = findViewById(R.id.btnDelete);
        btnView = findViewById(R.id.btnView);
        btnSave = findViewById(R.id.btnSave);
        btnUpdate = findViewById(R.id.btnUpdate);


        dbm = new DatabaseManager(this);


        //btnDelete!
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnDelete!
            }
        });


        //btnSave
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getetName = etName.getText().toString();
                getetLastName = etLastName.getText().toString();
                getetPersonalCode = etPersonalCode.getText().toString();

                Person iperson = new Person();
                iperson.pName = getetName;
                iperson.pFamily = getetLastName;
                iperson.pID =getetPersonalCode;

                dbm.insertPerson(iperson);

                Toast.makeText(MainActivity.this, "اطلاعات شما با موفقیت ثبت شد",Toast.LENGTH_LONG).show();

            }
        });


        //btnUpdate
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //btnView
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnView
            }
        });


    }
}
