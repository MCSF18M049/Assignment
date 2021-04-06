package com.example.lasttry;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
    }
    public void Animation(View view){
        ImageView imageView=findViewById(R.id.imageView);
        imageView.animate().alpha(0).setDuration(2000);

    }

    public void Call(View view) {
        Uri uri=Uri.parse("tel:+9243987634");
        Intent intent= new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);

    }
}