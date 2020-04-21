package com.apulido.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /* Creation of components(objects) Only this class will have access to this components, Creation of the object  */
    private EditText edit_text_value_1;
    private EditText edit_text_value_2;
    private TextView text_view_result;


    String[] array = {"8C", "D9", "26", "1D", "69", "B7", "96", "DB"};
    StringBuilder output = new StringBuilder();







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Saving object from  graphical design to logical design  */
        edit_text_value_1 = (EditText)findViewById(R.id.txt_num1);
        edit_text_value_2 = (EditText)findViewById(R.id.txt_num2);
        text_view_result = (TextView)findViewById(R.id.Result);

        byte[] BEACommand = new byte[4];
        BEACommand[0] = (byte)0xFF;
        BEACommand[1] = (byte)0x05;
        BEACommand[0] = 0xFF;
        BEACommand[1] = 0x05;


        String[] array = {"8C", "D9", "26", "1D", "69", "B7", "96", "DB"};

        StringBuilder output = new StringBuilder();
        for ( String hex : array ) {
            output.append( (char)Integer.parseInt( hex, 16 ) );
        }

        byte[] bytes = new byte[array.length];
        for ( int i = 0; i < array.length; i++ ) {
            bytes[i] = (byte)Integer.parseInt( array[i], 16 );
        }

    }

    /*  Addition method --------------------------- */

    public void Addition (View view){

        /*  Obtaining values from text box numbers in string form */
        String value1 = edit_text_value_1.getText().toString();
        String value2 = edit_text_value_2.getText().toString();
        /*  Converting obtained values to integers  */
        double double_value1 = Double.parseDouble(value1);
        double double_value2 = Double.parseDouble(value2);
        /*  Adding process  */
        double sum = double_value1 + double_value2;
        /*  Converting result into string  */
        String Result = String.valueOf(sum);
        /*  Passing result into text box  */
        text_view_result.setText(Result);

    }


    /*  Addition method --------------------------- */

    public void Subtraction(View view){

        /*  Obtaining values from text box numbers in string form */
        String value1 = edit_text_value_1.getText().toString();
        String value2 = edit_text_value_2.getText().toString();
        /*  Converting obtained values to integers  */
        double double_value1 = Double.parseDouble(value1);
        double double_value2 = Double.parseDouble(value2);
        /*  Adding process  */
        double subt = double_value1 - double_value2;
        /*  Converting result into string  */
        String Result = String.valueOf(subt);
        /*  Passing result into text box  */
        text_view_result.setText(Result);

    }

    /*  Addition method --------------------------- */

    public void Division (View view){

        /*  Obtaining values from text box numbers in string form */
        String value1 = edit_text_value_1.getText().toString();
        String value2 = edit_text_value_2.getText().toString();
        /*  Converting obtained values to integers  */
        double double_value1 = Double.parseDouble(value1);
        double double_value2 = Double.parseDouble(value2);
        /*  Adding process  */
        double div = double_value1 / double_value2;
        /*  Converting result into string  */
        String Result = String.valueOf(div);
        /*  Passing result into text box  */
        text_view_result.setText(Result);

    }

    /*  Addition method --------------------------- */

    public void Multiplication (View view){

        /*  Obtaining values from text box numbers in string form */
        String value1 = edit_text_value_1.getText().toString();
        String value2 = edit_text_value_2.getText().toString();
        /*  Converting obtained values to integers  */
        double double_value1 = Double.parseDouble(value1);
        double double_value2 = Double.parseDouble(value2);
        /*  Adding process  */
        double mul = double_value1 * double_value2;
        /*  Converting result into string  */
        String Result = String.valueOf(mul);
        /*  Passing result into text box  */
        text_view_result.setText(Result);

    }






}
