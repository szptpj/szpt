package ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.szpt.hasee.szpt.R;

import java.util.ArrayList;
import java.util.List;

import adapter.SecondHandleShowPagerAdpter;
import bean.ScondHandle;
import utils.SecondHandleShowAnimation;

/**
 * Created by CGS on 2017/1/6.
 */

public class SecondHandleShowImage extends Activity implements View.OnClickListener{
    private ViewPager pager;
    private List<View> pagerList;
    private SecondHandleShowPagerAdpter adapter;
    private ImageView backImg;
    private TextView imgCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondhandleshow_imageview);
        initView();
        initDatas();

    }

    private void initView() {
        pager= (ViewPager) findViewById(R.id.pager);
        pagerList=new ArrayList<>();
    }

    private void initDatas() {
        Intent in=getIntent();
        Bundle bundle=in.getExtras();
        final   ScondHandle p = (ScondHandle) bundle.getSerializable("handleMessage");
        final int a=p.getPhotoCount();
        switch(a){
            case 1:View v1=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img1=(ImageView)v1.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile8().getFileUrl()).fitCenter().into(img1);
                backImg= (ImageView) v1.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v1. findViewById(R.id.imageCount);
                imgCount.setText((2-a)+"/"+(9-a+1)+"");
                pagerList.add(v1);
            case 2:View v2=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img2= (ImageView) v2.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile7().getFileUrl()).fitCenter().into(img2);
                backImg= (ImageView) v2.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v2. findViewById(R.id.imageCount);
                imgCount.setText((3-a)+"/"+(9-a+1)+"");
                pagerList.add(v2);
            case 3:View v3=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img3= (ImageView) v3.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile6().getFileUrl()).fitCenter().into(img3);
                backImg= (ImageView) v3.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v3. findViewById(R.id.imageCount);
                imgCount.setText((4-a)+"/"+(9-a+1)+"");
                pagerList.add(v3);
            case 4:View v4=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img4=(ImageView)v4.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile5().getFileUrl()).fitCenter().into(img4);

                backImg= (ImageView) v4.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v4. findViewById(R.id.imageCount);
                imgCount.setText((5-a)+"/"+(9-a+1)+"");
                pagerList.add(v4);
            case 5:View v5=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img5= (ImageView) v5.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile4().getFileUrl()).fitCenter().into(img5);

                backImg= (ImageView) v5.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v5. findViewById(R.id.imageCount);
                imgCount.setText((6-a)+"/"+(9-a+1)+"");
                pagerList.add(v5);
            case 6:View v6=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img6= (ImageView) v6.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile3().getFileUrl()).fitCenter().into(img6);

                backImg= (ImageView) v6.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v6. findViewById(R.id.imageCount);
                imgCount.setText((7-a)+"/"+(9-a+1)+"");
                pagerList.add(v6);
            case 7:View v7=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img7=(ImageView)v7.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile2().getFileUrl()).fitCenter().into(img7);
                backImg= (ImageView) v7.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v7. findViewById(R.id.imageCount);
                imgCount.setText((8-a)+"/"+(9-a+1)+"");
                pagerList.add(v7);
            case 8:View v8=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img8= (ImageView) v8.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile1().getFileUrl()).fitCenter().into(img8);

                backImg= (ImageView) v8.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v8. findViewById(R.id.imageCount);
                imgCount.setText((9-a)+"/"+(9-a+1)+"");
                pagerList.add(v8);
            case 9:View v9=View.inflate(this,R.layout.secondhandleshow_imageview_item,null);
                ImageView img9= (ImageView) v9.findViewById(R.id.select_image_item);
                Glide.with(this).load(p.getFile().getFileUrl()).fitCenter().into(img9);

                backImg= (ImageView) v9.findViewById(R.id.backImg);
                backImg.setOnClickListener(this);
                imgCount= (TextView)v9. findViewById(R.id.imageCount);
                imgCount.setText((10-a)+"/"+(9-a+1)+"");
                pagerList.add(v9);
        }
        adapter=new SecondHandleShowPagerAdpter(pagerList);
        pager.setAdapter(adapter);
        pager.setPageTransformer(true,new SecondHandleShowAnimation());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.backImg:
                finish();
                break;
        }
    }
}
