package app.pdg.footballapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import app.pdg.footballapp.R
import app.pdg.footballapp.adapter.LeagueAdapter
import app.pdg.footballapp.model.League
import app.pdg.footballapp.model.Zone
import app.pdg.footballapp.viewmodel.MainViewModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: LeagueAdapter
    var leaguesData: List<League>? = null
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        adapter = LeagueAdapter()
        initViewPager()
        val background = "https://images.unsplash.com/photo-1544135756-8a8f02e64671?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"
        Glide.with(this).load(background).centerCrop().into(ivBackLeague)

        indicator.setViewPager2(pager)

        //set data
        viewModel.leagueData().observe(this, {
            if (it==null){
                return@observe
            }
            leaguesData = it
            adapter.setData(it)
        })

        learnBtn.setOnClickListener {
            val zone = leaguesData?.get(position)?.zone
            startActivity<ZoneActivity>("data" to zone)
        }

    }

    private fun initViewPager(){
        pager.adapter = adapter
        pager.offscreenPageLimit = 4
        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)

        pager.setPageTransformer { page, position ->
            val viewPager = page.parent.parent as ViewPager2
            val offset = position * -(22 * offsetPx + pageMarginPx)
            if (viewPager.orientation == ViewPager2.ORIENTATION_HORIZONTAL) {
                if (ViewCompat.getLayoutDirection(viewPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                    page.translationX = -offset
                } else {
                    page.translationX = offset
                }
            } else {
                page.translationY = offset
            }
        }

        pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                this@MainActivity.position = position

                val league = leaguesData?.get(position)
                when (league?.zone) {
                    Zone.ZONE_AFC.code -> {
                        Glide.with(this@MainActivity).load(R.drawable.ils_afc).into(ivZone)
                        val res = this@MainActivity.resources
                        val zone = "AFC"
                        tvZone.text = String.format(res.getString(R.string.zone_desc), zone)
                    }
                    Zone.ZONE_UEFA.code -> {
                        Glide.with(this@MainActivity).load(R.drawable.ils_uefa).into(ivZone)
                        val res = this@MainActivity.resources
                        val zone = "UEFA"
                        tvZone.text = String.format(res.getString(R.string.zone_desc), zone)
                    }
                    Zone.ZONE_CONMEBOL.code -> {
                        Glide.with(this@MainActivity).load(R.drawable.ils_conmebol).into(ivZone)
                        val res = this@MainActivity.resources
                        val zone = "CONMEBOL"
                        tvZone.text = String.format(res.getString(R.string.zone_desc), zone)
                    }
                }



            }
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
        exitProcess(0)
    }
}