package es.Pablo.calculaora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //aquí ponemos todos los botones y la pantalla... que no es poco
    protected TextView pantallaLCD;
    protected Button boton1;
    protected Button boton2;
    protected Button boton3;
    protected Button boton4;
    protected Button boton5;
    protected Button boton6;
    protected Button boton7;
    protected Button boton8;
    protected Button boton9;
    protected Button boton0;
    protected Button botonC;
    protected Button botonModulo;
    protected Button botonMas;
    protected Button botonMenos;
    protected Button botonDiv;
    protected Button botonPor;
    protected Button botonFlotante;
    protected Button botonIgual;



    //Establecidos los botones, pasamos a variables del programa
    private String texto="";
    private String operacion="";/*la idea es, al pulsar X operación se almacena kla variable de esa operación
    la susodicha se evalúa y entonces se opera a consecuencia*/
    private double numeroUno=0;
    private String resultadoOperacion=""; //almacena el resultado de una operación para manejo fácil
   // private boolean comaSiNo=false;//si la variable es false, no hay coma activa si es true la hay, entonces se desactiva el botón de comas

    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //ahora se emparejan con lo puesto en el .xml para poder usarlo

        pantallaLCD= (TextView) findViewById(R.id.pantallaLCD);
        boton1=(Button) findViewById(R.id.boton1);
        boton2=(Button) findViewById(R.id.boton2);
        boton3=(Button) findViewById(R.id.boton3);
        boton4=(Button) findViewById(R.id.boton4);
        boton5=(Button) findViewById(R.id.boton5);
        boton6=(Button) findViewById(R.id.boton6);
        boton7=(Button) findViewById(R.id.boton7);
        boton8=(Button) findViewById(R.id.boton8);
        boton9=(Button) findViewById(R.id.boton9);
        boton0=(Button) findViewById(R.id.boton0);
        botonDiv =(Button) findViewById(R.id.botonDiv);
        botonMas=(Button) findViewById(R.id.botonMas);
        botonMenos=(Button) findViewById(R.id.botonMenos);
        botonPor=(Button) findViewById(R.id.botonPor);
        botonFlotante=(Button) findViewById(R.id.botonFlotante);
        botonC=(Button) findViewById(R.id.botonC);
        botonModulo=(Button) findViewById(R.id.botonModulo);
        botonIgual=(Button)findViewById(R.id.botonIgual);

        //ahora, pasaremos a los eventos de botones

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "1";
                }else{
                    texto = texto +"1";
                }

               pantallaLCD.setText(texto);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "2";
                }else{
                    texto = texto +"2";
                }
                pantallaLCD.setText(texto);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "3";
                }else{
                    texto = texto +"3";
                }
                pantallaLCD.setText(texto);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "4";
                }else{
                    texto = texto +"4";
                }
                pantallaLCD.setText(texto);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "5";
                }else{
                    texto = texto +"5";
                }
                pantallaLCD.setText(texto);
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "6";
                }else{
                    texto = texto +"6";
                }
                pantallaLCD.setText(texto);
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "7";
                }else{
                    texto = texto +"7";
                }
                pantallaLCD.setText(texto);
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "8";
                }else{
                    texto = texto +"8";
                }
                pantallaLCD.setText(texto);
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "9";
                }else{
                    texto = texto +"9";
                }
                pantallaLCD.setText(texto);
            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                if(funcionComprobacionCeroIzquierda(texto)){
                    texto = "0";
                }else{
                    texto = texto +"0";
                }
                pantallaLCD.setText(texto);
            }
        });

        botonModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonFlotante.setEnabled(true);
                operacion="modulo";
                numeroUno= Double.valueOf(pantallaLCD.getText().toString());
                 pantallaLCD.setText("0");
            }
        });

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonFlotante.setEnabled(true);

                operacion="suma";
                 numeroUno= Double.valueOf(pantallaLCD.getText().toString());
               pantallaLCD.setText("0");


            }
        });

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonFlotante.setEnabled(true);
                operacion="resta";
                numeroUno= Double.valueOf(pantallaLCD.getText().toString());
                pantallaLCD.setText("0");
            }
        });

        botonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonFlotante.setEnabled(true);
                operacion="division";
                numeroUno= Double.valueOf(pantallaLCD.getText().toString());
                pantallaLCD.setText("0");
            }
        });

        botonPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonFlotante.setEnabled(true);
                operacion="multiplicacion";
                numeroUno= Double.valueOf(pantallaLCD.getText().toString());
                pantallaLCD.setText("0");
            }
        });

        botonFlotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    texto= pantallaLCD.getText().toString();//<============================================Tomamos el contenido de la pantalla lo convertimos a texto y se devuelve a la pantalla
                    texto = texto +".";
                    pantallaLCD.setText(texto);
                    botonFlotante.setEnabled(false);








                //Toast.makeText(MainActivity.this,"Se ha pulsado el botón de coma decimal", Toast.LENGTH_LONG).show();
            }
        });
        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonFlotante.setEnabled(true);


                numeroUno=0;
                operacion="";
                pantallaLCD.setText("0");

            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operacion!="") {


                    resultadoOperacion = funcionOperaciones(numeroUno, Double.valueOf(pantallaLCD.getText().toString()), operacion);//se introduce la variable numero1, el contenido de la pantalla y se mnira que operacion se hará
                    pantallaLCD.setText(resultadoOperacion);
                }else{
                    Toast.makeText(MainActivity.this, getString(R.string.textoIntroducirOperacion), Toast.LENGTH_LONG).show();
                }
               if(verSiNoHayComa(pantallaLCD.getText().toString())==true){
                    botonFlotante.setEnabled(false);

                }else{
                    botonFlotante.setEnabled(true);
                }
            }
        });

    }


    /**
     * Con esta función se comprueba que el primer número sea cero o no, si es cero, devuelve true
     * @param numero parámetro tipo String
     * **/
    public boolean funcionComprobacionCeroIzquierda(String numero){
        boolean salida;
        if (numero.startsWith("0")){
            salida = true;
        }else{
            salida = false;
        }
        return salida;
    }

    /**
     *Con esta función se evalúa el tipo de operación a realizar (parámetro operacion) y se opera el primer y segundo parámetros (primeroNumero y segundoNumero).
     * @param primerNumero parámetro tipo double
     * @param segundoNumero parámetro tipo double
     * @param operacion parámetro tipo String

     */
    public String funcionOperaciones(double primerNumero, double segundoNumero, String operacion){
        double resultadoDouble=0;
        String resultadoString="4";
        switch (operacion){
            case "suma":
                resultadoDouble=primerNumero+segundoNumero;
                resultadoString= String.valueOf(resultadoDouble);
                break;
            case "resta":
                resultadoDouble=primerNumero-segundoNumero;
                resultadoString= String.valueOf(resultadoDouble);
                break;
            case "division":
                if(primerNumero==0 && segundoNumero==0){
                    resultadoString="Error";
                }else {
                    resultadoDouble = primerNumero / segundoNumero;
                    resultadoString= String.valueOf(resultadoDouble);
                }
                break;

            case "multiplicacion":
                resultadoDouble=primerNumero*segundoNumero;
                resultadoString= String.valueOf(resultadoDouble);
                break;
            case "modulo":
                resultadoDouble= primerNumero%segundoNumero;
                resultadoString= String.valueOf(resultadoDouble);
                break;
        }


        if (resultadoDouble%1==0 && resultadoString!="Error"){//esto comprueba que no haya decimales entonces si no hay, muestre en pantalla un número entero y no doble

            resultadoString=resultadoString.substring(0,resultadoString.length()-2);


        }
        return resultadoString;
    }

    /**
     *Función que comprueba si hay un punto que delimita la coma flotante en un string dado, si no hay una coma devuelve true, si la hay, devuelve false.
     *@param textoDePantalla un String que comprueba si en su interior hay un punto que dilimita la coma decimal.
     *

     */
    public boolean verSiNoHayComa(String textoDePantalla){
        boolean contieneComa;


    if (textoDePantalla.indexOf(".")!=-1){
        contieneComa=true;

    }else{
        contieneComa=false;
    }
        return contieneComa;
    }

}