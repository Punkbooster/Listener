package com.example.p0101_listener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	 
	   TextView tvOut;
	   Button btnOk;
	   Button btnCancel;
	 
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.main);
	 
	     // ������ View-��������
	     tvOut = (TextView) findViewById(R.id.tvOut);
	     btnOk = (Button) findViewById(R.id.btnOk);
	     btnCancel = (Button) findViewById(R.id.btnCancel);
	 
	     // �������� �����������
	     OnClickListener oclBtn = new OnClickListener() {
	       @Override
	       public void onClick(View v) {
	         
	    	   // �� id ����������� ������, ��������� ���� ����������
	           switch (v.getId()) {
	           case R.id.btnOk:
	             // ������ ��
	             tvOut.setText("������ ������ ��");
	             break;
	           case R.id.btnCancel:
	             // ������ Cancel
	             tvOut.setText("������ ������ Cancel");
	             break;
	       } };
	     };
	     btnOk.setOnClickListener(oclBtn);
	     btnCancel.setOnClickListener(oclBtn);
	   }
}
