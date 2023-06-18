package com.example.ps29253_baove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextInputEditText edtNote;
    Button btnNote;
    ListView lvNote;
    ArrayList<GhiChu> list;
    GhiChuAdapter ghiChuAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNote = findViewById(R.id.edtNote);
        btnNote= findViewById(R.id.btnAdd);
        lvNote = findViewById(R.id.lvNote);
        list = new ArrayList<>();
        list.add(new GhiChu("shopping with friends",1));
        list.add(new GhiChu("Woking with assignments",2));
        list.add(new GhiChu("Coding Android 1",3));
        list.add(new GhiChu("Coding Database",4));
        ghiChuAdapter= new GhiChuAdapter(list);
        lvNote.setAdapter(ghiChuAdapter);
        btnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edtNote.getText().toString();
                String ktText = "\\w{3,}";

                if (text==null|| text.equals("")) {
                    edtNote.setError("Vui lòng nhập ghi chú");
                    edtNote.requestFocus();
                    return;
                }

                if (!text.matches(ktText)) {
                    edtNote.setError("Ghi chú phải có ít nhất 3 ký tự");
                    edtNote.requestFocus();
                    return;
                }
                list.add(new GhiChu(text,list.size()+1));
                Toast.makeText(MainActivity.this, "Thêm ghi chú thành công", Toast.LENGTH_SHORT).show();
                ghiChuAdapter.notifyDataSetChanged();
            }
        });
    }
}