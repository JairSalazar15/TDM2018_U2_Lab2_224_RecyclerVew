package tdm2018.ittepic.edu.tdm2018_u2_lab2_224_recyclervew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tdm2018.ittepic.edu.tdm2018_u2_lab2_224_recyclervew.entidades.Usuario;


public class DetalleUsuarioActivity extends AppCompatActivity {

    TextView campoClave, campoNombre, campoSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_usuario);

        campoClave = (TextView) findViewById(R.id.campoId);
        campoNombre = (TextView) findViewById(R.id.campoNombre);
        campoSalario = (TextView) findViewById(R.id.campoTelefono);

        Bundle objetoEnviado=getIntent().getExtras();
        Usuario user=null;

        if(objetoEnviado!=null){
            user= (Usuario) objetoEnviado.getSerializable("usuario");
            campoClave.setText(user.getId().toString());
            campoNombre.setText(user.getNombre().toString());
            campoSalario.setText(user.getTelefono().toString());

        }

    }
}
