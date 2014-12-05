package com.example.ly;

import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.GPUImageToonFilter;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv = (ImageView)findViewById(R.id.doroid);
		GPUImage gpuimage = new GPUImage(this);
		gpuimage.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher));
		gpuimage.setFilter(new GPUImageToonFilter());
		iv.setImageBitmap(gpuimage.getBitmapWithFilterApplied());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
