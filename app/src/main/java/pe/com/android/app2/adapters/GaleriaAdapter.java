package pe.com.android.app2.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import pe.com.android.app2.MainActivity;
import pe.com.android.app2.fragmentos.ImagenFragment;

/**
 * Created by alumno on 7/5/17.
 */

public class GaleriaAdapter extends FragmentStatePagerAdapter {

    public GaleriaAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //Creamos un Fragmento
        ImagenFragment imagenFragment = new ImagenFragment();
        //Creamos una variable Bundle para poder pasar informacion
        Bundle bundle = new Bundle();
        //Enviamos los datos a traves del bundle
        bundle.putInt("posicion",position);
        //Agregamos los parametros a nuestro fragmento
        imagenFragment.setArguments(bundle);

        //retornamos el fragmento con los datos cargados
        return imagenFragment;
    }

    @Override
    public int getCount() {
        return MainActivity.lista.size();
    }
}
