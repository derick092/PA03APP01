package senac.poa.a03a01

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item_aluno.view.*
import senac.poa.a03a01.Model.Aluno

data class AlunoAdapter(var alunos: ArrayList<Aluno>, var context: Context) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View = LayoutInflater.from(context).inflate(R.layout.list_item_aluno, parent, false )

        var matricula = view.tvMatricula
        var nome = view.tvNome
        var email = view.tvEmail

        matricula.text = alunos.get(position).Matricula
        nome.text = alunos.get(position).Nome
        email.text = alunos.get(position).Email

        return view
    }

    override fun getItem(position: Int): Any = alunos.get(position)

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = alunos.count()
}