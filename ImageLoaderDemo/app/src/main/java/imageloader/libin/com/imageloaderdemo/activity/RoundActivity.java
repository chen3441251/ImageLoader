package imageloader.libin.com.imageloaderdemo.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import imageloader.libin.com.imageloader.ImageLoader;
import imageloader.libin.com.imageloaderdemo.R;

public class RoundActivity extends AppCompatActivity {
    ImageView iv_round;
    ImageView iv_circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);

        iv_round = (ImageView) findViewById(R.id.iv_round);
        iv_circle = (ImageView) findViewById(R.id.iv_circle);

        show();
    }

    private void show() {


        ImageLoader.with(this)
                //.url("https://pic1.zhimg.com/v2-7868c606d6ddddbdd56f0872e514925c_b.jpg")
                 .url("http://img.yxbao.com/news/image/201703/13/7bda462477.gif")
                // .res(R.drawable.thegif)
                .placeHolder(R.mipmap.ic_launcher,false)
                .widthHeight(250, 150)
                .rectRoundCorner(30, R.color.colorPrimary)
                .blur(40)
                .into(iv_circle);


//        ImageLoader.with(this)
//                .placeHolder(R.mipmap.ic_launcher,false)
//                //.res(R.drawable.thegif)
//                .url("https://pic1.zhimg.com/v2-7868c606d6ddddbdd56f0872e514925c_b.jpg")
//                .widthHeight(250, 150)
//                .rectRoundCorner(15, R.color.colorPrimary)
//                .blur(20)
//                .asBitmap(new SingleConfig.BitmapListener() {
//                    @Override
//                    public void onSuccess(Bitmap bitmap) {
//                        Log.e("bitmap", bitmap.getWidth() + "---height:" + bitmap.getHeight() + "--" + bitmap.toString());
//                        iv_round.setImageBitmap(bitmap);
//                    }
//
//                    @Override
//                    public void onFail() {
//                        Log.e("bitmap", "fail");
//
//                    }
//                });
////        .into(ivRes);


    }
}