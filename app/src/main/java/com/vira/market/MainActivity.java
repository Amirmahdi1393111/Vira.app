   package com.vira.market;

   import android.os.Bundle;
   import android.widget.Button;
   import android.widget.Toast;
   import androidx.appcompat.app.AppCompatActivity;

   public class MainActivity extends AppCompatActivity {

       private boolean isAdmin = false; 

       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           Button btnApps = findViewById(R.id.btn_apps);
           Button btnGames = findViewById(R.id.btn_games);
           Button btnUpdates = findViewById(R.id.btn_updates);
           Button btnAccount = findViewById(R.id.btn_account);

           btnApps.setOnClickListener(v -> {
               Toast.makeText(MainActivity.this, "📂هنوز هیچ برنامه‌ای در مارکت وجود ندارد📂", Toast.LENGTH_SHORT).show();
           });

           btnGames.setOnClickListener(v -> {
               Toast.makeText(MainActivity.this, "📂هنوز هیچ بازی‌ای در مارکت وجود ندارد📂", Toast.LENGTH_SHORT).show();
           });

           btnUpdates.setOnClickListener(v -> {
               Toast.makeText(MainActivity.this, "به‌روزرسانی‌های شما در این قسمت نمایش داده می‌شود...", Toast.LENGTH_SHORT).show();
           });

           btnAccount.setOnClickListener(v -> {
               if (isAdmin) {
                   Toast.makeText(MainActivity.this, "خوش آمدید مدیر گرامی - پنل مدیریت فعال است", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(MainActivity.this, "بخش حساب کاربری و پنل توسعه‌دهندگان", Toast.LENGTH_SHORT).show();
               }
           });
       }
   }
