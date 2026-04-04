package com.example.implicittntent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.implicittntent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mainBinding.buttonWebsite.setOnClickListener(view -> {
            String url = mainBinding.editTextWebsite.getText().toString();

            Uri uri = Uri.parse(url);

            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "App not exist!", Toast.LENGTH_SHORT).show();
            }

        });
        mainBinding.buttonLocation.setOnClickListener(view -> {
            String location = mainBinding.editTextLocation.getText().toString();

            Uri uri = Uri.parse("geo:0.0?1= " + location);

            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "App not exist!", Toast.LENGTH_SHORT).show();
            }

        });
        mainBinding.buttonShare.setOnClickListener(view -> {
            String text = mainBinding.editTextShare.getText().toString();

            ShareCompat.IntentBuilder
                    .from(this)
                    .setType("text/plain")
                    .setChooserTitle("Share This Text With: ")
                    .setText(text)
                    .startChooser();
        });
    }
}