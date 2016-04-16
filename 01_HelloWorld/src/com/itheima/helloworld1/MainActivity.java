package com.itheima.helloworld1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	static{
		//加载打包完毕的so类库
		System.loadLibrary("tocong");
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }


    public void click(View v){
    	Toast.makeText(this, helloFromC(), 0).show();
    }
    
    //定义一个本地方法，方法体由c语言实现
    public native String helloFromC();
    
}
