package com.tutorial.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_form);

        final EditText titleInput = findViewById(R.id.titleInput);
        final EditText descInput = findViewById(R.id.descInput);

        Button btn = findViewById(R.id.addButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleInput.getText().toString();
                String desc = descInput.getText().toString();
                if (title.isEmpty() || desc.isEmpty()) {
                    Toast.makeText(InsertForm.this, "Debes rellenar todos los campos,,,", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("title", title);
                intent.putExtra("desc", desc);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
