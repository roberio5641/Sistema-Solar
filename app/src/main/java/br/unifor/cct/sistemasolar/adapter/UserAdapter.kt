package br.unifor.cct.sistemasolar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.sistemasolar.R
import br.unifor.cct.sistemasolar.model.User

class UserAdapter(val list:List<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        val planet: TextView = view.findViewById(R.id.sistemasolar_textview_planetas)
        val massa: TextView = view.findViewById(R.id.sistemasolar_textview_massa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater
            .from(parent.context).
            inflate(R.layout.solar_list_item, parent, false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.planet.text = list[position].planet
        holder.massa.text = list[position].caracteristicas
    }

    override fun getItemCount(): Int {
       return list.size
    }

}