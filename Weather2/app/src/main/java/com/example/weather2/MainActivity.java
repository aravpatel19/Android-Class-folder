package com.example.weather2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tempTextView;

    URL url;
    URLConnection connection;
    InputStream stream;
    BufferedReader bufferedReader;
    String zipCode;
    String info = "";
    JSONObject jsonObject;
    ListView listView;
    EditText editText;
    ArrayList<Day> list;

    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TAG", "TEST");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        zipCode = editText.getText().toString();



        (new AsyncThread()).execute();
    }

    public class AsyncThread extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... voids) {
            try {
                url = new URL("http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=9ce3e8db89f984d7bd791a4189a43dae");
                connection = url.openConnection();
                stream = connection.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(stream));
                String line = "";
                while ((line=bufferedReader.readLine()) != null) {
                    info +=line;
                }
                jsonObject = new JSONObject(info);

            } catch (Exception e) {
               Log.d("TAG",e.toString());
            }

            Log.d("TAG", info);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            try {
                JSONObject jsonObject = new JSONObject(info);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public class CustomAdapter extends ArrayAdapter<String> {

        Context parentContext;
        int xmlResource;
        List<String> list;

        public CustomAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
            super(context, resource, objects);
            parentContext = context;
            xmlResource = resource;
            list = objects;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) parentContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.adapter_custom, null);

            TextView textView1 = findViewById(R.id.adapter_textView1);
            TextView textView2 = findViewById(R.id.adapter_textView2);
            TextView textView3 = findViewById(R.id.adapter_textView3);
            ImageView imageView = findViewById(R.id.adapter_imageView);



            return view;
        }
    }

    public class Day{

        private TextView t1;
        private TextView t2;
        private TextView t3;
        private ImageView imageView;

        public Day(TextView t1, TextView t2, TextView t3, ImageView imageView){

            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.imageView = imageView;
        }

        public TextView getT1(){
            return t1;
        }
        public TextView getT2(){
            return t2;
        }
        public TextView getT3(){
            return t3;
        }
        public ImageView getImageView(){
            return imageView;
        }
    }

}

