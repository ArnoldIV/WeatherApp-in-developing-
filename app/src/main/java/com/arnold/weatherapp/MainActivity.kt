package com.arnold.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    main_city_name_tv.text = "Kyiv"
        main_date_tv.text = "14 february"
        main_weather_condition_icon.setImageResource(R.drawable.ic_sun)
        main_weather_condition_description.text = "Clear sky"
        main_temp.text = "25°"
        main_temp_min_tv.text = "19°"
        main_temp_max_tv.text = "28°"
        main_weather_image.setImageResource(R.mipmap.clear_cloud_xhdpi)
        main_pressure_tv.text = "1020 hPa"
        main_humidity_tv.text = "80%"
        main_temp_av_tv.text = "25°"
        main_wind_speed_tv.text = "5 m/s"
        main_sunrise_tv.text = "5:00"
        main_sunset_tv.text = "20:00"
    }

}