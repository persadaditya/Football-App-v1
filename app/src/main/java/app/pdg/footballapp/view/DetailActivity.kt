package app.pdg.footballapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.GridLayoutManager
import app.pdg.footballapp.R
import app.pdg.footballapp.adapter.TeamAdapter
import app.pdg.footballapp.model.League
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val data = intent.getParcelableExtra<League>("data")
        if (data!=null){
            tvLeagueName.text = data.name
            tvLeagueDesc.text = data.description
            Glide.with(this).load(data.image).into(ivLeagueImage)
            Glide.with(this).load(data.icon).into(ivLeagueIcon)

            val adapter = TeamAdapter()
            recyclerView.layoutManager = GridLayoutManager(this, 3)
            recyclerView.adapter = adapter
            adapter.setData(data.teams)
        }

    }
}