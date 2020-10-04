package com.example.travelbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProvideFeedback extends AppCompatActivity {
    Button sendBtn;
    EditText feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provide_feedback);

        sendBtn = (Button) findViewById(R.id.sendBtn);
        feedback = (EditText)findViewById(R.id.feedbackAns);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedback.setText("");
                Toast.makeText(ProvideFeedback.this, "Sending Feedback", Toast.LENGTH_SHORT).show();
            }
        });
    }
}