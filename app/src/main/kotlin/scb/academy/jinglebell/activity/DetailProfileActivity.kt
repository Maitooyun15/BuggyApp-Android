package scb.academy.jinglebell.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_profile.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.model.Song

class DetailProfileActivity : AppCompatActivity() {


    companion object {
        const val EXTRA_KEY_TITLE = "TITLE_NAME"


        fun startActivity(context: Context?, titleName: String) =
            context?.startActivity(Intent(context, DetailProfileActivity::class.java).also { intent ->
                intent.putExtra(EXTRA_KEY_TITLE, titleName)
            })
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        txtName.text = intent.getStringExtra(EXTRA_KEY_TITLE)
    }
}
