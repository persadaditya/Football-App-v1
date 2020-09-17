package app.pdg.footballapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.pdg.footballapp.R
import app.pdg.footballapp.model.League
import app.pdg.footballapp.view.DetailActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_league.view.*
import org.jetbrains.anko.startActivity
import java.util.*

class LeagueAdapter : RecyclerView.Adapter<LeagueAdapter.ViewHolder>() {

    private var data: List<League> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_league, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(data[position])

    fun setData(data: List<League>) {
        this.data = data
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: League) = with(itemView) {

            Glide.with(context).load(item.icon).into(ivLeague)
            tvLeagueName.text = item.name


            setOnClickListener {
                //anko common
                context.startActivity<DetailActivity>("data" to item)
            }
        }
    }
}