package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login.ui.AccountFragmet;
import com.example.login.ui.StaticsFragmet;
import com.example.login.ui.products;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener, NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;

    List<products> lstproducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lstproducts= new ArrayList<>();
        lstproducts.add(new products("ddddd","description","500","jj/mm/aa" , "https://siteq.com.tn/uploads/products/peinture-a-l-eau-40kg-siteq.jpg"));
        lstproducts.add(new products("ddddd","description","500","jj/mm/aa" , "https://siteq.com.tn/uploads/products/peinture-a-l-eau-40kg-siteq.jpg"));
        lstproducts.add(new products("ddddd","description","500","jj/mm/aa" , "https://siteq.com.tn/uploads/products/peinture-a-l-eau-40kg-siteq.jpg"));
        lstproducts.add(new products("ddddd","description","500","jj/mm/aa" , "https://siteq.com.tn/uploads/products/peinture-a-l-eau-40kg-siteq.jpg"));
        lstproducts.add(new products("ddddd","description","500","jj/mm/aa" , "https://siteq.com.tn/uploads/products/peinture-a-l-eau-40kg-siteq.jpg"));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycleview);
        AD myAdapter = new AD(home.this, lstproducts);
        myrv.setLayoutManager(new GridLayoutManager(home.this,1));
        myrv.setAdapter(myAdapter);


        /*Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(home.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.months));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);*/
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    int id = item.getItemId();

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            if(id == R.id.nav_home){
                                Intent myintent = new Intent (home.this, home.class);
                                startActivity(myintent);
                                return false;
                            }
                            break;
                        case R.id.nav_statics:
                        selectedFragment = new StaticsFragmet();
                        break;
                        case R.id.nav_account:
                            selectedFragment = new AccountFragmet();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }


            };




    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {super.onBackPressed();
        }
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();


    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
    public void openActivity(View view) {
        Intent beach = new Intent(home.this, categorys.class);
        startActivity(beach);
    }






    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}
