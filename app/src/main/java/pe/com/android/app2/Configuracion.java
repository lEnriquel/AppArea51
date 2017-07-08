package pe.com.android.app2;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by alumno on 7/5/17.
 */

public class Configuracion extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(getApplicationContext());
    }
}
