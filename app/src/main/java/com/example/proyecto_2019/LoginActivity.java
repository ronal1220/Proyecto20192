package com.example.proyecto_2019;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    EditText et_user,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //SplashScream
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //casting d
        et_user = findViewById(R.id.et_usuario);
        et_password = findViewById(R.id.et_contrasena);

    }

    public void nuevoRegistro(View view){
        Intent intent = new Intent(this,RegistroActivity.class);
        startActivity(intent);
    }

    public void login(View view){

        Intent intent = new Intent(this,ContainerActivity.class);
        startActivity(intent);

     /*  SqLiteDB sqLiteDB = new SqLiteDB(this,"db",null,1);
       SQLiteDatabase database = sqLiteDB.getWritableDatabase();

       String user = et_user.getText().toString();
       String pass = et_password.getText().toString();


       if(!user.isEmpty() && !pass.isEmpty()){

           Cursor cursor = database.rawQuery("select user,contrasena from usuario where user='"+user+"'and contrasena='"+pass +"'" ,null);
            if (cursor.moveToFirst()){
                String u = cursor.getString(0);
                String p = cursor.getString(1);

                if (user.equals(u) && pass.equals(p)){
                    Intent intent = new Intent(this,ContainerActivity.class);
                    startActivity(intent);
                    Toast.makeText(this,"Bienvenido",Toast.LENGTH_SHORT).show();
                    et_user.setText("");
                    et_password.setText("");
                }

            }else {
                Toast.makeText(this,"El usuario no existe",Toast.LENGTH_SHORT).show();
            }
       }else {
           Toast.makeText(this,"Campos vacios",Toast.LENGTH_SHORT).show();
       }*/
    }

}
