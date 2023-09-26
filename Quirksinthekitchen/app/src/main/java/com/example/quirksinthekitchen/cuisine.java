package com.example.quirksinthekitchen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class cuisine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);

    }
    public void title(View view){
        int id = view.getId();
        String cuisine="";
        switch (id) {
            case R.id.imageView2:
                cuisine="south";

                break;
            case R.id.imageView3:
                cuisine="north";

                break;
            case R.id.imageView4:
                cuisine="korean";

                break;
            case R.id.imageView5:
                cuisine="chinese";

                break;
        }
        Intent intent=new Intent(cuisine.this,MainActivity2.class);
        intent.putExtra("cuisine",cuisine);
        startActivity(intent);
    }
    }
