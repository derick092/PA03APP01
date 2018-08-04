package senac.poa.a03a01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import senac.poa.a03a01.Model.Aluno

class MainActivity : AppCompatActivity() {

    var alunos: ArrayList<Aluno> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        InicializaLista()

        var listAlunos : ListView = lvAlunos
        listAlunos.adapter = AlunoAdapter(alunos, this)


    }

    private fun InicializaLista(){
        alunos.add(Aluno("001", "Rubetino", "rubenito@rmail.com"))
        alunos.add(Aluno("002", "Lindomar", "lindomar@lmail.com"))
        alunos.add(Aluno("003", "Juraci", "juraci@jmail.com"))
    }
}
