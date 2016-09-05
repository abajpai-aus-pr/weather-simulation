package com.simulation.weather.dto

/**
  * Created by abajpai on 9/3/16.
  */
case class WeatherSnapshot (
                      city: String,
                      time: Long,
                      latitude: Double,
                      longitude: Double,
                      temperatureInKelvin: Double,
                      pressure: Double,
                      humidity: Int,
                      weatherId: Int)


