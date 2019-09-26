package com.example.mainactivity3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,bequal;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div;
    String value;

    DatabaseReference ref;
    Calculator cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b0=(Button)findViewById(R.id.btn0);
        badd=(Button)findViewById(R.id.btnadd);
        bsub=(Button)findViewById(R.id.btnsub);
        bmul=(Button)findViewById(R.id.btnmul);
        bdiv=(Button)findViewById(R.id.btndiv);
        bdot=(Button)findViewById(R.id.btndot);
        bequal=(Button)findViewById(R.id.btnequal);
        cal=new Calculator();
        ref=FirebaseDatabase.getInstance().getReference().child("Calculator");


        ans=(TextView)findViewById(R.id.Answer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"0");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                sub=true;
                ans.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(var1+var2+"");
                    value= Double.toString(var1+var2);
                    cal.setVal(value);
                    ref.push().setValue(cal);
                    add=false;
                }
                if(sub==true)
                {
                    ans.setText(var1-var2+"");
                    value= Double.toString(var1-var2);
                    cal.setVal(value);
                    ref.push().setValue(cal);

                    sub=false;
                }
                if(mul==true)
                {
                    ans.setText(var1*var2+"");
                    value= Double.toString(var1*var2);
                    cal.setVal(value);
                    ref.push().setValue(cal);
                    mul=false;
                }
                if(div==true)
                {
                    ans.setText(var1/var2+"");
                    value= Double.toString(var1/var2);
                    cal.setVal(value);
                    ref.push().setValue(cal);
                    div=false;
                }

            }
        });


    }
}