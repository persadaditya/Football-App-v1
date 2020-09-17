package app.pdg.footballapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.marginBottom
import app.pdg.footballapp.R
import app.pdg.footballapp.model.Zone
import com.bumptech.glide.Glide
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar

class ZoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        verticalLayout {
            //prepare for layout
            val zone = intent.getIntExtra("data",0)
            val toolbar = toolbar {
                title = "Detail Zone"
            }
            val image = imageView().lparams(width = matchParent, height = dip(200)){
                bottomMargin = dip(8)
            }

            val desc = textView().lparams(matchParent, wrapContent){
                margin = dip(14)
            }

            //get data then set to expected view
            val allDesc = this@ZoneActivity.resources.getStringArray(R.array.description_zone)
            when(zone){
                Zone.ZONE_UEFA.code -> {
                    toolbar.subtitle = "UEFA"
                    Glide.with(this@ZoneActivity).load(R.drawable.ils_uefa).into(image)
                    desc.text = allDesc[0]
                }
                Zone.ZONE_CONMEBOL.code ->{
                    toolbar.subtitle = "CONMEBOL"
                    Glide.with(this@ZoneActivity).load(R.drawable.ils_conmebol).into(image)
                    desc.text = allDesc[1]
                }
                Zone.ZONE_AFC.code -> {
                    toolbar.subtitle = "AFC"
                    Glide.with(this@ZoneActivity).load(R.drawable.ils_afc).into(image)
                    desc.text = allDesc[2]
                }
            }
        }
    }
}