package com.wielabs.firerescue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.wielabs.firerescue.R.id.info;

public class Info extends AppCompatActivity {

    Button submit;
    ImageButton tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et = (EditText) findViewById(R.id.et);
                et.setText("");


                Toast.makeText(getApplicationContext(),
                        "Query Submitted", Toast.LENGTH_LONG).show();
            }
        });

        tip = (ImageButton)findViewById(R.id.sb);
        tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Info.this,tips.class);
                startActivity(intent);
                finish();
            }
        });


    }
}


