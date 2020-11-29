package carlos.cyrillo.soma_numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView saida = findViewById(R.id.saida);
        saida.setText("Seja bem vindo");
    }

    public void clickSomaBotao(View view){
        TextView saida =findViewById(R.id.saida);
        EditText valor1=findViewById(R.id.editTextTextValor1);
        EditText valor2=findViewById(R.id.editTextTextValor2);


        Double valor1F=Double.parseDouble(valor1.getText().toString());
        Double valor2F=Double.parseDouble(valor2.getText().toString());
       Double result= valor1F+valor2F;
        saida.setText(String.format(result.toString()));

    }

    public void clickMultiplicaBotao(View view){
        TextView saida =findViewById(R.id.saida);
        EditText valor1=findViewById(R.id.editTextTextValor1);
        EditText valor2=findViewById(R.id.editTextTextValor2);


        Double valor1F=Double.parseDouble(valor1.getText().toString());
        Double valor2F=Double.parseDouble(valor2.getText().toString());
        Double result= valor1F*valor2F;
        saida.setText(String.format(result.toString()));

    }


    public void clickDivisaoBotao(View view){
        TextView saida =findViewById(R.id.saida);
        EditText valor1=findViewById(R.id.editTextTextValor1);
        EditText valor2=findViewById(R.id.editTextTextValor2);


        Double valor1F=Double.parseDouble(valor1.getText().toString());
        Double valor2F=Double.parseDouble(valor2.getText().toString());
        Double result= valor1F/valor2F;
        saida.setText(String.format(result.toString()));

    }

    public void clickSubtracaoBotao(View view){
        TextView saida =findViewById(R.id.saida);
        EditText valor1=findViewById(R.id.editTextTextValor1);
        EditText valor2=findViewById(R.id.editTextTextValor2);


        Double valor1F=Double.parseDouble(valor1.getText().toString());
        Double valor2F=Double.parseDouble(valor2.getText().toString());
        Double result= valor1F-valor2F;
        saida.setText(String.format(result.toString()));

    }
}