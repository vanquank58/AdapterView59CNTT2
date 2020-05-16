package vn.edu.ntu.vanquan.adapterview59cntt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvTinhThanh;
    ArrayAdapter<String> adapterTinhThanh;
    String[] dsTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addEvent()
    {
        lvTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String message = adapterTinhThanh.getItem(position);
                Toast.makeText(MainActivity.this,"ban chon"+message,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void addView()
    {
        lvTinhThanh = findViewById(R.id.lvTinhThanh);
        dsTinhThanh = getResources().getStringArray(R.array.tinh_thanh);
        //this activity dang dung, layout, mảng
        adapterTinhThanh = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dsTinhThanh);
        lvTinhThanh.setAdapter(adapterTinhThanh);

    }


}
