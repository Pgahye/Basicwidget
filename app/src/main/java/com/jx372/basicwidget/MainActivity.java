package com.jx372.basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isbtnClickable = findViewById(R.id.btninvisible).isClickable();

        boolean isTVClickable = findViewById(R.id.tvwidget).isClickable();

        System.out.println(isbtnClickable);

        System.out.println(isTVClickable);

        findViewById(R.id.btninvisible).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tvwidget).setVisibility(View.INVISIBLE);
            }}


        );


        findViewById(R.id.btngone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.tvwidget).setVisibility(View.GONE);

            }}


        );

        findViewById(R.id.btnvisible).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.tvwidget).setVisibility(View.VISIBLE);
            }}


        );
    }
}
