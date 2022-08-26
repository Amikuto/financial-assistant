package uni.ami.finassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        Button add_btn = findViewById(R.id.add_btn);
        Button expenses_btn = findViewById(R.id.expenses_btn);
        Button income_btn = findViewById(R.id.income_btn);
        Button day_btn = findViewById(R.id.day_btn);
        Button week_btn = findViewById(R.id.week_btn);
        Button month_btn = findViewById(R.id.month_btn);

        ArrayList<String> expenses = new ArrayList<>();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, expenses);
        listView.setAdapter(adapter);

        expenses.add("some");

        adapter.notifyDataSetChanged();

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
                //TODO Кнопка добавления операций - делает "Karambasss"
            }
        });

        expenses_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Кнопка выбора расходов
            }
        });

        income_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Кнопка выбора доходов
            }
        });

        day_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Кнопка выбора операций за текущий день
            }
        });

        week_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Кнопка выбора операций за текущую неделю
            }
        });

        month_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Кнопка выбора операций за текущий месяц
            }
        });
    }
}