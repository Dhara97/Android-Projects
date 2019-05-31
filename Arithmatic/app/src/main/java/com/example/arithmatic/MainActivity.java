package com.example.arithmatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsum=(Button)findViewById(R.id.buttonsum);
        Button btnsub=(Button)findViewById(R.id.buttonsub);
        Button btnmul=(Button)findViewById(R.id.buttonmul);
        Button btndiv=(Button)findViewById(R.id.buttondiv);
        final EditText etv=(EditText)findViewById(R.id.editText1);
        final EditText etv2=(EditText)findViewById(R.id.editText2);
        final TextView result=(TextView) findViewById(R.id.textView1);

        btnsum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sum = x + y; //Perform Maths operation
                result.setText("The ANS of " + x + " + " + y + " = " + sum);//print answer
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int sub = x - y; //Perform Maths operation
                result.setText("The ANS of " + x + " - " + y + " = " + sub);//print answer
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int mul = x * y; //Perform Maths operation
                result.setText("The ANS of " + x + " * " + y + " = " +mul);//print answer
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int div = x / y; //Perform Maths operation
                result.setText("The ANS of " + x + " / " + y + " = " + div);//print answer
            }
        });
    }
}
