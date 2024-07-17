package com.example.fourth_sem_project;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //ActionBar actionBar=getSupportActionBar();
    }

   // @Override
   // public boolean onCreateOptionsMenu(Menu menu) {
      //  MenuInflater inflater=getMenuInflater();
      //  inflater.inflate(R.menu.menu,menu);
       // return true;

//}
}