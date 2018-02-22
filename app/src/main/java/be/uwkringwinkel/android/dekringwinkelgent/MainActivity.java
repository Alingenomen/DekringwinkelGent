package be.uwkringwinkel.android.dekringwinkelgent;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        assignFonts();
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker at the shop location and move the camera
        LatLng sydney = new LatLng(51.044046, 3.741549);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Vlaamse Kaai 10"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
    }

    // Method to assign the fonts to the various textViews
    private void assignFonts() {
        // Typeface Bauhaus_Std_Medium = Typeface.createFromAsset(getAssets(),"fonts/Bauhaus_Std_Medium.ttf");
        Typeface Bauhaus_Std_Bold = Typeface.createFromAsset(getAssets(), "fonts/Bauhaus_Std_Bold.ttf");
        Typeface Futura_Std_Book = Typeface.createFromAsset(getAssets(), "fonts/Futura_Std_Book.ttf");

        TextView bereikenText = findViewById(R.id.bereikenText);
        bereikenText.setTypeface(Bauhaus_Std_Bold);

        TextView openingsurenText = findViewById(R.id.openingsurenText);
        openingsurenText.setTypeface(Bauhaus_Std_Bold);

        TextView homeText = findViewById(R.id.hometext);
        homeText.setTypeface(Futura_Std_Book);

        TextView locationText = findViewById(R.id.locationtext);
        locationText.setTypeface(Futura_Std_Book);

        TextView internetText = findViewById(R.id.internetText);
        internetText.setTypeface(Futura_Std_Book);

        TextView weekdagenText = findViewById(R.id.weekdagenText);
        weekdagenText.setTypeface(Futura_Std_Book);

        TextView weekdagenUrenText = findViewById(R.id.weekdagenUrenText);
        weekdagenUrenText.setTypeface(Futura_Std_Book);

        TextView zaterdagenText = findViewById(R.id.zaterdagenText);
        zaterdagenText.setTypeface(Futura_Std_Book);

        TextView zaterdagenUrenText = findViewById(R.id.zaterdagenUrenText);
        zaterdagenUrenText.setTypeface(Futura_Std_Book);

        TextView zondagenText = findViewById(R.id.zondagenText);
        zondagenText.setTypeface(Futura_Std_Book);

        TextView zondagenUrenText = findViewById(R.id.zondagenUrenText);
        zondagenUrenText.setTypeface(Futura_Std_Book);
    }
}
