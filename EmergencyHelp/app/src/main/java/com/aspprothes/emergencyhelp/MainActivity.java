package com.aspprothes.emergencyhelp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.aspprothes.emergencyhelp.cyberbullying.CyberBullyingActivity;
import com.aspprothes.emergencyhelp.networkchecker.Common;
import com.aspprothes.emergencyhelp.policecontact.DistrictsActivity;
import com.aspprothes.emergencyhelp.policecontact.DivisionActivity;
import com.aspprothes.emergencyhelp.policecontact.UpazilaThanaAndEmergencyContact;
import com.bumptech.glide.Glide;
import com.mursaat.extendedtextview.AnimatedGradientTextView;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {
    private NetworkConnectionCheck networkConnectionCheck = new NetworkConnectionCheck();
    private AnimatedGradientTextView animatedGradientTextView;
    private ArrayList<HashMap<String,String>> gridCatagoryList = new ArrayList<>();
    private HashMap<String,String> gridCatagoryMap = new HashMap<>();
    private ArrayList<HashMap<String,String>> allCatagoryDataList = new ArrayList<>();
    private HashMap<String,String> allCatagoryDataMap = new HashMap<>();
    private ArrayList<HashMap<String,String>> allHotlineNoList = new ArrayList<>();
    private HashMap<String,String> allHotlineNoMap = new HashMap<>();
    private GridView gridView;
    private ImageCarousel carousel;
    private LinearLayout linearLayoutMain,no_internet_linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setStatusBarColor(getResources().getColor(R.color.colors1));
        this.getWindow().setNavigationBarColor(getResources().getColor(R.color.colors1));
        setContentView(R.layout.main_activity);

        gridView = findViewById(R.id.gridView);
        linearLayoutMain = findViewById(R.id.linearLayoutMain);
        no_internet_linearLayout = findViewById(R.id.no_internet_linearLayout);
        animatedGradientTextView = findViewById(R.id.animatedGradientTextView);
        carousel = findViewById(R.id.carousel);
        animatedGradientTextView.setText(getString(R.string.app_name));

        gridItemsData();

        GridCatagoryItems gridCatagoryItems = new GridCatagoryItems();
        gridView.setAdapter(gridCatagoryItems);
    }
    // =========================================================================================
    // =========================================================================================
    // =========================================================================================


    // ======================= Home Grid Items Data Start Here =================================
    public void gridItemsData(){
        gridCatagoryMap = new HashMap<>();
        gridCatagoryMap.put("grid_img",getString(R.string.hotline_call_grid_items_img));
        gridCatagoryMap.put("grid_title","জরুরী সহায়তা\nহটলাইন নম্বর");
        gridCatagoryMap.put("catagory","hotline");
        gridCatagoryList.add(gridCatagoryMap);

        gridCatagoryMap = new HashMap<>();
        gridCatagoryMap.put("grid_img",getString(R.string.bd_police_grid_items_img));
        gridCatagoryMap.put("grid_title","বাংলাদেশ\nপুলিশ সহায়তা");
        gridCatagoryMap.put("catagory","bdpolice");
        gridCatagoryList.add(gridCatagoryMap);

        gridCatagoryMap = new HashMap<>();
        gridCatagoryMap.put("grid_img",getString(R.string.c_s_grid_items_img));
        gridCatagoryMap.put("grid_title","সাইবার ক্রাইম\nইউনিট");
        gridCatagoryMap.put("catagory","ccunit");
        gridCatagoryList.add(gridCatagoryMap);

        gridCatagoryMap = new HashMap<>();
        gridCatagoryMap.put("grid_img",getString(R.string.cyber_bulling_grid_items_img));
        gridCatagoryMap.put("grid_title","সাইবার বুলিং\nঅপরাধ");
        gridCatagoryMap.put("catagory","cyberbulling");
        gridCatagoryList.add(gridCatagoryMap);
    }// ======================= Home Grid Items Data End Here =================================


    // ======================= BD Police Items Data Start Here =================================
    public void bdPoliceItemsData(){
        allCatagoryDataList.clear();

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","বরিশাল\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.barisal_division_img));
        allCatagoryDataMap.put("division","barisal");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","ঢাকা\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.dhaka_division_img));
        allCatagoryDataMap.put("division","dhaka");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","খুলনা\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.khulna_division_img));
        allCatagoryDataMap.put("division","khulna");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","চট্টগ্রাম\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.chattogram_division_img));
        allCatagoryDataMap.put("division","chattogram");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","রাজশাহী\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.rajshahi_division_img));
        allCatagoryDataMap.put("division","rajshahi");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","রংপুর\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.rangpur_division_img));
        allCatagoryDataMap.put("division","rangpur");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","ময়মনসিংহ\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.mymenshing_division_img));
        allCatagoryDataMap.put("division","mymensingh");
        allCatagoryDataList.add(allCatagoryDataMap);

        allCatagoryDataMap = new HashMap<>();
        allCatagoryDataMap.put("item_title","সিলেট\nবিভাগ");
        allCatagoryDataMap.put("img_url",getString(R.string.sylet_division_img));
        allCatagoryDataMap.put("division","sylhet");
        allCatagoryDataList.add(allCatagoryDataMap);
    }// ======================= BD Police Items Data End Here =================================

    // ======================= BD Hotlines Data Start Here =================================
    public void allHotLineNumbers(){
        allHotlineNoList.clear();

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","জরুরি সেবা");
        allHotlineNoMap.put("num","999");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","ফায়ার সার্ভিস");
        allHotlineNoMap.put("num","102");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","শিশু সহায়তা");
        allHotlineNoMap.put("num","1098");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","নারী ও শিশু নির্যাতন-১");
        allHotlineNoMap.put("num","109");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","নারী ও শিশু নির্যাতন-২");
        allHotlineNoMap.put("num","10921");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","জাতীয় পরিচয়পত্র");
        allHotlineNoMap.put("num","105");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","সরকারী আইন সেবা");
        allHotlineNoMap.put("num","16430");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","দুর্যোগের আগাম বার্তা");
        allHotlineNoMap.put("num","10941");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","দুদক হটলাইন");
        allHotlineNoMap.put("num","106");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","কৃষি বিষয়ক পরামর্শ");
        allHotlineNoMap.put("num","16123");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","স্বাস্থ্য বিষয়ক পরামর্শ");
        allHotlineNoMap.put("num","16263");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","মানবাধিকার সহায়ক");
        allHotlineNoMap.put("num","16108");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","ইউনিয়ন পরিষদ সহায়তা");
        allHotlineNoMap.put("num","16256");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","বাংলাদেশ রেলওয়ে");
        allHotlineNoMap.put("num","131");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","বিটিআরসি");
        allHotlineNoMap.put("num","100");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","বিটিসিএল");
        allHotlineNoMap.put("num","16420");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","ব্যাংকিং সেবা");
        allHotlineNoMap.put("num","16236");
        allHotlineNoList.add(allHotlineNoMap);

        allHotlineNoMap = new HashMap<>();
        allHotlineNoMap.put("images",getString(R.string.emergency_images));
        allHotlineNoMap.put("name","সরকারি তথ্য সেবা");
        allHotlineNoMap.put("num","333");
        allHotlineNoList.add(allHotlineNoMap);
    }
    // ======================= BD Hotlines Data End Here =================================



    // =============================  Base Adapter Start Here ================================
    public class GridCatagoryItems extends BaseAdapter {
        @Override
        public int getCount() {
            return gridCatagoryList.size();
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null){
                LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = layoutInflater.inflate(R.layout.this_activity_gridview_layout_design,parent,false);
            }
            ImageView gridImgView = convertView.findViewById(R.id.gridImgView);
            AnimatedGradientTextView gridAnimatedTxt = convertView.findViewById(R.id.gridAnimatedTxt);
            NeumorphCardView gridItemsCardView = convertView.findViewById(R.id.gridItemsCardView);
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap = gridCatagoryList.get(position);
            String getImgUrl = hashMap.get("grid_img");
            String getTitle = hashMap.get("grid_title");
            String getCatagory = hashMap.get("catagory");
            Glide.with(MainActivity.this)
                    .load(getImgUrl)
                    .circleCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(gridImgView);
            gridAnimatedTxt.setText(""+getTitle);

            gridItemsCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (getCatagory != null && getCatagory.contains("hotline")){
                        allHotLineNumbers();
                        UpazilaThanaAndEmergencyContact.arrayList = allHotlineNoList;
                        UpazilaThanaAndEmergencyContact.title = "সমগ্র হটলাইন\nনম্বর সমূহ";
                        startActivity(new Intent(MainActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("bdpolice")) {
                        bdPoliceItemsData();
                        DivisionActivity.arrayList = allCatagoryDataList;
                        startActivity(new Intent(MainActivity.this, DivisionActivity.class));
                    }else if (getCatagory != null && getCatagory.contains("ccunit")) {

                    }else if (getCatagory != null && getCatagory.contains("cyberbulling")) {
                        startActivity(new Intent(MainActivity.this, CyberBullyingActivity.class));
                    }
                }
            });


            return convertView;
        }
    }// =============================  Base Adapter End Here ================================





    // =============================== My Carousel Start Here ====================================================
    public void myCarousel(){
        carousel.addData(new CarouselItem(getString(R.string.hotline_num_carousel_img),"জরুরী সহায়তা হটলাইন নম্বর"));
        carousel.addData(new CarouselItem(getString(R.string.bd_police_carousel_img),"বাংলাদেশ পুলিশ সহায়তা"));
        carousel.addData(new CarouselItem(getString(R.string.cyber_security_carousel_img),"সাইবার ক্রাইম ইউনিট"));
        carousel.addData(new CarouselItem(getString(R.string.cyber_bulling_carousel_img),"সাইবার বুলিং অপরাধ"));
    }// =============================== My Carousel End Here ====================================================


    // =============================  Check Network Connection Start Here ====================
    public class NetworkConnectionCheck extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            if (!Common.isNetworkConnected(context)){
                linearLayoutMain.setVisibility(View.GONE);
                no_internet_linearLayout.setVisibility(View.VISIBLE);
            }else{
                no_internet_linearLayout.setVisibility(View.GONE);
                linearLayoutMain.setVisibility(View.VISIBLE);
                myCarousel();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkConnectionCheck,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(networkConnectionCheck);
    }

    /** @noinspection deprecation*/
    @Override
    public void onBackPressed() {
        if (isTaskRoot()){
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Warning !!!")
                    .setMessage("Do you want to exit this apps ?")
                    .setIcon(getDrawable(R.drawable.alert))
                    .setCancelable(true)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .show();
            alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.colors1));
            alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.colors1));
        }else{
            super.onBackPressed();
        }
    }

}
