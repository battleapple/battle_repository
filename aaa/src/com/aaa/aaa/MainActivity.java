package com.aaa.aaa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btn1 = null;
	private Button btn2 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// TextView tv = (TextView)findViewById(R.id.tv);
		// tv.setText(Html.fromHtml("hppa <font color = red>包括纪宁的世界投影在内，一座座世界投影都笼罩这里，大家的世界投影都不蕴含攻击性，彼此没有干扰！如果硬来的话，世界投影的威能是很强的，彼此会相互碰撞攻击！像纪宁、夫一道君等第二级数的心力修行者的世界投影会瞬间就被碾压掉。</font>777"));

		btn1 = (Button) findViewById(R.id.btn1);
		// btn2=(Button)findViewById(R.id.btn2);

		btn1.setOnClickListener(click);

	}

	private OnClickListener click = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Button button = (Button) v;
			switch (button.getId()) {
			case R.id.btn1:
				System.out.println("我日你啊，敢点我");
				Toast.makeText(MainActivity.this, "你真点了我啊", Toast.LENGTH_LONG)
						.show();

				break;
			default:
				System.out.println("我日a，插錯了");
				break;
			}

		}
	};

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }
	//
	// @Override
	// public boolean onOptionsItemSelected(MenuItem item) {
	// // Handle action bar item clicks here. The action bar will
	// // automatically handle clicks on the Home/Up button, so long
	// // as you specify a parent activity in AndroidManifest.xml.
	// int id = item.getItemId();
	// if (id == R.id.action_settings) {
	// return true;
	// }
	// return super.onOptionsItemSelected(item);
	// }
}
