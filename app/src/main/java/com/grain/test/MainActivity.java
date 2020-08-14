package com.grain.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;

import com.tencent.smtt.sdk.QbSdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        HashMap map = new HashMap();
//        map.put(TbsCoreSettings.TBS_SETTINGS_USE_SPEEDY_CLASSLOADER, true);
//        map.put(TbsCoreSettings.TBS_SETTINGS_USE_DEXLOADER_SERVICE, true);
//        QbSdk.initTbsSettings(map);

        //初始化
        QbSdk.initX5Environment(MainActivity.this, null);

        String filePath = Environment.getExternalStorageDirectory().getPath() + "/烟气检测报告/锅炉烟气环保检测记录20200814100747.docx";
        String fileName = "锅炉烟气环保检测记录20200814100747.docx";
        DisplayFileActivity.openDispalyFileActivity(MainActivity.this, filePath, fileName);
    }
}
