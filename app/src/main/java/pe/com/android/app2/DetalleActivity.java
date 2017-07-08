package pe.com.android.app2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

public class DetalleActivity extends AppCompatActivity {

    private SimpleDraweeView sdvImagen;
    private TextView tvTexto;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

         //Habilitamos el boton de atras
         getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Zoomable drawable view -->Para agradar, mover, etc. la imagen

         //Vinculamos variables con componentes
         sdvImagen = (SimpleDraweeView) findViewById(R.id.sdvImagen);
         tvTexto = (TextView) findViewById(R.id.tvTexto);

        //Obtenemos los datos que se han enviado
        String ruta = getIntent().getStringExtra("ruta");
        String texto = getIntent().getStringExtra("texto");

         sdvImagen.setImageURI(Uri.parse(ruta));
         tvTexto.setText(texto);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Verificar que elemento a realizado el evento
        switch (item.getItemId()){
            //Verificamos si es que el elemento selecciona es el boton de homre
            case android.R.id.home:
                //Retrocedemos
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
