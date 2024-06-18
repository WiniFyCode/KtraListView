package com.example.ktralistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemChiTietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_chi_tiet);

        ImageView imgLogo = findViewById(R.id.imgLogo);
        TextView tvTen = findViewById(R.id.tvNameCT1);
        TextView tvSoDienThoai = findViewById(R.id.tvPhoneNum);
        TextView tvQuocGia = findViewById(R.id.tvContry);

        Intent intent = getIntent();
        if (intent != null) {
            String tenItem = intent.getStringExtra("TEN_ITEM");
            String quocGiaItem = intent.getStringExtra("QUOC_GIA_ITEM");
            int avatarItem = intent.getIntExtra("AVATAR_ITEM", 0);
            String soDienThoai = intent.getStringExtra("SO_DIEN_THOAI");

            tvTen.setText(tenItem);
            tvQuocGia.setText(quocGiaItem);
            imgLogo.setImageResource(avatarItem);
            tvSoDienThoai.setText(soDienThoai);

        }
    }
}