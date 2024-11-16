package com.example.p4_7s12_combobox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2;
    RadioButton op1, op2, op3;
    CheckBox opt1, opt2, opt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);

        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                revisarRB();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                revisarCB();
            }
        });


    }

    private void revisarCB() {
        if(opt1.isChecked()){
            Toast.makeText(this, "Seleccionado casa", Toast.LENGTH_SHORT).show();
        }

        if(opt2.isChecked()){
            Toast.makeText(this, "Seleccionado oficina", Toast.LENGTH_SHORT).show();
        }

        if(opt3.isChecked()){
            Toast.makeText(this, "Seleccionado publico", Toast.LENGTH_SHORT).show();
        }
    }

    private void revisarRB(){
        if(op1.isChecked()){
            Toast.makeText(this, "Seleccionado hombre", Toast.LENGTH_SHORT).show();
        }

        if(op2.isChecked()){
            Toast.makeText(this, "Seleccionado mujer", Toast.LENGTH_SHORT).show();
        }

        if(op3.isChecked()){
            Toast.makeText(this, "Seleccionado otros", Toast.LENGTH_SHORT).show();
        }
    }
}