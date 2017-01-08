package com.lifesitech.android.sigmacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_n;
    EditText edit_start;
    EditText edit_k;
    EditText edit_k2;
    EditText edit_constant;
    TextView text_answer;
    int n = 0;
    int start = 0;
    int k = 0;
    int k2 = 0;
    int constant = 0;
    int answer = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_n = (EditText)findViewById(R.id.edit_n);
        edit_start = (EditText)findViewById(R.id.edit_start);
        edit_k = (EditText)findViewById(R.id.edit_k);
        edit_k2 = (EditText)findViewById(R.id.edit_k2);
        edit_constant = (EditText)findViewById(R.id.edit_constant);
        text_answer = (TextView)findViewById(R.id.text_answer);
    }

    public void equal(View v) {
        answer = 0;
        n = Integer.parseInt(edit_n.getText().toString());
        start = Integer.parseInt(edit_start.getText().toString());
        k = Integer.parseInt(edit_k.getText().toString());
        k2 = Integer.parseInt(edit_k2.getText().toString());
        constant = Integer.parseInt(edit_constant.getText().toString());
        for (; start <= n; start++) {
            answer = answer + k2 * start * start + k * start + constant;
        }
        text_answer.setText(String.valueOf(answer));
    }
}
