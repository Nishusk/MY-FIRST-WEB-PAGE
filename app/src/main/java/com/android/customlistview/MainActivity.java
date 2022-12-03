package com.android.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import com.android.customlistview.Adapter.Adapter;
import com.android.customlistview.Model.Model;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Model> models = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        BindData();

    }

    void BindData() {
        models.add(new Model("https://s.ftcdn.net/v2013/pics/all/curated/RKyaEDwp8J7JKeZWQPuOVWvkUjGQfpCx_cover_580.jpg?r=1a0fc22192d0c808b8bb2b9bcfbf4a45b1793687", "curated"));
        models.add(new Model("https://www.gettyimages.com/gi-resources/images/500px/983794168.jpg", "Marine"));
        models.add(new Model("https://killerattitudestatus.in/wp-content/uploads/2019/12/gud-night-images.jpg", "goodnight"));
        models.add(new Model("https://1.bp.blogspot.com/-MdaQwrpT4Gs/Xdt-ff_hxEI/AAAAAAAAQXE/oOgnysGd9LwoFLMHJ0etngKzXxmQkWc5ACLcBGAsYHQ/s400/Beautiful-Backgrounds%2B%2528122%2529.jpg", "beautiful_bg"));
        models.add(new Model("https://cdn.pixabay.com/photo/2015/06/19/21/24/the-road-815297__340.jpg", "pixa"));
        models.add(new Model("https://www.scld.org.uk/wp-content/uploads/2020/05/lukasz-szmigiel-jFCViYFYcus-unsplash.jpg", "luxas"));
        models.add(new Model("https://www.w3schools.com/w3css/img_lights.jpg", "lights"));
        models.add(new Model("https://www.w3schools.com/howto/img_snow.jpg", "snow"));
        models.add(new Model("https://studio-chateau-angers.com/wp-content/plugins/qards/templates/ui-kit-cover/img/mountains.jpg", "mountains"));
        models.add(new Model("https://www.w3schools.com/howto/img_forest.jpg", "forest"));

        adapter = new Adapter(getApplicationContext(), models);
        lv.setAdapter(adapter);
    }
}
