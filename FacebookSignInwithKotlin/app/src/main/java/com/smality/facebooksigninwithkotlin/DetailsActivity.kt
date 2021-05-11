package com.smality.facebooksigninwithkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*
import com.facebook.Profile;
class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        //facebook name ve email bilgilerini MainActivity'den aldım.
        val facebookName = intent.getStringExtra("facebook_name")
        val facebookEmail = intent.getStringExtra("facebook_email")
        //Bilgileri arayüze aktardım
        facebook_name_textview.text = facebookName
        facebook_email_textview.text = facebookEmail

        //Facebook kullanıcısının profil fotoğrafını alıp,
        //Picasso sınıfı ile arayüzde gösterdim
        Picasso.get().load(Profile.getCurrentProfile().getProfilePictureUri(400, 400)).into(profil_pic);
    }
}
