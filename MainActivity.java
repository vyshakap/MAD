package com.example.addnum;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2,ans;
    Button addbtn,subbtn,mulbtn,divbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.NUM1);
        num2=findViewById(R.id.NUM2);
        ans=findViewById(R.id.ANS);
        addbtn=findViewById(R.id.ADDBTN);
        subbtn=findViewById(R.id.SUBBTN);
        mulbtn=findViewById(R.id.MULBTN);
        divbtn=findViewById(R.id.DIVBTN);
        addbtn.setOnClickListener(new View.OnClickListener(){
         @Override
        public void onClick(View v)
         {
             int x=Integer.parseInt(num1.getText().toString());
             int y=Integer.parseInt(num2.getText().toString());
             int sum=x+y;
             ans.setText(String.valueOf(sum));

         }}

        );
        subbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int sub=x-y;
                ans.setText(String.valueOf(sub));

            }}

        );
        mulbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int mul=x*y;
                ans.setText(String.valueOf(mul));

            }}

        );
        divbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int div=x/y;
                ans.setText(String.valueOf(div));

            }}

        );
        }
    }

