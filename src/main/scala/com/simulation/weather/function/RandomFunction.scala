package com.simulation.weather.function

import com.typesafe.config.Config

import scala.util.Random

/**
  * Created by abajpai on 9/4/16.
  */
object RandomFunction {
  def apply(config: Config) = new RandomFunction(config)
}

class RandomFunction(config:Config) {
  private lazy val sampleCount = config.getInt("sample.count")

  def pickItems(items: Iterator[String]) : Iterator[String] = {
    Random.shuffle(items).take(sampleCount)
  }
}
