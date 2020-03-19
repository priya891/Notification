package com.example.notification;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class OpenNotification extends AppCompatActivity {
    TextView text;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_activity);

        text=findViewById(R.id.notificationBody);
        image=findViewById(R.id.notificationImage);
        Intent intent;
        intent = getIntent();
        String price=intent.getStringExtra("value");
        String url=intent.getStringExtra("url");
        String body=intent.getStringExtra("body");
        String title=intent.getStringExtra("title");
        text.setText( "title :"+title+"\n"+"body :"+body+"\n"+"price== "+price);

        Picasso.get()
                .load(url)
                .placeholder(R.drawable.abc)
                .error(R.drawable.abc)
                .into(image);

    }
}