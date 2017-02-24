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

    EditText editText1;
    EditText editText2;
    CheckBox ok;
    Button Valider;
    TextView félicitations;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = (CheckBox) findViewById(R.id.ok);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        félicitations = (TextView) findViewById(R.id.félicitations);
        Valider = (Button) findViewById(R.id.Valider);
        editText1.setEnabled(false);
        editText2.setEnabled(false);
        Valider.setEnabled(false);
        félicitations.setVisibility(View.INVISIBLE);

        ok.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                editText1.setEnabled(ok.isChecked());
                editText2.setEnabled(ok.isChecked());
                Valider.setEnabled(ok.isChecked());

            }
        });
        Valider.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                String success = ("Félicitations " + editText1.getText() + " " + editText2.getText());

                if(editText1.length() == 0 || editText2.length() == 0 || editText1.getText().toString().equals("  ")) {
                    Toast.makeText(MainActivity.this, "Tu dois renseigner le nom et le prénom !",
                            Toast.LENGTH_LONG).show();
                    félicitations.setVisibility(View.INVISIBLE);
                }

                else if(editText1.getText().toString().equals("Pole") && editText2.getText().toString().equals("Emploi")){

                    Toast.makeText(MainActivity.this, "Vas plutôt à l'AFPA, sale NOOB !",
                            Toast.LENGTH_LONG).show();
                    félicitations.setVisibility(View.INVISIBLE);
                }
                else if(editText1.getText().toString().equals("Romain") && editText2.getText().toString().equals("Coeur")){

                    Toast.makeText(MainActivity.this, "Tu dois finir le niveau 6 de France IOI avant de pouvoir postuler !",
                            Toast.LENGTH_LONG).show();
                    félicitations.setVisibility(View.INVISIBLE);
                }
                else if(editText1.getText().toString().equals("Edward") && editText2.getText().toString().equals("Marmounier")) {

                    Toast.makeText(MainActivity.this, "Tu es déjà inscrit, mais peux-tu coder plus vite qu'un indien ?",
                            Toast.LENGTH_LONG).show();
                    félicitations.setVisibility(View.INVISIBLE);
                }

                else
                {
                    félicitations.setVisibility(View.VISIBLE);
                    félicitations.setText(success);

                }

            }
        });


    }


}
