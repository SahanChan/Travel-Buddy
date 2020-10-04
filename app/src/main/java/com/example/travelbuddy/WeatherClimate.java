package com.example.travelbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.audiofx.AudioEffect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.common.api.Api;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.Objects;

public class WeatherClimate extends AppCompatActivity {


    EditText cityText;

    TextView cityName;
    TextView temp;
    TextView desc;
    ImageView weather_image;
    Button searchBtn;

    private static final String TAG = "WeatherClimate";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_climate);
        searchBtn = (Button) findViewById(R.id.searchButton);
        cityName = findViewById(R.id.cityName);

        temp = findViewById(R.id.temperature);
        weather_image =(ImageView)findViewById(R.id.weatherImage);


        desc = findViewById(R.id.desc);

        cityText = findViewById(R.id.city);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cityName.setText(cityText.getText().toString());
                temp.setText("29°C");

                desc.setText("Sunny");
                weather_image.setImageResource(R.drawable.d02d);
            }
        });
    }
}

