package br.com.denise.castro.mymessenger.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.denise.castro.mymessenger.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCreateMessage(View view) {
        Intent intent = new Intent(this, CreateMessageActivity.class);
        startActivity(intent);
        finish();
    }
}