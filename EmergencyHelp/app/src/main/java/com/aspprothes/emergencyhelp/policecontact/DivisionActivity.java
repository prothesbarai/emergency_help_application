package com.aspprothes.emergencyhelp.policecontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
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

import com.aspprothes.emergencyhelp.R;
import com.aspprothes.emergencyhelp.networkchecker.Common;
import com.bumptech.glide.Glide;
import com.mursaat.extendedtextview.AnimatedGradientTextView;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class DivisionActivity extends AppCompatActivity {
    private AnimatedGradientTextView animatedGradientTextView;
    public static ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    private NetworkConnectionCheck networkConnectionCheck = new NetworkConnectionCheck();
    private LinearLayout linearLayoutMain,no_internet_linearLayout;
    private GridView gridView;
    private ImageCarousel carousel;
    private ArrayList<HashMap<String,String>> districtList = new ArrayList<>();
    private HashMap<String,String> districtMap = new HashMap<>();

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
        animatedGradientTextView.setText(R.string.division_activity_name);

        GridDivisionItems gridDivisionItems = new GridDivisionItems();
        gridView.setAdapter(gridDivisionItems);
    }
    // =========================================================================================
    // =========================================================================================
    // =========================================================================================

    // ============================== Start District Data Function =============================
    public void barisalDivision(){
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","বরিশাল জেলা");
        districtMap.put("catagory","barisal");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","পটুয়াখালী জেলা");
        districtMap.put("catagory","patuakhali");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ভোলা জেলা");
        districtMap.put("catagory","bhola");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","বরগুনা জেলা");
        districtMap.put("catagory","barguna");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ঝালকাঠি জেলা");
        districtMap.put("catagory","jhalkathi");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","পিরোজপুর জেলা");
        districtMap.put("catagory","pirojpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void dhakaDivision(){
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","ঢাকা জেলা");
        districtMap.put("catagory","dhaka");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","গাজীপুর জেলা");
        districtMap.put("catagory","gazipur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নারায়ণগঞ্জ জেলা");
        districtMap.put("catagory","narayanganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নরসিংদী জেলা");
        districtMap.put("catagory","narosingdi");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","মুন্সিগঞ্জ জেলা");
        districtMap.put("catagory","munsiganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","মানিকগঞ্জ জেলা");
        districtMap.put("catagory","manikganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","টাঙ্গাইল জেলা");
        districtMap.put("catagory","tangail");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","কিশোরগঞ্জ জেলা");
        districtMap.put("catagory","kisorganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ফরিদপুর জেলা");
        districtMap.put("catagory","faridpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","মাদারিপুর জেলা");
        districtMap.put("catagory","madaripur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","শরিয়তপুর জেলা");
        districtMap.put("catagory","soriatpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","গোপালগঞ্জ জেলা");
        districtMap.put("catagory","gopalganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","রাজবাড়ি জেলা");
        districtMap.put("catagory","rajbari");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void khulnaDivision() {
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","কুষ্টিয়া জেলা");
        districtMap.put("catagory","kustia");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","খুলনা জেলা");
        districtMap.put("catagory","khulna");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","চুয়াডাঙ্গা জেলা");
        districtMap.put("catagory","chuyadanga");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ঝিনাইদহ জেলা");
        districtMap.put("catagory","jhinaidoho");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নড়াইল জেলা");
        districtMap.put("catagory","norail");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","বাগেরহাট জেলা");
        districtMap.put("catagory","bagerhat");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","মাগুরা জেলা");
        districtMap.put("catagory","magura");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","মেহেরপুর জেলা");
        districtMap.put("catagory","meherpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","যশোর জেলা");
        districtMap.put("catagory","jassor");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","সাতক্ষীরা জেলা");
        districtMap.put("catagory","satkhira");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void chattogramDivision() {
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","চট্টগ্রাম জেলা");
        districtMap.put("catagory","chattogram");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","কক্সবাজার জেলা");
        districtMap.put("catagory","coxbazar");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","রাঙ্গামাটি জেলা");
        districtMap.put("catagory","ragamati");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","বান্দরবান জেলা");
        districtMap.put("catagory","bandorban");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","খাগড়াছড়ি জেলা");
        districtMap.put("catagory","khagrachori");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ফেনী জেলা");
        districtMap.put("catagory","feni");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","লক্ষ্মীপুর জেলা");
        districtMap.put("catagory","lokkhipur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","কুমিল্লা জেলা");
        districtMap.put("catagory","cumilla");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নোয়াখালী জেলা");
        districtMap.put("catagory","noyakhali");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ব্রাহ্মণবাড়িয়া জেলা");
        districtMap.put("catagory","berammonbariya");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","চাঁদপুর জেলা");
        districtMap.put("catagory","chadpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void rajshahiDivision() {
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","সিরাজগঞ্জ জেলা");
        districtMap.put("catagory","serajgonj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","পাবনা জেলা");
        districtMap.put("catagory","pabna");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","বগুড়া জেলা");
        districtMap.put("catagory","bagura");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","রাজশাহী জেলা");
        districtMap.put("catagory","rajshahi");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নাটোর জেলা");
        districtMap.put("catagory","natore");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","জয়পুরহাট জেলা");
        districtMap.put("catagory","joypurhat");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","চাঁপাইনবাবগঞ্জ জেলা");
        districtMap.put("catagory","chapainobabganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নওগাঁ জেলা");
        districtMap.put("catagory","naoga");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void rangpurDivision() {
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","রংপুর জেলা");
        districtMap.put("catagory","rangpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","দিনাজপুর জেলা");
        districtMap.put("catagory","dinajpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","পঞ্চগড় জেলা");
        districtMap.put("catagory","panchogor");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","ঠাকুরগাঁও জেলা");
        districtMap.put("catagory","thakurgao");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","গাইবান্ধা জেলা");
        districtMap.put("catagory","gaibandha");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","কুড়িগ্রাম জেলা");
        districtMap.put("catagory","kurigram");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নীলফামারী জেলা");
        districtMap.put("catagory","nillphamari");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","লালমনিরহাট জেলা");
        districtMap.put("catagory","lalmonirhat");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void mymenshingDivision() {
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("distric","ময়মনসিংহ জেলা");
        districtMap.put("catagory","mymensingh");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","নেত্রকোনা জেলা");
        districtMap.put("catagory","netrokona");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","শেরপুর জেলা");
        districtMap.put("catagory","sherpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","জামালপুর জেলা");
        districtMap.put("catagory","jamalpur");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    public void sylhetDivision() {
        districtList.clear();

        districtMap = new HashMap<>();
        districtMap.put("img",getString(R.string.district_images));
        districtMap.put("distric","সিলেট জেলা");
        districtMap.put("catagory","syhlet");
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("img",getString(R.string.district_images));
        districtMap.put("distric","মৌলভীবাজার জেলা");
        districtMap.put("catagory","moulovibazar");
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","হবিগঞ্জ জেলা");
        districtMap.put("catagory","hobiganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);

        districtMap = new HashMap<>();
        districtMap.put("distric","সুনামগঞ্জ জেলা");
        districtMap.put("catagory","sunamganj");
        districtMap.put("img",getString(R.string.district_images));
        districtList.add(districtMap);
    }
    // ============================== End District Data Function ===============================



    // =============================  Base Adapter Start Here ================================
    public class GridDivisionItems extends BaseAdapter{
        @Override
        public int getCount() {
            return arrayList.size();
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
            HashMap<String,String> hashMap = arrayList.get(position);
            String getImgUrl = hashMap.get("img_url");
            String getTitle = hashMap.get("item_title");
            String division = hashMap.get("division");
            Glide.with(DivisionActivity.this)
                    .load(getImgUrl)
                    .circleCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(gridImgView);
            gridAnimatedTxt.setText(""+getTitle);


            gridItemsCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (division != null && division.contains("barisal")){
                        barisalDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "বরিশাল বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("dhaka")) {
                        dhakaDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "ঢাকা বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("khulna")) {
                        khulnaDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "খুলনা বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("chattogram")) {
                        chattogramDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "চট্টগ্রাম বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("rajshahi")) {
                        rajshahiDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "রাজশাহী বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("rangpur")) {
                        rangpurDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "রংপুর বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("mymensingh")) {
                        mymenshingDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "ময়মনসিংহ বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }else if (division != null && division.contains("sylhet")) {
                        sylhetDivision();
                        DistrictsActivity.arrayList = districtList;
                        DistrictsActivity.title = "সিলেট বিভাগের"+getResources().getString(R.string.district_title);
                        startActivity(new Intent(DivisionActivity.this, DistrictsActivity.class));
                    }


                }
            });



            return convertView;
        }
    }// =============================  Base Adapter End Here ================================


    // =============================== My Carousel Start Here ====================================================
    public void myCarousel(){
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_barisal),"বরিশাল শহর"));
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_dhaka),"ঢাকা শহর"));
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_khulna),"খুলনা শহর"));
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_chattogram),"চট্টগ্রাম শহর"));

        carousel.addData(new CarouselItem(getString(R.string.division_carousel_rajshahi),"রাজশাহী শহর"));
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_rangpur),"রংপুর শহর"));
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_mymenshingh),"ময়মনসিংহ শহর"));
        carousel.addData(new CarouselItem(getString(R.string.division_carousel_sylhet),"সিলেট শহর"));
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


}