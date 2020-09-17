package app.pdg.footballapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.pdg.footballapp.R
import app.pdg.footballapp.model.Teams
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_team.view.*
import java.util.*

class TeamAdapter : RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    private var data: List<Teams> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_team, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(data[position])

    }


    fun setData(data: List<Teams>) {
        this.data = data
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Teams) = with(itemView) {
            Glide.with(context).load(item.image).into(ivTeam)
            tvTeam.text = item.name

            setOnClickListener {
                //no use
            }
        }
    }
}