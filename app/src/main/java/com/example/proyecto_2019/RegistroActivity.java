package com.example.proyecto_2019;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;


public class RegistroActivity extends AppCompatActivity {

    EditText et_user,et_email,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        showToolbar(getResources().getString(R.string.crear),true);
        et_user = findViewById(R.id.crearUsuario);
        et_email = findViewById(R.id.email);
        et_password = findViewById(R.id.crearContrasena);


    }

    public void showToolbar(String titulo,boolean previus){
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void registro(View view){

        /*SqLiteDB sqLiteDB= new SqLiteDB(this,"db",null,1);
        SQLiteDatabase database = sqLiteDB.getWritableDatabase();
        String uid = et_user.getText().toString();
        String mail = et_email.getText().toString();
        String pwd = et_password.getText().toString();

        if(!uid.isEmpty() && !pwd.isEmpty() && !mail.isEmpty()){
            ContentValues values = new ContentValues();
            values.put("user",uid);
            values.put("email",mail);
            values.put("password",pwd);
            database.insert("usuario",null,values);
            database.close();
            et_user.setText("");
            et_email.setText("");
            et_password.setText("");
            Toast.makeText(this,"Registro Exitoso",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }*/

    }

}
