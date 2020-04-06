package com.atheriault

import org.scalajs.dom.raw
import scala.scalajs.js
import js.annotation._
import js.|

package object visnetwork {
  type IdType = String | Double

  type DirectionType = String
  object DirectionType {
    val from: DirectionType = "from"
    val to: DirectionType = "to"
  }

  type TimelineAnimationType = Boolean | AnimationOptions

  /** See [[https://visjs.github.io/vis-network/docs/network/#Events]] */
  type NetworkEvents = String
  object NetworkEvents {
    val click: NetworkEvents = "click"
    val doubleClick: NetworkEvents = "doubleClick"
    val oncontext: NetworkEvents = "oncontext"
    val hold: NetworkEvents = "hold"
    val release: NetworkEvents = "release"
    val select: NetworkEvents = "select"
    val selectNode: NetworkEvents = "selectNode"
    val selectEdge: NetworkEvents = "selectEdge"
    val deselectNode: NetworkEvents = "deselectNode"
    val deselectEdge: NetworkEvents = "deselectEdge"
    val dragStart: NetworkEvents = "dragStart"
    val dragging: NetworkEvents = "dragging"
    val dragEnd: NetworkEvents = "dragEnd"
    val hoverNode: NetworkEvents = "hoverNode"
    val blurNode: NetworkEvents = "blurNode"
    val hoverEdge: NetworkEvents = "hoverEdge"
    val blurEdge: NetworkEvents = "blurEdge"
    val zoom: NetworkEvents = "zoom"
    val showPopup: NetworkEvents = "showPopup"
    val hidePopup: NetworkEvents = "hidePopup"
    val startStabilizing: NetworkEvents = "startStabilizing"
    val stabilizationProgress: NetworkEvents = "stabilizationProgress"
    val stabilizationIterationsDone: NetworkEvents = "stabilizationIterationsDone"
    val stabilized: NetworkEvents = "stabilized"
    val resize: NetworkEvents = "resize"
    val initRedraw: NetworkEvents = "initRedraw"
    val beforeDrawing: NetworkEvents = "beforeDrawing"
    val afterDrawing: NetworkEvents = "afterDrawing"
    val animationFinished: NetworkEvents = "animationFinished"
    val configChange: NetworkEvents = "configChange"

  }

  type EasingFunction = String
  object EasingFunctions {
    val linear: EasingFunction = "linear"
    val easeInQuad: EasingFunction = "easeInQuad"
    val easeOutQuad: EasingFunction = "easeOutQuad"
    val easeInOutQuad: EasingFunction = "easeInOutQuad"
    val easeInCubic: EasingFunction = "easeInCubic"
    val easeOutCubic: EasingFunction = "easeOutCubic"
    val easeInOutCubic: EasingFunction = "easeInOutCubic"
    val easeInQuart: EasingFunction = "easeInQuart"
    val easeOutQuart: EasingFunction = "easeOutQuart"
    val easeInOutQuart: EasingFunction = "easeInOutQuart"
    val easeInQuint: EasingFunction = "easeInQuint"
    val easeOutQuint: EasingFunction = "easeOutQuint"
    val easeInOutQuint: EasingFunction = "easeInOutQuint"
  }
}
