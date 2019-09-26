package com.example.mainactivity3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    Button button,button1;

    FirebaseFirestore db=FirebaseFirestore.getInstance();

    CollectionReference Persons=db.collection("Persons");
    DocumentReference person=Persons.document();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar) ;
        button=(Button) findViewById(R.id.btn1);
        button1=(Button) findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Person p1=new Person("myname","mypass");
//                person.set(p1);

                openactivity2();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });
    }
    public void openactivity2()
    {
        Intent a=new Intent(this,SecondActivity.class);
        startActivity(a);
    }
    public void openactivity3()
    {
        Intent a=new Intent(this,ThirdActivity.class);
        startActivity(a);
    }

}