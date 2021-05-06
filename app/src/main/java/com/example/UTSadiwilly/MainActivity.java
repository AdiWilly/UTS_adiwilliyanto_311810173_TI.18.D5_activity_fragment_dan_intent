package com.example.UTSadiwilly;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemReselectedListener navigation = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.txtemail:
                    f = new FragmentEmail();
                    break;
                case R.id.txtmap:
                    f = new FragmentMap();
                    break;
                case R.id.txttelp:
                    f = new FragmentTelp();
                    break;
                case R.id.txtweb:
                    f = new FragmentWeb();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigatiom_menu);
        bottomNavigationView.setOnNavigationItemReselectedListener(navigation);

    }
}