package com.simulation.weather.dto

import com.simulation.weather.constants.Condition.Condition

/**
  * Created by abajpai on 9/3/16.
  */
case class Measurement (location: Location,
                        localTime: String,
                        condition: Condition,
                        temperature: Double,
                        pressure: Double,
                        humidity: Int) {

  override def toString: String = {
    "%s|%s|%s|%s|%.3f|%.3f|%s".format(
      location.name.getOrElse("Sydney"),
      location.position.toString,
      localTime,
      condition,
      temperature,
      pressure,
      humidity)
  }
}
