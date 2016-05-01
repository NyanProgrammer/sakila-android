package com.citiaps.jefferson.database.utilities;

import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.security.KeyStore;

/**
 * @author: Jefferson Morales De la Parra
 * Clase que se utiliza para obtener información del sistema
 */
public class SystemUtilities {
    private static final String TAG = "LifeCycle";
    Context context;

    /**
     * Constructor
     */
    public SystemUtilities(Context context) {
        this.context = context;
    }// SystemUtilities(Context context)

    /**
     * Método que consulta el estado de la conexión a Internet
     */
    public boolean isNetworkAvailable() {
        try{
        ConnectivityManager connectivityManager =
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        catch(Exception e){throw new RuntimeException(e);

         }
    }

}// SystemUtilities