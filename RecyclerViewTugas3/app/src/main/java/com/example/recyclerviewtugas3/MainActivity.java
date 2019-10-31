package com.example.recyclerviewtugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtugas3.Adapters.FoodItemAdapter;
import com.example.recyclerviewtugas3.Models.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvFoodItem;
    //instansiasi list foodItem
    List<FoodItem> listFoodItem = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvFoodItem ke layout
        rvFoodItem = findViewById(R.id.rvFoodItem);
        //Membuat object food
        FoodItem food = new FoodItem("Lasagna", R.drawable.lasagna);
        //menambahkan food ke listFoodItem
        listFoodItem.add(food);
        //membuat object food baru
        food = new FoodItem("Carbonara", R.drawable.carbonara);
        //menambahkan food baru ke listFoodItem
        listFoodItem.add(food);
        //Instansiasi Adapter
        FoodItemAdapter foodItemAdapter = new FoodItemAdapter(listFoodItem);
        //set adapter dan layoutmanager
        rvFoodItem.setAdapter(foodItemAdapter);
        rvFoodItem.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
