package com.example.quirksinthekitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class popup extends AppCompatActivity {

    private List<Tip> tips = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        TextView tipTextView = findViewById(R.id.tip_text_view);
        ImageView tipImageView = findViewById(R.id.tip_image_view);
        Button dismissButton = findViewById(R.id.dismiss_button);
        tips.add(new Tip(" Apples give you more energy than coffee.", R.drawable.apple));
        tips.add(new Tip(" Pistachios are actually fruits. ", R.drawable.pista));
        tips.add(new Tip(" Broccoli contains more protein than chicken", R.drawable.broc));
        tips.add(new Tip(" Bananas are berries... and strawberries aren't!", R.drawable.br));
        tips.add(new Tip("Potatoes were the first food planted in space", R.drawable.pot));
        int randomIndex = (int) (Math.random() * tips.size());
        Tip randomTip = tips.get(randomIndex);
        tipTextView.setText(randomTip.getText());
        tipImageView.setImageResource(randomTip.getImageResource());
        dismissButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(popup.this,cuisine.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

    }
}