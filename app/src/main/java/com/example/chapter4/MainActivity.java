package com.example.chapter4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] ques={"was java creatd in 1823?","Oracle was parent company of java?","Java and JavaScript are same?"};
    private boolean ans[]={false,true,false};
    int index=0;
    int score=0;
    Button no;
    Button yes;
    TextView ques1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.button);
        no=findViewById(R.id.button2);
        ques1=findViewById(R.id.textView6);
        ques1.setText(ques[0]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                      if(ans[index])
                          score++;
                      index++;
                if(index==ques.length) {
                    Toast.makeText(MainActivity.this, "your score is" + score, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "restart your app", Toast.LENGTH_LONG).show();

                }
                else
                      ques1.setText(ques[index]);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                       if(!ans[index])
                           score++;
                index++;
                if(index==ques.length) {
                    Toast.makeText(MainActivity.this, "your score is" + score, Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "please restart your app", Toast.LENGTH_LONG).show();
                }
                else
                ques1.setText(ques[index]);
            }
        });
    }
}