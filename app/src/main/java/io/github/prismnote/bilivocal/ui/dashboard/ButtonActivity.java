package io.github.prismnote.bilivocal.ui.dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.prismnote.bilivocal.R;

public class ButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);
        Button button = findViewById(R.id.helloworld);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
