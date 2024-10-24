package com.aspprothes.emergencyhelp.policecontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.aspprothes.emergencyhelp.R;
import com.aspprothes.emergencyhelp.networkchecker.Common;
import com.bumptech.glide.Glide;
import com.mursaat.extendedtextview.AnimatedGradientTextView;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class DistrictsActivity extends AppCompatActivity {
    private NetworkConnectionCheck networkConnectionCheck = new NetworkConnectionCheck();
    private LinearLayout linearLayoutMain,no_internet_linearLayout;
    public static String title = "";
    private AnimatedGradientTextView districtTitle;
    private ListView listView;
    public static ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    private ArrayList<HashMap<String,String>> UpazilaList = new ArrayList<>();
    private HashMap<String,String> UpazilaMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setNavigationBarColor(getResources().getColor(R.color.colors1));
        this.getWindow().setStatusBarColor(getResources().getColor(R.color.colors1));
        setContentView(R.layout.district_thana_hotline_desine_in_one);

        districtTitle = findViewById(R.id.districtTitle);
        linearLayoutMain = findViewById(R.id.linearLayoutMain);
        no_internet_linearLayout = findViewById(R.id.no_internet_linearLayout);
        listView = findViewById(R.id.listView);
        districtTitle.setText(""+title);

        DistrictListViewAdapter districtListViewAdapter = new DistrictListViewAdapter();
        listView.setAdapter(districtListViewAdapter);
    }
    // =========================================================================================
    // =========================================================================================
    // =========================================================================================
    public void barisalDistrict(){
        UpazilaList.clear();

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","বরিশাল সদর উপজেলা");
        UpazilaMap.put("num","01722835046");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","আগৈলঝাড়া উপজেলা");
        UpazilaMap.put("num","01713374274");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","বাকেরগঞ্জ উপজেলা");
        UpazilaMap.put("num","01713374272");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","বাবুগঞ্জ উপজেলা");
        UpazilaMap.put("num","01713374271");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","গৌরনদী উপজেলা");
        UpazilaMap.put("num","01713374275");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","বানারীপাড়া উপজেলা");
        UpazilaMap.put("num","01713374273");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","হিজলা উপজেলা");
        UpazilaMap.put("num","01713374268");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","উজিরপুর উপজেলা");
        UpazilaMap.put("num","01713374276");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","মুলাদী উপজেলা");
        UpazilaMap.put("num","01713374270");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","মেহেন্দিগঞ্জ উপজেলা");
        UpazilaMap.put("num","01713374269");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","কোতয়ালী থানা");
        UpazilaMap.put("num","01713374267");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","বিমানবন্দর থানা");
        UpazilaMap.put("num","01974144240");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","কাউনিয়া থানা");
        UpazilaMap.put("num","01781351818");
        UpazilaList.add(UpazilaMap);

        UpazilaMap = new HashMap<>();
        UpazilaMap.put("images",getString(R.string.police_images));
        UpazilaMap.put("name","কাজিরহাট থানা");
        UpazilaMap.put("num","01320151420");
        UpazilaList.add(UpazilaMap);
    }
    public void patuaKhaliDistrict() {
        UpazilaList.clear();
    }
    public void bholaDistrict() {
        UpazilaList.clear();
    }
    public void borgunaDistrict() {
        UpazilaList.clear();
    }
    public void jhalokhatiDistrict() {
        UpazilaList.clear();
    }
    public void perojPurDistrict() {
        UpazilaList.clear();
    }
    public void dhakaDistrict() {
        UpazilaList.clear();
    }
    public void gajipurDistrict() {
        UpazilaList.clear();
    }
    public void narayanGanjDistrict() {
        UpazilaList.clear();
    }
    public void naroshingdiDistrict() {
        UpazilaList.clear();
    }
    public void munshiganjDistrict() {
        UpazilaList.clear();
    }
    public void manikganjDistrict() {
        UpazilaList.clear();
    }
    public void tangailDistrict() {
        UpazilaList.clear();
    }
    public void kisorganjDistrict() {
        UpazilaList.clear();
    }
    public void faridpurDistrict() {
        UpazilaList.clear();
    }
    public void madaripurDistrict() {
        UpazilaList.clear();
    }
    public void sariyatpurDistrict() {
        UpazilaList.clear();
    }
    public void gopalganjDistrict() {
        UpazilaList.clear();
    }
    public void rajbariDistrict() {
        UpazilaList.clear();
    }
    public void kustiaDistrict() {
        UpazilaList.clear();
    }
    public void khulnaDistrict() {
        UpazilaList.clear();
    }
    public void chuyaDangaDistrict() {
        UpazilaList.clear();
    }
    public void jhinaidohoDistrict() {
        UpazilaList.clear();
    }
    public void norialDistrict() {
        UpazilaList.clear();
    }
    public void bagerhatDistrict() {
        UpazilaList.clear();
    }
    public void maguraDistrict() {
        UpazilaList.clear();
    }
    public void meherpurDistrict() {
        UpazilaList.clear();
    }
    public void jassorDistrict() {
        UpazilaList.clear();
    }
    public void satkhiraDistrict() {
        UpazilaList.clear();
    }
    public void chattogramDistrict() {
        UpazilaList.clear();
    }
    public void coxbazarDistrict() {
        UpazilaList.clear();
    }
    public void rangaMatiDistrict() {
        UpazilaList.clear();
    }
    public void bandorbanDistrict() {
        UpazilaList.clear();
    }
    public void khagrachoriDistrict() {
        UpazilaList.clear();
    }
    public void feniDistrict() {
        UpazilaList.clear();
    }
    public void lokkhipurDistrict() {
        UpazilaList.clear();
    }
    public void cumillaDistrict() {
        UpazilaList.clear();
    }
    public void noyakhaliDistrict() {
        UpazilaList.clear();
    }
    public void berammonbariyaDistrict() {
        UpazilaList.clear();
    }
    public void chadpurDistrict() {
        UpazilaList.clear();
    }
    public void serajganjDistrict() {
        UpazilaList.clear();
    }
    public void pabnaDistrict() {
        UpazilaList.clear();
    }
    public void baguraDistrict() {
        UpazilaList.clear();
    }
    public void rajshahiDistrict() {
        UpazilaList.clear();
    }
    public void natoreDistrict() {
        UpazilaList.clear();
    }
    public void joypurhatDistrict() {
        UpazilaList.clear();
    }
    public void chapainobabganjDistrict() {
        UpazilaList.clear();
    }
    public void naogaDistrict() {
        UpazilaList.clear();
    }
    public void rangpurDistrict() {
        UpazilaList.clear();
    }
    public void dinajpurDistrict() {
        UpazilaList.clear();
    }
    public void ponchogorDistrict() {
        UpazilaList.clear();
    }
    public void thakurgaoDistrict() {
        UpazilaList.clear();
    }
    public void gaibandaDistrict() {
        UpazilaList.clear();
    }
    public void kurigramDistrict() {
        UpazilaList.clear();
    }
    public void nilphamariDistrict() {
        UpazilaList.clear();
    }
    public void lalmonirhatDistrict() {
        UpazilaList.clear();
    }
    public void mymensingDistrict() {
        UpazilaList.clear();
    }
    public void netrokonaDistrict() {
        UpazilaList.clear();
    }
    public void serpurDistrict() {
        UpazilaList.clear();
    }
    public void jamalpurDistrict() {
        UpazilaList.clear();
    }
    public void sylhetDistrict() {
        UpazilaList.clear();
    }
    public void moulovibazarDistrict() {
        UpazilaList.clear();
    }
    public void hobigonjDistrict() {
        UpazilaList.clear();
    }
    public void sunamganjDistrict() {
        UpazilaList.clear();
    }



    // =============================  Base Adapter Start Here ================================
    public class DistrictListViewAdapter extends BaseAdapter{

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
                convertView = layoutInflater.inflate(R.layout.this_activity_listview_layout_design,parent,false);
            }
            ImageView imageViews1 = convertView.findViewById(R.id.imageViews1);
            ImageView imageViews2 = convertView.findViewById(R.id.imageViews2);
            AnimatedGradientTextView animatedGradientTextView = convertView.findViewById(R.id.animatedGradientTextView);
            NeumorphCardView listItemsCardView = convertView.findViewById(R.id.listItemsCardView);

            HashMap<String,String> hashMap = new HashMap<>();
            hashMap = arrayList.get(position);
            String getText = hashMap.get("distric");
            String getCatagory = hashMap.get("catagory");
            String img_url = hashMap.get("img");

            Glide.with(DistrictsActivity.this)
                            .load(img_url)
                                    .placeholder(R.drawable.loading_spinner)
                                            .into(imageViews1);
            imageViews2.setImageDrawable(getDrawable(R.drawable.right_arrow));

            animatedGradientTextView.setText(""+getText);


            listItemsCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // ============================== Barisal Division ===============================================
                    if (getCatagory != null && getCatagory.contains("barisal")){
                        barisalDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "বরিশাল"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("patuakhali")) {
                        patuaKhaliDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "পটুয়াখালী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("bhola")) {
                        bholaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ভোলা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("barguna")) {
                        borgunaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "বরগুনা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("jhalkathi")) {
                        jhalokhatiDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ঝালকাঠী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("pirojpur")) {
                        perojPurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "পিরোজপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Dhaka Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("dhaka")) {
                        dhakaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ঢাকা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("gazipur")) {
                        gajipurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "গাজীপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("narayanganj")) {
                        narayanGanjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নারায়নগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("narosingdi")) {
                        naroshingdiDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নরসিংদী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("munsiganj")) {
                        munshiganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "মুন্সিগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("manikganj")) {
                        manikganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "মানিকগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("tangail")) {
                        tangailDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "টাঙ্গাইল"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("kisorganj")) {
                        kisorganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "কিশোরগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("faridpur")) {
                        faridpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ফরিদপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("madaripur")) {
                        madaripurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "মাদারীপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("soriatpur")) {
                        sariyatpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "শরীয়তপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("gopalganj")) {
                        gopalganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "গোপালগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("rajbari")) {
                        rajbariDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "রাজবাড়ী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Khulna Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("kustia")) {
                        kustiaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "কুষ্টিয়া"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("khulna")) {
                        khulnaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "খুলনা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("chuyadanga")) {
                        chuyaDangaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "চুয়াডাঙ্গা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("jhinaidoho")) {
                        jhinaidohoDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ঝিনাইদহ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("norail")) {
                        norialDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নড়াইল"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("bagerhat")) {
                        bagerhatDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "বাগেরহাট"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("magura")) {
                        maguraDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "মাগুরা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("meherpur")) {
                        meherpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "মেহেরপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("jassor")) {
                        jassorDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "যশোর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("satkhira")) {
                        satkhiraDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "সাতক্ষীরা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Chattogram Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("chattogram")) {
                        chattogramDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "চট্টগ্রাম"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("coxbazar")) {
                        coxbazarDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "কক্সবাজার"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("ragamati")) {
                        rangaMatiDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "রাঙামাটি"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("bandorban")) {
                        bandorbanDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "বান্দরবান"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("khagrachori")) {
                        khagrachoriDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "খাগড়াছড়ি"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("feni")) {
                        feniDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ফেনী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("lokkhipur")) {
                        lokkhipurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "লক্ষ্মীপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("cumilla")) {
                        cumillaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "কুমিল্লা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("noyakhali")) {
                        noyakhaliDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নোয়াখালী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("berammonbariya")) {
                        berammonbariyaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ব্রাহ্মণবাড়িয়া"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("chadpur")) {
                        chadpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "চাঁদপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Rajshahi Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("serajgonj")) {
                        serajganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "সিরাজগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("pabna")) {
                        pabnaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "পাবনা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("bagura")) {
                        baguraDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "বগুড়া"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("rajshahi")) {
                        rajshahiDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "রাজশাহী"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("natore")) {
                        natoreDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নাটোর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("joypurhat")) {
                        joypurhatDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "জয়পুরহাট"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("chapainobabganj")) {
                        chapainobabganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "চাঁপাইনবাবগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("naoga")) {
                        naogaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নওগাঁ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Rangpur Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("rangpur")) {
                        rangpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "রংপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("dinajpur")) {
                        dinajpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "দিনাজপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("panchogor")) {
                        ponchogorDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "পঞ্চগড়"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("thakurgao")) {
                        thakurgaoDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ঠাকুরগাঁও"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("gaibandha")) {
                        gaibandaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "গাইবান্ধা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("kurigram")) {
                        kurigramDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "কুঁড়িগ্রাম"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("nillphamari")) {
                        nilphamariDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নীলফামারি"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("lalmonirhat")) {
                        lalmonirhatDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "লালমনিরহাট"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Mymenshingh Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("mymensingh")) {
                        mymensingDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "ময়মনসিংহ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("netrokona")) {
                        netrokonaDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "নেত্রকোনা"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("sherpur")) {
                        serpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "শেরপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("jamalpur")) {
                        jamalpurDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "জামালপুর"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }// ============================== Sylhet Division ===============================================
                    else if (getCatagory != null && getCatagory.contains("syhlet")) {
                        sylhetDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "সিলেট"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("moulovibazar")) {
                        moulovibazarDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "মৌলভীবাজার"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("hobiganj")) {
                        hobigonjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "হবিগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }else if (getCatagory != null && getCatagory.contains("sunamganj")) {
                        sunamganjDistrict();
                        UpazilaThanaAndEmergencyContact.arrayList = UpazilaList;
                        UpazilaThanaAndEmergencyContact.title = "সুনামগঞ্জ"+getResources().getString(R.string.upazila_title);
                        startActivity(new Intent(DistrictsActivity.this, UpazilaThanaAndEmergencyContact.class));
                    }
                }
            });

            return convertView;
        }
    }// =============================  Base Adapter End Here ================================



    // =============================  Check Network Connection Start Here ====================
    public class NetworkConnectionCheck extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (!Common.isNetworkConnected(context)){
                linearLayoutMain.setVisibility(View.GONE);
                no_internet_linearLayout.setVisibility(View.VISIBLE);
            }else{
                linearLayoutMain.setVisibility(View.VISIBLE);
                no_internet_linearLayout.setVisibility(View.GONE);
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