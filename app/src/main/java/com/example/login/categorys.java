package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.example.login.Retrofit.RetrofitClient;
import com.example.login.Retrofit.IMyService;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.rengwuxian.materialedittext.MaterialEditText;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class categorys extends AppCompatActivity {
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    IMyService iMyService;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorys);

    }
    public void openActivity2(View view) {
        //Init service
        Retrofit retrofitClient= RetrofitClient.getInstance();
        iMyService = retrofitClient.create(IMyService.class);
        View activity_infocategorys = LayoutInflater.from(categorys.this)
                .inflate(R.layout.activity_infocategorys, null);

        new MaterialStyledDialog.Builder(categorys.this)
                .setIcon(R.drawable.plus_icon)
                .setTitle("ADD CATEGORY")
                .setDescription("please fill all fields")
                .setCustomView(activity_infocategorys)
                .setNegativeText("CANCEL")
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveText("ADD")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                        MaterialEditText edt_title = (MaterialEditText)activity_infocategorys.findViewById(R.id.edt_title);
                        MaterialEditText edt_price = (MaterialEditText)activity_infocategorys.findViewById(R.id.edt_price);
                        MaterialEditText edt_Date = (MaterialEditText)activity_infocategorys.findViewById(R.id.edt_Date);
                        String url_img = "https://pngimage.net/wp-content/uploads/2018/06/icone-nourriture-png-1.png";
                        if(TextUtils.isEmpty(edt_title.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Email cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if(TextUtils.isEmpty(edt_price.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Name cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if(TextUtils.isEmpty(edt_Date.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Password cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        categoriesUser(edt_title.getText().toString(),
                                edt_price.getText().toString(),
                                edt_Date.getText().toString(),
                                url_img);



                    }
                }).show();
    }
    public void coffe(View view) {
        //Init service
        Retrofit retrofitClient= RetrofitClient.getInstance();
        iMyService = retrofitClient.create(IMyService.class);
        View infocoffe = LayoutInflater.from(categorys.this)
                .inflate(R.layout.infocoffe, null);

        new MaterialStyledDialog.Builder(categorys.this)
                .setIcon(R.drawable.plus_icon)
                .setTitle("ADD CATEGORY")
                .setDescription("please fill all fields")
                .setCustomView(infocoffe)
                .setNegativeText("CANCEL")
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveText("ADD")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                        MaterialEditText edt_title = (MaterialEditText)infocoffe.findViewById(R.id.edt_title);
                        MaterialEditText edt_price = (MaterialEditText)infocoffe.findViewById(R.id.edt_price);
                        MaterialEditText edt_Date = (MaterialEditText)infocoffe.findViewById(R.id.edt_Date);
                        String url_img ="https://pngimage.net/wp-content/uploads/2020/01/coffee-mug-cartoon-images-png-3.png";
                        if(TextUtils.isEmpty(edt_title.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Email cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if(TextUtils.isEmpty(edt_price.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Name cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if(TextUtils.isEmpty(edt_Date.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Password cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        categoriesUser(edt_title.getText().toString(),
                                edt_price.getText().toString(),
                                edt_Date.getText().toString(),
                                url_img);



                    }
                }).show();
    }

    public void car(View view) {
        //Init service
        Retrofit retrofitClient= RetrofitClient.getInstance();
        iMyService = retrofitClient.create(IMyService.class);
        View infocar = LayoutInflater.from(categorys.this)
                .inflate(R.layout.infocar, null);

        new MaterialStyledDialog.Builder(categorys.this)
                .setIcon(R.drawable.plus_icon)
                .setTitle("ADD CATEGORY")
                .setDescription("please fill all fields")
                .setCustomView(infocar)
                .setNegativeText("CANCEL")
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveText("ADD")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                        MaterialEditText edt_title = (MaterialEditText)infocar.findViewById(R.id.edt_title);
                        MaterialEditText edt_price = (MaterialEditText)infocar.findViewById(R.id.edt_price);
                        MaterialEditText edt_Date = (MaterialEditText)infocar.findViewById(R.id.edt_Date);
                        String url_img ="https://pngimage.net/wp-content/uploads/2019/05/race-car-icon-png-1.png";
                        if(TextUtils.isEmpty(edt_title.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Email cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if(TextUtils.isEmpty(edt_price.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Name cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if(TextUtils.isEmpty(edt_Date.getText().toString()))
                        {
                            Toast.makeText(categorys.this, "Password cannot be null or empty", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        categoriesUser(edt_title.getText().toString(),
                                edt_price.getText().toString(),
                                edt_Date.getText().toString(),
                                url_img);



                    }
                }).show();
    }
    private void categoriesUser(String title, String price, String date, String img) {
        compositeDisposable.add(iMyService.categoriesUser(title,price,date,img)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String response) {
                        Toast.makeText(categorys.this, ""+response, Toast.LENGTH_SHORT).show();




                    }
                }));
    }
    public void retour(View view) {
        Intent beach = new Intent(categorys.this, home.class);
        startActivity(beach);
    }
}