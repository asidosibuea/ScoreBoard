package com.example.u2.hellostyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int tempA=0;
    private int tempB=0;
    private TextView pointA;
    private TextView pointB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointA = (TextView) findViewById(R.id.pointA);
        pointB = (TextView) findViewById(R.id.pointB);
    }

    public void tambahSatuA(View view){
        tempA = tempA+1;
        pointA.setText(""+tempA);
    }
    public void tambahDuaA(View view){
        tempA = tempA+2;
        pointA.setText(""+tempA);
    }

    public void tambahSatuB(View view){
        tempB = tempB+1;
        pointB.setText(""+tempB);
    }
    public void tambahDuaB(View view){
        tempB = tempB+2;
        pointB.setText(""+tempB);
    }
    public void reset(View view){
        pointA.setText("0");
        pointB.setText("0");
        tempA = 0;
        tempB = 0;
    }
}
