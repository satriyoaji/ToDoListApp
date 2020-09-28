package com.example.todolistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class EditTask extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private EditText titleTask, descTask, dateTask;
    private ImageButton datePickerBtn;
    private Button updateTaskBtn, deleteTaskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);

        titleTask = findViewById(R.id.titleTask);
        descTask = findViewById(R.id.descTask);
        dateTask = findViewById(R.id.dateTask);
        dateTask.setKeyListener(null);
        datePickerBtn = findViewById(R.id.datePickerBtn);
        updateTaskBtn = findViewById(R.id.updateTaskBtn);
        deleteTaskBtn = findViewById(R.id.deleteTaskBtn);

        //get Value from selected task
        titleTask.setText(getIntent().getStringExtra("titleTask"));
        descTask.setText(getIntent().getStringExtra("descTask"));
        dateTask.setText(getIntent().getStringExtra("dateTask"));

        deleteTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDeleteDialog();
            }
        });

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        datePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });
    }

    private void showDeleteDialog() {

    }

    private void showDateDialog(){
        //Calendar untuk mendapatkan tanggal sekarang
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                dateTask.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}
