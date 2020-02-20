package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ettext1,ettext2;
    TextView result;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettext1=findViewById(R.id.ettext1);
        ettext2=findViewById(R.id.ettext2);
        add=findViewById(R.id.btnadd);
        mul=findViewById(R.id.btnmmultiply);
        div=findViewById(R.id.btndivide);
        sub=findViewById(R.id.btnsub);
        result=findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(ettext1.getText().toString());
                secondvalue=Integer.parseInt(ettext2.getText().toString());

                ans=firstvalue+secondvalue;

                result.setText("Res: "+ans);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(ettext1.getText().toString());
                secondvalue=Integer.parseInt(ettext2.getText().toString());

                ans=firstvalue/secondvalue;

                result.setText("Res: "+ans);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(ettext1.getText().toString());
                secondvalue=Integer.parseInt(ettext2.getText().toString());

                ans=firstvalue-secondvalue;

                result.setText("Res: "+ans);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(ettext1.getText().toString());
                secondvalue=Integer.parseInt(ettext2.getText().toString());

                ans=firstvalue*secondvalue;

                result.setText("Res: "+ans);

            }
        });

    }
}
