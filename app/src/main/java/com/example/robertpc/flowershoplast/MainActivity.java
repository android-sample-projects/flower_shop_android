package com.example.robertpc.flowershoplast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.robertpc.flowershoplast.model.Flower;
import com.example.robertpc.flowershoplast.recyclerview.FlowerRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Flower> flowerList = new ArrayList<>();
    private RecyclerView recyclerView;
    private FlowerRecyclerViewAdapter mAdapter;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new FlowerRecyclerViewAdapter(flowerList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        sampleFlowerData();

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    private void sampleFlowerData() {
        Flower flower = new Flower("My Fine Lady", "$30.00", R.drawable.flower);
        flowerList.add(flower);

        flower = new Flower("Delicately Soft", "$20.00", R.drawable.soft_img);
        flowerList.add(flower);

        flower = new Flower("Cheerfulness Love", "$40.00", R.drawable.love_img);
        flowerList.add(flower);

        flower = new Flower("1 Dozen of Red Roses in Box", "$25.00", R.drawable.box_img);
        flowerList.add(flower);

        flower = new Flower("Outspoken Desire", "$15.00", R.drawable.box2_img);
        flowerList.add(flower);

        flower = new Flower("Long Lasting Love", "$10.00", R.drawable.love_img);
        flowerList.add(flower);

        flower = new Flower("Blooming the day", "$50.00", R.drawable.bloom_img);
        flowerList.add(flower);

        flower = new Flower("1 Dozen of Pink Roses in Box", "$70.00", R.drawable.long_img);
        flowerList.add(flower);

        flower = new Flower("My Fine Lady", "$30.00", R.drawable.box_img);
        flowerList.add(flower);

        flower = new Flower("Delicately Soft", "$20.00", R.drawable.flower_img);
        flowerList.add(flower);

        flower = new Flower("Cheerfulness Love", "$40.00", R.drawable.flower);
        flowerList.add(flower);

        mAdapter.notifyDataSetChanged();
    }
}
