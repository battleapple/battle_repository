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
		// tv.setText(Html.fromHtml("hppa <font color = red>��������������ͶӰ���ڣ�һ��������ͶӰ�����������ҵ�����ͶӰ�����̺������ԣ��˴�û�и��ţ����Ӳ���Ļ�������ͶӰ�������Ǻ�ǿ�ģ��˴˻��໥��ײ���������������һ�����ȵڶ����������������ߵ�����ͶӰ��˲��ͱ���ѹ����</font>777"));

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
				System.out.println("�����㰡���ҵ���");
				Toast.makeText(MainActivity.this, "��������Ұ�", Toast.LENGTH_LONG)
						.show();

				break;
			default:
				System.out.println("����a�����e��");
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
