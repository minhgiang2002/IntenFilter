package com.example.intenfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btnopen;
    EditText edtlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtlink = findViewById(R.id.edtlink);
        btnopen = findViewById(R.id.btnopen);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.example.webview", "com.example.webview.MainActivity");
                intent.setData(Uri.parse("https://"+edtlink.getText().toString()));
                startActivity(intent);
            }
        });
    }
}