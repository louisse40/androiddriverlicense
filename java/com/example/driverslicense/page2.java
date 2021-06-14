package com.example.driverslicense;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

    }


    public void submitButton(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Proceed?");
        alert.setMessage("Are you sure about your info?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Intent intent = new Intent(page2.this, page3.class);
                String inputFullName = ((EditText)findViewById(R.id.idFullName)).getText().toString();
                String inputNationality = ((EditText)findViewById(R.id.idNationality)).getText().toString();
                String inputSex = ((EditText)findViewById(R.id.idSex)).getText().toString();
                String inputBirthDate = ((EditText)findViewById(R.id.idBirthDate)).getText().toString();
                String inputWeight = ((EditText)findViewById(R.id.idWeight)).getText().toString();
                String inputHeight = ((EditText)findViewById(R.id.idHeight)).getText().toString();
                String inputBloodType = ((EditText)findViewById(R.id.idBloodType)).getText().toString();
                String inputAddress = ((EditText)findViewById(R.id.idAddress)).getText().toString();
                intent.putExtra("input1", inputFullName);
                intent.putExtra("input2", inputNationality);
                intent.putExtra("input3", inputSex);
                intent.putExtra("input4", inputBirthDate);
                intent.putExtra("input5", inputWeight);
                intent.putExtra("input6", inputHeight);
                intent.putExtra("input7", inputBloodType);
                intent.putExtra("input8", inputAddress);
                startActivity(intent);
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(page2.this, "Canceled", Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();
    }
}