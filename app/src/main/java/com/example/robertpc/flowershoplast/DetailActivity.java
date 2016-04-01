package com.example.robertpc.flowershoplast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.robertpc.flowershoplast.model.Flower;

public class DetailActivity extends AppCompatActivity {
    ImageView flowerImage;
    TextView title;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Flower flower = (Flower) intent.getSerializableExtra("flower");

        flowerImage = (ImageView) findViewById(R.id.imageDetail);
        title = (TextView) findViewById(R.id.titleDetail);
        price = (TextView) findViewById(R.id.prictDetail);

        flowerImage.setImageResource(flower.getImg());
        title.setText(flower.getTitle());
        price.setText(flower.getPrice());


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                super.onBackPressed();
                overridePendingTransition(R.anim.enter_right, R.anim.exit_left);
        }
        return super.onOptionsItemSelected(item);
    }
}
