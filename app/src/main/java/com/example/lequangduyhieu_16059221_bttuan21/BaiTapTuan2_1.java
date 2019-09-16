package com.example.lequangduyhieu_16059221_bttuan21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BaiTapTuan2_1 extends AppCompatActivity {
    EditText edtsoa, edtsob;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUcln, btnThoat;
    TextView tvketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(edtsoa.getText().toString());
                int sob = Integer.parseInt(edtsob.getText().toString());
                int tong = soa + sob;
                tvketqua.setText(tong);
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(edtsoa.getText().toString());
                int sob = Integer.parseInt(edtsob.getText().toString());
                int hieu = soa - sob;
                tvketqua.setText(hieu);
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(edtsoa.getText().toString());
                int sob = Integer.parseInt(edtsob.getText().toString());
                int tich = soa * sob;
                tvketqua.setText(tich);
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(edtsoa.getText().toString());
                int sob = Integer.parseInt(edtsob.getText().toString());
                int thuong = soa / sob;
                tvketqua.setText(thuong);
            }
        });
        btnUcln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa = Integer.parseInt(edtsoa.getText().toString());
                int sob = Integer.parseInt(edtsob.getText().toString());

                while (soa != sob) {
                    if (soa > sob) {
                        soa -= sob;
                    } else {
                        sob -= soa;
                    }
                }
                tvketqua.setText(soa);

            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               edtsoa.setText("");
               edtsob.setText("");
            }
        });
    }

    private void AnhXa() {
        edtsoa = (EditText)findViewById(R.id.edtsoa);
        edtsob = (EditText)findViewById(R.id.edtsob);
        btnTong = (Button)findViewById(R.id.btnTong);
        btnHieu = (Button)findViewById(R.id.btnHieu);
        btnTich = (Button)findViewById(R.id.btnTich);
        btnThuong = (Button)findViewById(R.id.btnThuong);
        btnUcln = (Button)findViewById(R.id.btnUcln);
        btnThoat = (Button)findViewById(R.id.btnThoat);
    }
}
