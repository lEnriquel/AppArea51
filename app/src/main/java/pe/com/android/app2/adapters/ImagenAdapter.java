package pe.com.android.app2.adapters;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import pe.com.android.app2.R;
import pe.com.android.app2.modelos.Imagen;

/**
 * Created by alumno on 7/5/17.
 */

public class ImagenAdapter extends ArrayAdapter<Imagen> {
    private Context context;
    private ArrayList<Imagen> lista;

    public ImagenAdapter(@NonNull Context context, @NonNull ArrayList<Imagen> objects) {
        super(context, 0, objects);
        this.context = context;
        this.lista = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item_imagen,parent,false);

        Imagen imagen = lista.get(position);

        SimpleDraweeView sdvImagen=(SimpleDraweeView) convertView.findViewById(R.id.sdvImagen);
        TextView tvTexto=(TextView) convertView.findViewById((R.id.tvTexto));

        sdvImagen.setImageURI(Uri.parse(imagen.getRuta()));
        tvTexto.setText(imagen.getTexto());

        return convertView;
    }
}
