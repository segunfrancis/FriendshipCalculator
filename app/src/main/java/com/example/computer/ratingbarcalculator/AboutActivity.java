package com.example.computer.ratingbarcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView github = findViewById(R.id.about_github);
        TextView gmail = findViewById(R.id.about_google);
        TextView facebook = findViewById(R.id.about_facebook);
        TextView twitter = findViewById(R.id.about_twitter);

        // Making the links clickable
        github.setMovementMethod(LinkMovementMethod.getInstance());
        facebook.setMovementMethod(LinkMovementMethod.getInstance());
        twitter.setMovementMethod(LinkMovementMethod.getInstance());

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sending a mail to the developer
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "francissegun12@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Friendship App");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
    }
}
