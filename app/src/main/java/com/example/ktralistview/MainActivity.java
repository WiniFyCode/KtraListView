package com.example.ktralistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvDanhSach = findViewById(R.id.lvdanhSach);
        List<Item> danhSachItem = new ArrayList<>();

        danhSachItem.add(new Item(R.drawable.h1, "Alan Turing", "Anh", "1:00 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h2, "Ada Lovelace", "Anh", "1:30 pm", "Good Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h3, "John von Neumann", "Hoa Kỳ", "2:00 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h4, "Grace Hopper", "Hoa Kỳ", "2:30 pm", "Good Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h5, "Donald Knuth", "Hoa Kỳ", "3:00 pm", "Lucky Day", "0987654321"));

        danhSachItem.add(new Item(R.drawable.h1, "Isaac Newton", "Anh", "3:30 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h2, "Albert Einstein", "Đức", "4:00 pm", "Good Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h3, "Marie Curie", "Pháp", "4:30 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h4, "Niels Bohr", "Đan Mạch", "5:00 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h5, "Richard Feynman", "Hoa Kỳ", "5:30 pm", "Good Day", "0987654321"));

        danhSachItem.add(new Item(R.drawable.h1, "Carl Friedrich Gauss", "Đức", "6:00 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h2, "Leonhard Euler", "Thụy Sĩ", "6:30 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h3, "Pythagoras", "Hy Lạp", "7:00 pm", "Good Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h4, "Srinivasa Ramanujan", "Ấn Độ", "7:30 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h5, "Euclid", "Hy Lạp", "8:00 pm", "Lucky Day", "0987654321"));

        danhSachItem.add(new Item(R.drawable.h1, "Dmitri Mendeleev", "Nga", "8:30 pm", "Good Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h2, "Linus Pauling", "Hoa Kỳ", "9:00 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h3, "Marie Curie", "Pháp", "9:30 pm", "Lucky Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h4, "Ahmed Zewail", "Ai Cập", "10:00 pm", "Good Day", "0987654321"));
        danhSachItem.add(new Item(R.drawable.h5, "Rosalind Franklin", "Anh", "10:30 pm", "Lucky Day", "0987654321"));

        ItemAdapter adapter = new ItemAdapter(this, danhSachItem);
        lvDanhSach.setAdapter(adapter);

        lvDanhSach.setOnItemClickListener((parent, view, position, id) -> {
            Item itemDuocChon = danhSachItem.get(position);
            Intent intent = new Intent(MainActivity.this, ItemChiTietActivity.class);
            intent.putExtra("TEN_ITEM", itemDuocChon.ten);
            intent.putExtra("SO_DIEN_THOAI", itemDuocChon.soDienThoai);
            intent.putExtra("QUOC_GIA_ITEM", itemDuocChon.quocGia);
            intent.putExtra("AVATAR_ITEM", itemDuocChon.avatar);
            startActivity(intent);
        });
    }
}