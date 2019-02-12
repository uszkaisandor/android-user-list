package com.example.trainingproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trainingproject.service.RandomColor
import com.pranavpandey.android.dynamic.toasts.DynamicToast
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.drawable.ColorDrawable
import com.afollestad.materialdialogs.MaterialDialog
import de.mateware.snacky.Snacky


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager ?. let {
            val adapter = ViewPagerAdapter(supportFragmentManager)
            view_pager.adapter = adapter
        }

        RandomColor.setButtonBackground(btnTabFirst)
        RandomColor.setButtonBackground(btnTabSecond)
        RandomColor.setButtonBackground(btnTabThird)

        btnTabFirst.setOnClickListener{
        }

        btnTabSecond.setOnClickListener{
        }

        btnTabThird.setOnClickListener{
        }

        iconButtonLeft.setOnClickListener{
            val toastMessage = R.string.left_icon_button_pressed.toString()
            val textColor = Color.parseColor("#ffffff");
            val backgroundColor = (btnTabFirst.background as ColorDrawable).color
            DynamicToast.make(applicationContext, toastMessage, textColor , backgroundColor).show();
        }

        iconButtonCenter.setOnClickListener{
            val textColor = Color.parseColor("#ffffff");
            val backgroundColor = (btnTabSecond.background as ColorDrawable).color
            Snacky.builder()
                .setActivity(this@MainActivity)
                .setText(R.string.center_icon_button_pressed.toString())
                .setTextColor(textColor)
                .centerText()
                .setBackgroundColor(backgroundColor)
                .setDuration(Snacky.LENGTH_SHORT)
                .build()
                .show()
        }

        iconButtonRight.setOnClickListener{
            }
        }

    }
}
