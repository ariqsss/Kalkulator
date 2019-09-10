package com.kalkulator.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button button0,button1,button2,button3,button4,
        button5,button6,button7,button8,button9,
        buttondivide,buttonmult,buttonplus,buttonminus,
        buttonequal,buttonclear,buttoncoma;
EditText textfield;
int clearcount=0;
int numberflag=0;
double firstnumber,secondnumber;
boolean plus,minus,mult,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        textfield.setText("0");

        buttoncoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((textfield.getText().toString()).contains(".")){
                    textfield.setText(textfield.getText()+"");
                }
               else if((numberflag==1)){
                    textfield.setText(".");
                    numberflag=0;
                }

                else{ textfield.setText(textfield.getText()+".");}
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("0");
                }
                else if((numberflag==1)){
                    textfield.setText("0");
                    numberflag=0;
                }
                else{ textfield.setText(textfield.getText()+"0");}
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("1");
                }
                else if((numberflag==1)){
                    textfield.setText("1");
                    numberflag=0;
                }
                else{textfield.setText(textfield.getText()+"1");}
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("2");
                }
                else if((numberflag==1)){
                    textfield.setText("2");
                    numberflag=0;
                }
               else{ textfield.setText(textfield.getText()+"2");}
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("3");
                }
                else if((numberflag==1)){
                    textfield.setText("3");
                    numberflag=0;
                }
               else{ textfield.setText(textfield.getText()+"3");}
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("4");
                }
                else if((numberflag==1)){
                    textfield.setText("4");
                    numberflag=0;
                }
                else{textfield.setText(textfield.getText()+"4");}
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("5");
                }
               else if((numberflag==1)){
                    textfield.setText("5");
                    numberflag=0;
                }
               else{ textfield.setText(textfield.getText()+"5");}
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("6");
                }
                else if((numberflag==1)){
                    textfield.setText("6");
                    numberflag=0;
                }
               else{ textfield.setText(textfield.getText()+"6");}
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("7");
                }
                else if((numberflag==1)){
                    textfield.setText("7");
                    numberflag=0;
                }
               else{ textfield.setText(textfield.getText()+"7");}
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("8");
                }
                else if((numberflag==1)){
                    textfield.setText("8");
                    numberflag=0;
                }
                else{textfield.setText(textfield.getText()+"8");}
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textfield.getText().toString().equals("0")){
                    textfield.setText("9");
                }
                else if((numberflag==1)){
                    textfield.setText("9");
                    numberflag=0;
                }
               else{ textfield.setText(textfield.getText()+"9");}
            }
        });
        ////////////////////////////////////////////////////////////
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if((plus||minus||mult||divide)==true){
                    secondnumber=Double.parseDouble(textfield.getText().toString());
                    if(plus==true){
                        textfield.setText(firstnumber+secondnumber+"");
                        firstnumber=firstnumber+secondnumber;
                        plus=false;
                    }
                    if(minus==true){
                        textfield.setText(firstnumber-secondnumber+"");
                        firstnumber=firstnumber-secondnumber;
                        minus=false;
                    }
                    if(mult==true){
                        textfield.setText(firstnumber*secondnumber+"");
                        firstnumber=firstnumber*secondnumber;
                        mult=false;
                    }
                    if(divide==true){
                        textfield.setText(firstnumber/secondnumber+"");
                        firstnumber=firstnumber/secondnumber;
                        divide=false;
                    }
                }
                else{firstnumber=Double.parseDouble(textfield.getText().toString());}
                plus=true;
                numberflag=1;

            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((plus||minus||mult||divide)==true){
                    secondnumber=Double.parseDouble(textfield.getText().toString());
                    if(plus==true){
                        textfield.setText(firstnumber+secondnumber+"");
                        firstnumber=firstnumber+secondnumber;
                        plus=false;
                    }
                    if(minus==true){
                        textfield.setText(firstnumber-secondnumber+"");
                        firstnumber=firstnumber-secondnumber;
                        minus=false;
                    }
                    if(mult==true){
                        textfield.setText(firstnumber*secondnumber+"");
                        firstnumber=firstnumber*secondnumber;
                        mult=false;
                    }
                    if(divide==true){
                        textfield.setText(firstnumber/secondnumber+"");
                        firstnumber=firstnumber/secondnumber;
                        divide=false;
                    }
                }
                else{firstnumber=Double.parseDouble(textfield.getText().toString());}
                minus=true;
                numberflag=1;

            }
        });
        buttonmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((plus||minus||mult||divide)==true){
                    secondnumber=Double.parseDouble(textfield.getText().toString());
                    if(plus==true){
                        textfield.setText(firstnumber+secondnumber+"");
                        firstnumber=firstnumber+secondnumber;
                        plus=false;
                    }
                    if(minus==true){
                        textfield.setText(firstnumber-secondnumber+"");
                        firstnumber=firstnumber-secondnumber;
                        minus=false;
                    }
                    if(mult==true){
                        textfield.setText(firstnumber*secondnumber+"");
                        firstnumber=firstnumber*secondnumber;
                        mult=false;
                    }
                    if(divide==true){
                        textfield.setText(firstnumber/secondnumber+"");
                        firstnumber=firstnumber/secondnumber;
                        divide=false;
                    }
                }
                else{firstnumber=Double.parseDouble(textfield.getText().toString());}
                mult=true;
                numberflag=1;
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((plus||minus||mult||divide)==true){
                    secondnumber=Double.parseDouble(textfield.getText().toString());
                    if(plus==true){
                        textfield.setText(firstnumber+secondnumber+"");
                        firstnumber=firstnumber+secondnumber;
                        plus=false;
                    }
                    if(minus==true){
                        textfield.setText(firstnumber-secondnumber+"");
                        firstnumber=firstnumber-secondnumber;
                        minus=false;
                    }
                    if(mult==true){
                        textfield.setText(firstnumber*secondnumber+"");
                        firstnumber=firstnumber*secondnumber;
                        mult=false;
                    }
                    if(divide==true){
                        textfield.setText(firstnumber/secondnumber+"");
                        firstnumber=firstnumber/secondnumber;
                        divide=false;
                    }
                }
                else{firstnumber=Double.parseDouble(textfield.getText().toString());}
                divide=true;
                numberflag=1;
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               secondnumber=Double.parseDouble(textfield.getText().toString());
               if(plus==true){
                   textfield.setText(firstnumber+secondnumber+"");
                   plus=false;
               }
               if(minus==true){
                   textfield.setText(firstnumber-secondnumber+"");
                   minus=false;
               }
               if(mult==true){
                   textfield.setText(firstnumber*secondnumber+"");
                   mult=false;
               }
               if(divide==true){
                   textfield.setText(firstnumber/secondnumber+"");
                   divide=false;
               }
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clearcount==0){
                textfield.setText("");clearcount+=1;}
                if(clearcount==1){
                    plus=false;minus=false;mult=false;divide=false;
                    clearcount=0;
                }

            }
        });

    }
    public void initViews(){
        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        //////////////////////////
        buttoncoma=(Button)findViewById(R.id.buttoncoma);
        buttonplus=(Button)findViewById(R.id.buttonplus);
        buttonminus=(Button)findViewById(R.id.buttonminus);
        buttonmult=(Button)findViewById(R.id.buttonmult);
        buttondivide=(Button)findViewById(R.id.buttondivide);
        buttonequal=(Button)findViewById(R.id.buttonequal);
        buttonclear=(Button)findViewById(R.id.buttonclear);
        textfield=(EditText)findViewById(R.id.textfield);
    }

}
