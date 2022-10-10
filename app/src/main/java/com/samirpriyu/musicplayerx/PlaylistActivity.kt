package com.samirpriyu.musicplayerx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.samirpriyu.musicplayerx.databinding.ActivityPlaylistBinding

class PlaylistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlaylistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.coolPink)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backBtnPlayList.setOnClickListener { finish() }
    }
}