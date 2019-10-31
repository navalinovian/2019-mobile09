package com.example.recyclerviewtugas3.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtugas3.Models.FoodItem;
import com.example.recyclerviewtugas3.R;

import java.util.List;

public class FoodItemAdapter  extends RecyclerView.Adapter<FoodItemAdapter.MyViewHolder>{
    List<FoodItem> foodList;

    public FoodItemAdapter(List<FoodItem> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter dengan layout)
        View foodItemView = layoutInflater.inflate(R.layout.item_food,parent,false);
        //object foodItemView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(foodItemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //ambil satu item food
        FoodItem food = foodList.get(position);
        //set text foodName berdasarkan data dari model food
        holder.foodName.setText(food.getFoodName());
        holder.foodImage.setImageResource(food.getImageUrl());
    }

    @Override
    public int getItemCount() {
        return (foodList != null) ? foodList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView foodName;
        public ImageView foodImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.foodName);
            foodImage = itemView.findViewById(R.id.picFood);
        }
    }
}
