package com.example.pushtemplates;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PushActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri uri = getIntent().getData();
        Log.w("checkstring", uri.getPathSegments().toString());
        if(uri!=null)
        {
            Intent intent = new Intent(getBaseContext(), pushtemplate_service.class);
            //Toast.makeText(this, "demo", Toast.LENGTH_LONG).show();

            String id = uri.getPathSegments().get(0);

            if(id.equals("Basic"))
            {
                //Toast.makeText(this, "demo1", Toast.LENGTH_LONG).show();
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String msg_summary = uri.getPathSegments().get(3);
                String subtitle=uri.getPathSegments().get(4);
                String bg_color=uri.getPathSegments().get(5);
                String big_img=uri.getPathSegments().get(6);
                String ico=uri.getPathSegments().get(7);
                String dl1 = uri.getPathSegments().get(8);
                String title_clr = uri.getPathSegments().get(9);
                String msg_clr=uri.getPathSegments().get(10);
                String small_icon_clr=uri.getPathSegments().get(11);

                String bgColor=bg_color.replace("@","#");
                String bigImg=big_img.replace("@","/");
                String Ico=ico.replace("@","/");
                String Dl1=dl1.replace("@","/");
                String titleClr=title_clr.replace("@","#");
                String msgClr=msg_clr.replace("@","#");
                String smallIconClr=small_icon_clr.replace("@","#");



                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_basic");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_summary", msg_summary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_bg", bgColor);
                //intent.putExtra("pt_bg", bg_color);
                //Log.w("check1", bg_color);
                intent.putExtra("pt_big_img",bigImg);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_msg_clr", msgClr);
                intent.putExtra("pt_title_clr", titleClr);
                intent.putExtra("pt_ico",Ico);
                intent.putExtra("pt_small_icon_clr", smallIconClr);
                startService(intent);
            }
            if(id.equals("Auto Carousel"))
            {
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String msgSummary = uri.getPathSegments().get(3);
                String subtitle=uri.getPathSegments().get(4);
                String dl1=uri.getPathSegments().get(5);
                String img1=uri.getPathSegments().get(6);
                String img2=uri.getPathSegments().get(7);
                String img3 = uri.getPathSegments().get(8);
                String imgn = uri.getPathSegments().get(9);
                String bg=uri.getPathSegments().get(10);
                String ico=uri.getPathSegments().get(11);
                String titleClr=uri.getPathSegments().get(12);
                String msgClr=uri.getPathSegments().get(13);
                String smallIconClr=uri.getPathSegments().get(14);

                String Dl1=dl1.replace("@","/");
                String Img1=img1.replace("@","/");
                String Img2=img2.replace("@","/");
                String Img3=img3.replace("@","/");
                String Imgn=imgn.replace("@","/");
                String bgColor=bg.replace("@","#");
                String Ico=ico.replace("@","/");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");




                //Bundle extras1 = new Bundle();
                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_carousel");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_summary", msgSummary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_img1", Img1);
                intent.putExtra("pt_img2", Img2);
                intent.putExtra("pt_img3", Img3);
                //intent.putExtra("pt_imgn", Imgn);
                intent.putExtra("pt_bg", bgColor);
                intent.putExtra("pt_ico",Ico);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                startService(intent);
            }
            if(id.equals("Manual Carousel"))
            {
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String msgSummary = uri.getPathSegments().get(3);
                String subtitle=uri.getPathSegments().get(4);
                String dl1=uri.getPathSegments().get(5);
                String dl2=uri.getPathSegments().get(6);
                String dln=uri.getPathSegments().get(7);
                String img1=uri.getPathSegments().get(8);
                String img2=uri.getPathSegments().get(9);
                String img3 = uri.getPathSegments().get(10);
                String imgn = uri.getPathSegments().get(11);
                String bg=uri.getPathSegments().get(12);
                String ico=uri.getPathSegments().get(13);
                String titleClr=uri.getPathSegments().get(14);
                String msgClr=uri.getPathSegments().get(15);
                String smallIconClr=uri.getPathSegments().get(16);

                String Dl1=dl1.replace("@","/");
                String Dl2=dl2.replace("@","/");
                String Dln=dln.replace("@","/");
                String Img1=img1.replace("@","/");
                String Img2=img2.replace("@","/");
                String Img3=img3.replace("@","/");
                String Imgn=imgn.replace("@","/");
                String bgColor=bg.replace("@","#");
                String Ico=ico.replace("@","/");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");



                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_manual_carousel");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_summary", msgSummary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_dl2", Dl2);
                //intent.putExtra("pt_dl1", dln);
                intent.putExtra("pt_img1", Img1);
                intent.putExtra("pt_img2", Img2);
                intent.putExtra("pt_img3", Img3);
                //intent.putExtra("pt_imgn", imgn);
                intent.putExtra("pt_bg", bgColor);
                intent.putExtra("pt_ico",Ico);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                startService(intent);
            }

            if(id.equals("Rating"))
            {
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String msgSummary = uri.getPathSegments().get(3);
                String subtitle=uri.getPathSegments().get(4);
                String defaultDl = uri.getPathSegments().get(5);
                String dl1=uri.getPathSegments().get(6);
                String dl2=uri.getPathSegments().get(7);
                String dl3=uri.getPathSegments().get(8);
                String dl4=uri.getPathSegments().get(9);
                String dl5=uri.getPathSegments().get(10);
                String bg=uri.getPathSegments().get(11);
                String ico=uri.getPathSegments().get(12);
                String titleClr=uri.getPathSegments().get(13);
                String msgClr=uri.getPathSegments().get(14);
                String smallIconClr=uri.getPathSegments().get(15);

                String DefaultDl=defaultDl.replace("@","/");
                String Dl1=dl1.replace("@","/");
                String Dl2=dl2.replace("@","/");
                String Dl3=dl3.replace("@","/");
                String Dl4=dl4.replace("@","/");
                String Dl5=dl5.replace("@","/");
                String Ico=ico.replace("@","/");
                String Bg=bg.replace("@","#");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");


                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_rating");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_summary", msgSummary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_default_dl", DefaultDl);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_dl2", Dl2);
                intent.putExtra("pt_dl3", Dl3);
                intent.putExtra("pt_dl4", Dl4);
                intent.putExtra("pt_dl5", Dl5);
                intent.putExtra("pt_bg", Bg);
                intent.putExtra("pt_ico",Ico);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                startService(intent);
            }
            if(id.equals("Product Catalog"))
            {
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String subtitle=uri.getPathSegments().get(3);
                String img1 = uri.getPathSegments().get(4);
                String img2=uri.getPathSegments().get(5);
                String img3=uri.getPathSegments().get(6);
                String bt1=uri.getPathSegments().get(7);
                String bt2=uri.getPathSegments().get(8);
                String bt3=uri.getPathSegments().get(9);
                String st1=uri.getPathSegments().get(10);
                String st2=uri.getPathSegments().get(11);
                String st3=uri.getPathSegments().get(12);
                String dl1=uri.getPathSegments().get(13);
                String dl2=uri.getPathSegments().get(14);
                String dl3=uri.getPathSegments().get(15);
                String price1=uri.getPathSegments().get(16);
                String price2=uri.getPathSegments().get(17);
                String price3=uri.getPathSegments().get(18);
                String bg=uri.getPathSegments().get(19);
                String productDisplayAction=uri.getPathSegments().get(20);
                String productDisplayLinear=uri.getPathSegments().get(21);
                String productDisplayAction_clr=uri.getPathSegments().get(22);
                String titleClr=uri.getPathSegments().get(23);
                String msgClr=uri.getPathSegments().get(24);
                String smallIconClr=uri.getPathSegments().get(25);

                String Img1=img1.replace("@","/");
                String Img2=img2.replace("@","/");
                String Img3=img3.replace("@","/");
                String Dl1=dl1.replace("@","/");
                String Dl2=dl2.replace("@","/");
                String Dl3=dl3.replace("@","/");
                String Bg=bg.replace("@","#");
                String ProductDisplayAction_clr=productDisplayAction_clr.replace("@","#");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");

                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_product_display");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_img1", Img1);
                intent.putExtra("pt_img2", Img2);
                intent.putExtra("pt_img3", Img3);
                intent.putExtra("pt_bt1", bt1);
                intent.putExtra("pt_bt2", bt2);
                intent.putExtra("pt_bt3", bt3);
                intent.putExtra("pt_st1", st1);
                intent.putExtra("pt_st2", st2);
                intent.putExtra("pt_st3", st3);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_dl2", Dl2);
                intent.putExtra("pt_dl3", Dl3);
                intent.putExtra("pt_price1", price1);
                intent.putExtra("pt_price2", price2);
                intent.putExtra("pt_price3", price3);
                intent.putExtra("pt_bg", Bg);
                intent.putExtra("pt_product_display_action",productDisplayAction);
                intent.putExtra("pt_product_display_linear",productDisplayLinear);
                intent.putExtra("pt_product_display_action_clr",ProductDisplayAction_clr);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                startService(intent);
            }
            if(id.equals("Five Icons"))
            {

                String img1=uri.getPathSegments().get(1);
                String img2=uri.getPathSegments().get(2);
                String img3 = uri.getPathSegments().get(3);
                String img4=uri.getPathSegments().get(4);
                String img5 = uri.getPathSegments().get(5);
                String dl1=uri.getPathSegments().get(6);
                String dl2=uri.getPathSegments().get(7);
                String dl3=uri.getPathSegments().get(8);
                String dl4=uri.getPathSegments().get(9);
                String dl5=uri.getPathSegments().get(10);
                String bg=uri.getPathSegments().get(11);
                String smallIconClr=uri.getPathSegments().get(12);

                String Img1=img1.replace("@","/");
                String Img2=img2.replace("@","/");
                String Img3=img3.replace("@","/");
                String Img4=img4.replace("@","/");
                String Img5=img5.replace("@","/");
                String Dl1=dl1.replace("@","/");
                String Dl2=dl2.replace("@","/");
                String Dl3=dl3.replace("@","/");
                String Dl4=dl4.replace("@","/");
                String Dl5=dl5.replace("@","/");
                String Bg=bg.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");


                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_five_icons");
                intent.putExtra("pt_img1", Img1);
                intent.putExtra("pt_img2", Img2);
                intent.putExtra("pt_img3", Img3);
                intent.putExtra("pt_img4", Img4);
                intent.putExtra("pt_img5", Img5);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_dl2", Dl2);
                intent.putExtra("pt_dl3", Dl3);
                intent.putExtra("pt_dl4", Dl4);
                intent.putExtra("pt_dl5", Dl5);
                intent.putExtra("pt_bg", Bg);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                startService(intent);
            }

            if(id.equals("Timer"))
            {

                String title=uri.getPathSegments().get(1);
                String titleAlt=uri.getPathSegments().get(2);
                String msg=uri.getPathSegments().get(3);
                String msgAlt=uri.getPathSegments().get(4);
                String msgSummary = uri.getPathSegments().get(5);
                String subtitle=uri.getPathSegments().get(6);
                String dl1=uri.getPathSegments().get(7);
                String bigImg=uri.getPathSegments().get(8);
                String bigImgAlt=uri.getPathSegments().get(9);
                String bg=uri.getPathSegments().get(10);
                String timerThreshold=uri.getPathSegments().get(11);
                String timerEnd=uri.getPathSegments().get(12);
                String titleClr=uri.getPathSegments().get(13);
                String msgClr=uri.getPathSegments().get(14);
                String smallIconClr=uri.getPathSegments().get(15);


                String Dl1=dl1.replace("@","/");
                String BigImg=bigImg.replace("@","/");
                String BigImgAlt=bigImgAlt.replace("@","/");
                String Bg=bg.replace("@","#");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");


                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_timer");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_title_alt", titleAlt);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_alt", msgAlt);
                intent.putExtra("pt_msg_summary", msgSummary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_big_img",BigImg);
                intent.putExtra("pt_big_img_alt",BigImgAlt);
                intent.putExtra("pt_bg",Bg);
                intent.putExtra("pt_timer_threshold",timerThreshold);
                intent.putExtra("pt_timer_end", timerEnd);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                startService(intent);
            }
//                if(id.equals("Video"))
//                {
//                    Toast.makeText(this, "Video", Toast.LENGTH_LONG).show();
//                    String title=uri.getPathSegments().get(1);
//                    String msg=uri.getPathSegments().get(2);
//                    String msgSummary = uri.getPathSegments().get(3);
//                    String subtitle=uri.getPathSegments().get(4);
//                    String bigImg=uri.getPathSegments().get(5);
//                    String videoUrl=uri.getPathSegments().get(6);
//                    String bg=uri.getPathSegments().get(7);
//                    String dl1=uri.getPathSegments().get(8);
//                    String titleClr=uri.getPathSegments().get(9);
//                    String msgClr=uri.getPathSegments().get(10);
//                    String smallIconClr=uri.getPathSegments().get(11);
//                    String ico=uri.getPathSegments().get(12);
//
//
//
//                    String BigImg=bigImg.replace("@","/");
//                    String VideoUrl=videoUrl.replace("@","/");
//                    String Bg=bg.replace("@","#");
//                    String Dl1=dl1.replace("@","/");
//                    String TitleClr=titleClr.replace("@","#");
//                    String MsgClr=msgClr.replace("@","#");
//                    String SmallIconClr=smallIconClr.replace("@","#");
//                    String Ico=ico.replace("@","/");
//
//                    for(int i=0;i<13;i++) {
//                        Log.w("Check", uri.getPathSegments().get(i));
//                    }
//
//
////                    intent.putExtra("nm","<Notification Body>");
////                    intent.putExtra("nt", "<Notification Title>");
////                    intent.putExtra("wzrk_id", "1584453563_20200606");
////                    intent.putExtra("wzrk_pn", true);
////                    intent.putExtra("wzrk_rnv",true);
////                    intent.putExtra("wzrk_cid","Tester");
////                    intent.putExtra("wzrk_ttl", "1593116116");
////                    intent.putExtra("wzrk_dt", "FIREBASE");
////                    intent.putExtra("pt_id", "pt_video");
////                    intent.putExtra("pt_title", title);
////                    intent.putExtra("pt_msg", msg);
////                    intent.putExtra("pt_msg_summary", msgSummary);
////                    intent.putExtra("pt_subtitle", subtitle);
////                    intent.putExtra("pt_big_img",BigImg);
////                    //intent.putExtra("pt_video_url",VideoUrl);
////                    intent.putExtra("pt_video_url","https://www.youtube.com/watch?v=qKbCSXkPsKA");
////                    intent.putExtra("pt_bg", Bg);
////                    intent.putExtra("pt_dl1", Dl1);
////                    intent.putExtra("pt_title_clr", TitleClr);
////                    intent.putExtra("pt_msg_clr", MsgClr);
////                    intent.putExtra("pt_small_icon_clr", SmallIconClr);
////                    intent.putExtra("pt_ico",Ico);
////                    startService(intent);
//                    intent.putExtra("nm","<Notification Body>");
//                    intent.putExtra("nt", "<Notification Title>");
//                    intent.putExtra("wzrk_id", "1584453563_20200606");
//                    intent.putExtra("wzrk_pn", true);
//                    intent.putExtra("wzrk_rnv",true);
//                    intent.putExtra("wzrk_cid","Tester");
//                    intent.putExtra("wzrk_ttl", "1593116116");
//                    intent.putExtra("wzrk_dt", "FIREBASE");
//                    intent.putExtra("pt_id", "pt_video");
//                    intent.putExtra("pt_title", "Welcome");
//                    intent.putExtra("pt_msg", "Keval");
//                    intent.putExtra("pt_msg_summary", "Demo");
//                    intent.putExtra("pt_subtitle", "Hii");
//                    intent.putExtra("pt_big_img","https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2020/6/9/56ac6102-defc-4491-8898-ffdbf37976ab1591721334133-desktop-banner.jpg");
//                    //intent.putExtra("pt_video_url",VideoUrl);
//                    intent.putExtra("pt_video_url","https://www.youtube.com/watch?v=qKbCSXkPsKA");
//                    intent.putExtra("pt_bg", "#6A0DAD");
//                    intent.putExtra("pt_dl1", "https://www.myntra.com/");
//                    intent.putExtra("pt_title_clr", "#FFFFFF");
//                    intent.putExtra("pt_msg_clr", "#FFFFFF");
//                    intent.putExtra("pt_small_icon_clr", "#FFFFFF");
//                    intent.putExtra("pt_ico","https://www.searchpng.com/wp-content/uploads/2019/01/Myntra-logo-png-icon.png");
//                    startService(intent);
//                }

            if(id.equals("Zero Bezel"))
            {
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String msgSummary = uri.getPathSegments().get(3);
                String subtitle=uri.getPathSegments().get(4);
                String bigImg=uri.getPathSegments().get(5);
                String smallView=uri.getPathSegments().get(6);
                String dl1=uri.getPathSegments().get(7);
                String titleClr=uri.getPathSegments().get(8);
                String msgClr=uri.getPathSegments().get(9);
                String smallIconClr=uri.getPathSegments().get(10);
                String ico=uri.getPathSegments().get(11);



                String BigImg=bigImg.replace("@","/");
                String Dl1=dl1.replace("@","/");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");
                String Ico=ico.replace("@","/");


                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_zero_bezel");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_summary", msgSummary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_big_img",BigImg);
                intent.putExtra("pt_small_view",smallView);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                intent.putExtra("pt_ico",Ico);
                startService(intent);
            }

            if(id.equals("Input Box"))
            {
                //Toast.makeText(this, "demo", Toast.LENGTH_LONG).show();
                String title=uri.getPathSegments().get(1);
                String msg=uri.getPathSegments().get(2);
                String msgSummary = uri.getPathSegments().get(3);
                String subtitle=uri.getPathSegments().get(4);
                String bigImg=uri.getPathSegments().get(5);
                String bigImgAlt=uri.getPathSegments().get(6);
                String eventName=uri.getPathSegments().get(7);
                String eventProperty1=uri.getPathSegments().get(8);
                String eventProperty2=uri.getPathSegments().get(9);
                String eventProperty3=uri.getPathSegments().get(10);
                String inputLabel=uri.getPathSegments().get(11);
                String inputAutoOpen=uri.getPathSegments().get(12);
                String inputFeedback=uri.getPathSegments().get(13);
                String dl1=uri.getPathSegments().get(14);
                String titleClr=uri.getPathSegments().get(15);
                String msgClr=uri.getPathSegments().get(16);
                String smallIconClr=uri.getPathSegments().get(17);
                String ico=uri.getPathSegments().get(18);
                //String dissmissOnClick=uri.getPathSegments().get(19);
//
//                    for(int i=0;i<19;i++) {
//                        Log.w("Check", uri.getPathSegments().get(i));
//                    }


                String BigImg=bigImg.replace("@","/");
                String BigImgAlt=bigImgAlt.replace("@","/");
                String Dl1=dl1.replace("@","/");
                String TitleClr=titleClr.replace("@","#");
                String MsgClr=msgClr.replace("@","#");
                String SmallIconClr=smallIconClr.replace("@","#");
                String Ico=ico.replace("@","/");


                intent.putExtra("nm","<Notification Body>");
                intent.putExtra("nt", "<Notification Title>");
                intent.putExtra("wzrk_id", "1584453563_20200606");
                intent.putExtra("wzrk_pn", true);
                intent.putExtra("wzrk_rnv",true);
                intent.putExtra("wzrk_cid","Tester");
                intent.putExtra("wzrk_ttl", "1593116116");
                intent.putExtra("wzrk_dt", "FIREBASE");
                intent.putExtra("pt_id", "pt_input");
                intent.putExtra("pt_title", title);
                intent.putExtra("pt_msg", msg);
                intent.putExtra("pt_msg_summary", msgSummary);
                intent.putExtra("pt_subtitle", subtitle);
                intent.putExtra("pt_big_img",BigImg);
                intent.putExtra("pt_big_img_alt",BigImgAlt);
                intent.putExtra("pt_event_name",eventName);
                intent.putExtra("pt_event_property_<property_name_1>", eventProperty1);
                intent.putExtra("pt_event_property_<property_name_2>", eventProperty2);
                intent.putExtra("pt_event_property_<property_name_3>", eventProperty3);
                intent.putExtra("pt_input_label", inputLabel);
                intent.putExtra("pt_input_auto_open",inputAutoOpen );
                intent.putExtra("pt_input_feedback", inputFeedback);
                intent.putExtra("pt_dl1", Dl1);
                intent.putExtra("pt_title_clr", TitleClr);
                intent.putExtra("pt_msg_clr", MsgClr);
                intent.putExtra("pt_small_icon_clr", SmallIconClr);
                intent.putExtra("pt_ico",Ico);
                //intent.putExtra("pt_dismiss_on_click",dissmissOnClick);
                startService(intent);

            }

        }


    }
}
