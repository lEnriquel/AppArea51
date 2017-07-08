package pe.com.android.app2;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;
import pe.com.android.app2.adapters.GaleriaAdapter;

public class GaleriaActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        indicator = (CircleIndicator) findViewById(R.id.indicator);

        //SupportFragmentManager es la clase maestra que puede manipular los fragmentos
        GaleriaAdapter galeriaAdapter = new GaleriaAdapter(getSupportFragmentManager());
        viewPager.setAdapter(galeriaAdapter);
        //Sincroniza la cantidad de datos que tenemos en el viewPager con la cantidad de bolitas
        indicator.setViewPager(viewPager);
        indicator.setBackgroundColor(Color.BLUE);
        //Agregamos animacion en la transicion de pantallas
        viewPager.setPageTransformer(true, new DepthPageTransformer());
        //obtenemos el dato que se ha enviado desde la pantalla anterior
        int posicion = getIntent().getIntExtra("posicion",-1);
        //Verificamos que la posicion que esta llegando es superior a -1
        if(posicion > -1)
        {   //Se indica al viewpager que se muestre en la posicion enviada
            viewPager.setCurrentItem(posicion);
        }
    }
}
