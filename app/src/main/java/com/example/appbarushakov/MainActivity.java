package com.example.appbarushakov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this,
                    NotesActivity.class);
            startActivity(intentNotes);
            return true;
        } else if (id == R.id.action_open_calendar) {
            Intent intentCalendar = new Intent(MainActivity.this,
                    CalendarActivity.class);
            startActivity(intentCalendar);
            return true;
        } else if (id == R.id.action_open_spinner) {
            Intent intentSpinner = new Intent(MainActivity.this,
                    SpinnerActivity.class);
            startActivity(intentSpinner);
            return true;
        } else if (id == R.id.action_open_checkbox) {
            Intent intentCheckbox = new Intent(MainActivity.this,
                    CheckboxActivity.class);
            startActivity(intentCheckbox);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
