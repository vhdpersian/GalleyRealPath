package com.example.v_karimi.badger;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.v_karimi.badger.bdg.Badges;
import com.example.v_karimi.badger.bdg.BadgesNotSupportedException;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnAddBadger_sony;
    Button btnAddBadger_sam;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddBadger_sony=(Button)findViewById(R.id.btnAddBadger_sony);

        btnAddBadger_sony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Badges.setBadge(getApplicationContext(),++count);
                } catch (BadgesNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
