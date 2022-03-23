package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBtn1;
    private ImageButton imgBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBtn2 = findViewById(R.id.imageButton);
        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/vyniof/");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        imgBtn1 = (ImageButton) findViewById(R.id.imgBtn);
        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAutobiografia();
            }
        });
    }

    private void openAutobiografia() {
        Intent intent = new Intent(this, Autobiografia.class);
        startActivity(intent);
    }
}