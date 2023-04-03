package com.example.centimeterintofeetconvertor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{
    private EditText editText1;
    private TextView txtresult1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edittext1);
        txtresult1 = findViewById(R.id.txtresult1);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String centimetersString = editText1.getText().toString();
                double centimeters = Double.parseDouble(centimetersString);
                double feet = centimeters / 30.48;
                txtresult1.setText(String.format("%.2f feet", feet));
            }
        });
    }
}
