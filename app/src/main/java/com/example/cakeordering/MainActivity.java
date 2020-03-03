package com.example.cakeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rbtn_square, rbtn_circle, rbtn_rectangle;
    CheckBox chocolate, caramel, coffee, ube, blackforest, strawberry, kisses, oreo, velvet;
    EditText et_message;
    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbtn_square = findViewById(R.id.rbtn_square);
        rbtn_circle = findViewById(R.id.rbtn_circle);
        rbtn_rectangle = findViewById(R.id.rbtn_rectangle);

        chocolate = (CheckBox) findViewById(R.id.chocolate);
        caramel = findViewById(R.id.caramel);
        coffee = findViewById(R.id.coffee);
        ube = findViewById(R.id.ube);
        blackforest = findViewById(R.id.blackforest);
        strawberry = findViewById(R.id.strawberry);

        et_message = findViewById(R.id.txt_message);
        btn_sub = findViewById(R.id.btn_submit);
    }


}
