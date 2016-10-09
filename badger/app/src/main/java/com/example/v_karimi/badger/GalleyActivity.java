package com.example.v_karimi.badger;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GalleyActivity extends AppCompatActivity {

    Button btnGalley;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galley);

        btnGalley=(Button)findViewById(R.id.btnGalley);

        btnGalley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGalley=new Intent(Intent.ACTION_OPEN_DOCUMENT);
               // intentGalley.setAction(Intent.ACTION_GET_CONTENT);
                intentGalley.addCategory(Intent.CATEGORY_OPENABLE);
                intentGalley.setType("image/*");
                startActivityForResult(intentGalley,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode==RESULT_OK)
        {

            if (requestCode==1)
            {
                Uri uri=data.getData();
                Log.d("uri",uri.toString());

            }
        }

    }
}
