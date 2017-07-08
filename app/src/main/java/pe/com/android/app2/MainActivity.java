package pe.com.android.app2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import pe.com.android.app2.adapters.GaleriaAdapter;
import pe.com.android.app2.adapters.ImagenAdapter;
import pe.com.android.app2.modelos.Imagen;

public class MainActivity extends AppCompatActivity {

    private GridView gvDatos;
    public static ArrayList<Imagen> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvDatos = (GridView) findViewById(R.id.gvDatos);

        lista = new ArrayList<>();

        Imagen imagen=new Imagen();
        imagen.setId(lista.size());
        imagen.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR05hkqhEeqRZrdKJAVCxiFH0cTajd2dL0erOKpli8Ndj-tR-bskw");
        imagen.setTexto("Imagen 1");
        lista.add(imagen);

        Imagen imagen1=new Imagen();
        imagen1.setId(lista.size());
        imagen1.setRuta("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRP5knQMoyyWbHPEznH-FaN9ttlf0atcOmDz7BAQ2jPwCpNMbGl");
        imagen1.setTexto("Imagen 2");
        lista.add(imagen1);

        Imagen imagen2=new Imagen();
        imagen2.setId(lista.size());
        imagen2.setRuta("https://www.google.com.pe/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjJ6I6uv_PUAhUHeSYKHdORDVIQjRwIBw&url=http%3A%2F%2Fwww.rtve.es%2Ftelevision%2Fespanoles-en-el-mundo%2Fseattle%2F&psig=AFQjCNFsGIDmAkj_FVCj3dU9Z8hLyGe9Fw&ust=1499390469869472");
        imagen2.setTexto("Imagen 3");
        lista.add(imagen2);

        Imagen imagen3=new Imagen();
        imagen3.setId(lista.size());
        imagen3.setRuta("https://www.google.com.pe/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjCiO3Mv_PUAhXL4SYKHWVEBtAQjRwIBw&url=http%3A%2F%2Fwww.mundotkm.com%2Fmx%2Fmoda%2F112315%2Festos-son-10-paises-mas-ricos-del-mundo&psig=AFQjCNFsGIDmAkj_FVCj3dU9Z8hLyGe9Fw&ust=1499390469869472");
        imagen3.setTexto("Imagen 4");
        lista.add(imagen3);

        Imagen imagen4=new Imagen();
        imagen4.setId(lista.size());
        imagen4.setRuta("https://www.google.com.pe/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiZzO_hv_PUAhUFKyYKHRMfC50QjRwIBw&url=http%3A%2F%2Fwww.asfera.info%2Fnews%2Ftourism%2F2014%2F12%2F22%2Fkanadets_vzyal_krugosvetnoe_puteshestvie_polnuyu_tezku_96749.html&psig=AFQjCNFsGIDmAkj_FVCj3dU9Z8hLyGe9Fw&ust=1499390469869472");
        imagen4.setTexto("Imagen 5");
        lista.add(imagen4);

        Imagen imagen5=new Imagen();
        imagen5.setId(lista.size());
        imagen5.setRuta("https://www.google.com.pe/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiD3Ivuv_PUAhVJMSYKHc59BCMQjRwIBw&url=https%3A%2F%2Fglobalvoices.org%2F2015%2F12%2F26%2Fchristmas-around-the-world-in-17-photos%2F&psig=AFQjCNFsGIDmAkj_FVCj3dU9Z8hLyGe9Fw&ust=1499390469869472");
        imagen5.setTexto("Imagen 6");
        lista.add(imagen5);

        Imagen imagen6=new Imagen();
        imagen6.setId(lista.size());
        imagen6.setRuta("http://img.rtve.es/v/962014/");
        imagen6.setTexto("Imagen 7");
        lista.add(imagen6);

        ImagenAdapter adapter = new ImagenAdapter(MainActivity.this, lista);
        gvDatos.setAdapter((adapter));


    }

    @Override
    protected void onResume() {
        super.onResume();

        gvDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               /* Intent intent=new Intent(MainActivity.this,DetalleActivity.class);
                intent.putExtra("ruta",lista.get(i).getRuta());
                intent.putExtra("texto",lista.get(i).getTexto());
                startActivity(intent);
                */
               Intent intent = new Intent(MainActivity.this,GaleriaActivity.class);
                //Enviamos de dato la posicion
                intent.putExtra("posicion", i);
                startActivity(intent);
            }
        });
    }
}
