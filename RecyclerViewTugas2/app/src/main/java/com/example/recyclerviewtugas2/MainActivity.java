 package com.example.recyclerviewtugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewtugas2.Adapters.FoodItemAdapter;
import com.example.recyclerviewtugas2.Models.FoodItem;

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
        rvFoodItem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
