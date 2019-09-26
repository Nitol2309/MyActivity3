package com.example.mainactivity3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsin,bcos,btan,bdot,bequal;
    TextView ans;
    double var1,var2;
    boolean sin,cos,tan;
    String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
        bsin=(Button)findViewById(R.id.btnsin);
        bcos=(Button)findViewById(R.id.btncos);
        btan=(Button)findViewById(R.id.btntan);
        bdot=(Button)findViewById(R.id.btndot);
        bequal=(Button)findViewById(R.id.btnequal);

        ans=(TextView)findViewById(R.id.Answer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"1");
                str=str+"1";
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"2");
                str=str+"2";
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"3");
                str=str+"3";
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"4");
                str=str+"4";
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"5");
                str=str+"5";
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"6");
                str=str+"6";
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"7");
                str=str+"7";
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"8");
                str=str+"8";
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"9");
                str=str+"9";
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() +"0");
                str=str+"0";
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText("SIN ");
                sin=true;
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText("COS ");
                cos=true;
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText("TAN ");
                tan=true;
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(str);
                var2=(3.1415926535*var1)/180;
                str="";
                if(sin==true)
                {
                    ans.setText(""+Math.sin(var2));
                    sin=false;
                }
                if(cos==true)
                {
                    ans.setText(""+Math.cos(var2));
                    cos=false;
                }
                if(tan==true)
                {
                    ans.setText(""+Math.tan(var2));
                    tan=false;
                }



            }
        });
    }


}