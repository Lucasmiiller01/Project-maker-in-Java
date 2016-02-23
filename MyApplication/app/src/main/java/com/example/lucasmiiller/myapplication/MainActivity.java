package com.example.lucasmiiller.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText fieldPass;
    public EditText fieldLogin;
    public Button buttonLogin;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button) findViewById(R.id.button);
        fieldLogin = (EditText)findViewById(R.id.editText);
        fieldPass = (EditText)findViewById(R.id.editText2);
       //labelAuth = (TextView) findViewById(R.id.textView);
    }

    public void onPass(View view ){

        fieldPass.setText("");
        fieldPass.setInputType(InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD);
    }
}
