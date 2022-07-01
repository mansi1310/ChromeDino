package com.example.chromedino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TreatmentPage extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Treatmentgrid adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment_page);

//                  layout  @Override
//                    protected void onCreate(Bundle savedInstanceState) {
//                        super.onCreate(savedInstanceState);
//                        activityBeauti2Binding =ActivityBeauti2Binding.inflate(getLayoutInflater());
//                        setContentView(activityBeauti2Binding.getRoot());
//                        allocateActivityTitle("Dashboard");
                        dataList =findViewById(R.id.recycle);

                        titles=new ArrayList<>();
                        images=new ArrayList<>();


                        titles.add("Bipolar Disoder");
                        titles.add("Eating Disorder");
                        titles.add("Obsessive Compulsive Disorder");
                        titles.add("Anxiety");
                        titles.add("Depression");
                        titles.add("Post Traumatic Stress Disorder");
                        titles.add("Schizophrenia");



                        images.add(R.drawable.bd);
                        images.add(R.drawable.ed);
                        images.add(R.drawable.ocd);
                        images.add(R.drawable.anxiety);
                        images.add(R.drawable.depression);
                        images.add(R.drawable.ptsd);
                        images.add(R.drawable.schizophrenia);


                        adapter = new Treatmentgrid( this,titles,images);

                        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
                        dataList.setLayoutManager(gridLayoutManager);
                        dataList.setAdapter(adapter);





                    }
                }

