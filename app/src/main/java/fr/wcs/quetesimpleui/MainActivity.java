package fr.wcs.quetesimpleui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox ok = (CheckBox) findViewById(R.id.ok);
        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final TextView félicitations = (TextView) findViewById(R.id.félicitations);
        final Button Valider = (Button) findViewById(R.id.Valider);
        editText1.setEnabled(false);
        editText2.setEnabled(false);
        Valider.setEnabled(false);

        ok.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (ok.isChecked())
                {
                    editText1.setEnabled(true);
                    editText2.setEnabled(true);
                    Valider.setEnabled(true);

                }

                else
                {
                    editText1.setEnabled(false);
                    editText2.setEnabled(false);
                    Valider.setEnabled(false);
                }

            }
        });
        Valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            félicitations.setText("Félicitations "+editText1.getText()+" "+editText2.getText() );
            }
        });


    }


}
