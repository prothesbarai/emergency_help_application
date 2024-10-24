package com.aspprothes.emergencyhelp.policecontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.aspprothes.emergencyhelp.R;
import com.aspprothes.emergencyhelp.networkchecker.Common;
import com.bumptech.glide.Glide;
import com.mursaat.extendedtextview.AnimatedGradientTextView;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class UpazilaThanaAndEmergencyContact extends AppCompatActivity {
    private NetworkConnectionCheck networkConnectionCheck = new NetworkConnectionCheck();
    private LinearLayout linearLayoutMain,no_internet_linearLayout;
    public static String title = "";
    private AnimatedGradientTextView districtTitle;
    private ListView listView;
    public static ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
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

        UpazilaThanaAndEmergencyContactAdapter upazilaThanaAndEmergencyContactAdapter = new UpazilaThanaAndEmergencyContactAdapter();
        listView.setAdapter(upazilaThanaAndEmergencyContactAdapter);
    }
    // =========================================================================================
    // =========================================================================================
    // =========================================================================================


    // =============================  Base Adapter Start Here ================================
    public class UpazilaThanaAndEmergencyContactAdapter extends BaseAdapter{

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
            AnimatedGradientTextView animatedGradientTextViewdes = convertView.findViewById(R.id.animatedGradientTextViewdes);

            NeumorphCardView listItemsCardView = convertView.findViewById(R.id.listItemsCardView);
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap = arrayList.get(position);
            String getText = hashMap.get("name");
            String getNum = hashMap.get("num");
            String img_url = hashMap.get("images");

            Glide.with(UpazilaThanaAndEmergencyContact.this)
                    .load(img_url)
                    .placeholder(R.drawable.loading_spinner)
                    .into(imageViews1);
            imageViews2.setImageDrawable(getDrawable(R.drawable.call));
            animatedGradientTextViewdes.setVisibility(View.VISIBLE);
            animatedGradientTextView.setText(""+getText);
            animatedGradientTextViewdes.setText(""+getNum);



            listItemsCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // ====================== Hot Lines All Contact Numbers From Main Acrtivity =========================
                    if (getNum != null && getNum.contains("999")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("102")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("1098")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("109")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("10921")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("105")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16430")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("10941")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("106")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16123")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16263")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16108")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16256")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("131")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("100")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16420")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("16236")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("333")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }// ======================================== End HotLine Numbers =====================================================
                    else if (getNum != null && getNum.contains("01722835046")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374274")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374272")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374271")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374275")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374273")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374268")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374276")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374270")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374269")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01713374267")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01974144240")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01781351818")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }else if (getNum != null && getNum.contains("01320151420")){
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+getNum));
                        startActivity(intent);
                        finish();
                    }
                }
            });

            return convertView;
        }
    }


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

    @Override
    protected void onResume() {
        super.onResume();
    }
}