package com.itheima.helloworld1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	static{
		//���ش����ϵ�so���
		System.loadLibrary("hello11111");
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }


    public void click(View v){
    	Toast.makeText(this, helloFromC(), 0).show();
    }
    
    //����һ�����ط�������������c����ʵ��
    public native String helloFromC();
    
}
