package pe.com.android.app2.fragmentos;


import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import pe.com.android.app2.MainActivity;
import pe.com.android.app2.R;
import pe.com.android.app2.modelos.Imagen;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagenFragment extends Fragment {

    private SimpleDraweeView sdvImagen;
    private TextView tvTexto;

    public ImagenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_imagen, container, false);

        sdvImagen=(SimpleDraweeView) view.findViewById(R.id.sdvImagen);
        tvTexto=(TextView) view.findViewById(R.id.tvTexto);
        //obtenemos la posicion enviada desde el adapter
        int posicion = getArguments().getInt("posicion");
        //obtenemos el objeto de tipo imagen segun la posicion
        Imagen imagen = MainActivity.lista.get(posicion);
        //Seteamos los datos de los componentes
        sdvImagen.setImageURI(Uri.parse(imagen.getRuta()));
        tvTexto.setText(imagen.getTexto());
        return view;
    }

}
