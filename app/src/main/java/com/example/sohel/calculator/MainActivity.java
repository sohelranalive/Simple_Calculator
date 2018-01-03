package com.example.sohel.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 , btndot , btn0 , btnclr , btnAdd , btnSub ,btnMul, btnDiv , btnEqual;
    EditText edtresult;
    float valueone,valuetwo;
    boolean addition,subtract,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btndot = (Button) findViewById(R.id.buttondot);
        btn0 = (Button) findViewById(R.id.button0);
        btnclr = (Button) findViewById(R.id.buttonC);
        btnAdd = (Button) findViewById(R.id.buttonadd);
        btnSub = (Button) findViewById(R.id.buttonsub);
        btnMul = (Button) findViewById(R.id.buttonmul);
        btnDiv = (Button) findViewById(R.id.buttondiv);
        btnEqual = (Button) findViewById(R.id.buttoneql);
        edtresult = (EditText) findViewById(R.id.edt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+".");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText()+"0");
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    valueone = Float.parseFloat(edtresult.getText() + "");
                    addition = true;
                    edtresult.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(edtresult.getText() + "");
                subtract = true ;
                edtresult.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(edtresult.getText() + "");
                multiplication = true ;
                edtresult.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(edtresult.getText()+"");
                division = true ;
                edtresult.setText(null);
            }
        });




        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuetwo = Float.parseFloat(edtresult.getText() + "");

                if (addition == true){

                    edtresult.setText(valueone + valuetwo +"");

                }


                if (subtract == true){
                    edtresult.setText(valueone - valuetwo+"");

                }

                if (multiplication == true){
                    edtresult.setText(valueone * valuetwo+"");

                }

                if (division == true){
                    edtresult.setText(valueone / valuetwo +"");
                }
            }
        });




    }
}
