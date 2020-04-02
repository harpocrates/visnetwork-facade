package com.atheriault.visnetwork

import org.scalajs.dom.raw
import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class Network protected () extends js.Object {
  def this(container: raw.HTMLElement, data: Data, options: Options = ???) = this()
  def destroy(): Unit = js.native
  def setData(data: Data): Unit = js.native
  def setOptions(options: Options): Unit = js.native
  def on(eventName: NetworkEvents, callback: js.Function1[js.Any, Unit]): Unit = js.native
  def off(eventName: NetworkEvents, callback: js.Function1[js.Any, Unit] = ???): Unit = js.native
  def once(eventName: NetworkEvents, callback: js.Function1[js.Any, Unit]): Unit = js.native
  def canvasToDOM(position: Position): Position = js.native
  def DOMtoCanvas(position: Position): Position = js.native
  def redraw(): Unit = js.native
  def setSize(width: String, height: String): Unit = js.native
  def cluster(options: ClusterOptions = ???): Unit = js.native
  def clusterByConnection(nodeId: String, options: ClusterOptions = ???): Unit = js.native
  def clusterByHubsize(hubsize: Double = ???, options: ClusterOptions = ???): Unit = js.native
  def clusterOutliers(options: ClusterOptions = ???): Unit = js.native
  def findNode(nodeId: IdType): js.Array[IdType] = js.native
  def getClusteredEdges(baseEdgeId: IdType): js.Array[IdType] = js.native
  def getBaseEdge(clusteredEdgeId: IdType): IdType = js.native
  def getBaseEdges(clusteredEdgeId: IdType): js.Array[IdType] = js.native
  def updateEdge(startEdgeId: IdType, options: EdgeOptions = ???): Unit = js.native
  def updateClusteredNode(clusteredNodeId: IdType, options: NodeOptions = ???): Unit = js.native
  def isCluster(nodeId: IdType): Boolean = js.native
  def getNodesInCluster(clusterNodeId: IdType): js.Array[IdType] = js.native
  def openCluster(nodeId: IdType, options: OpenClusterOptions = ???): Unit = js.native
  def getSeed(): Double = js.native
  def enableEditMode(): Unit = js.native
  def disableEditMode(): Unit = js.native
  def addNodeMode(): Unit = js.native
  def editNode(): Unit = js.native
  def addEdgeMode(): Unit = js.native
  def editEdgeMode(): Unit = js.native
  def deleteSelected(): Unit = js.native
  def getPositions(nodeIds: js.Array[IdType] = ???): js.Dictionary[Position] = js.native
  def getPositions(nodeId: IdType): Position = js.native
  def storePositions(): Unit = js.native
  def moveNode(nodeId: IdType, x: Double, y: Double): Unit = js.native
  def getBoundingBox(nodeId: IdType): BoundingBox = js.native
  def getConnectedNodes(
    nodeOrEdgeId: IdType,
    direction: DirectionType = ???
  ): js.Array[IdType] | js.Array[js.Any] = js.native
  def getConnectedEdges(nodeId: IdType): js.Array[IdType] = js.native
  def startSimulation(): Unit = js.native
  def stopSimulation(): Unit = js.native
  def stabilize(iterations: Double = ???): Unit = js.native
  def getSelection(): js.Any = js.native
  def getSelectedNodes(): js.Array[IdType] = js.native
  def getSelectedEdges(): js.Array[IdType] = js.native
  def getNodeAt(position: Position): IdType = js.native
  def getEdgeAt(position: Position): IdType = js.native
  def selectNodes(nodeIds: js.Array[IdType], highlightEdges: Boolean = ???): Unit = js.native
  def selectEdges(edgeIds: js.Array[IdType]): Unit = js.native
  def setSelection(selection: js.Any, options: SelectionOptions = ???): Unit = js.native
  def unselectAll(): Unit = js.native
  def getScale(): Double = js.native
  def getViewPosition(): Position = js.native
  def fit(options: FitOptions = ???): Unit = js.native
  def focus(nodeId: IdType, options: FocusOptions = ???): Unit = js.native
  def moveTo(options: MoveToOptions): Unit = js.native
  def releaseNode(): Unit = js.native
  def getOptionsFromConfigurator(): js.Dynamic = js.native
}

@js.native
trait FocusOptions extends ViewPortOptions {
  var locked: Boolean = js.native
}

@js.native
trait ViewPortOptions extends js.Object {
  var scale: Double = js.native
  var offset: Position = js.native
  var animation: AnimationOptions | Boolean = js.native
}

@js.native
trait MoveToOptions extends ViewPortOptions {
  var position: Position = js.native
}

@js.native
trait AnimationOptions extends js.Object {
  var duration: Double = js.native
  var easingFunction: EasingFunction = js.native
}

@js.native
trait FitOptions extends js.Object {
  var nodes: js.Array[String] = js.native
  var animation: TimelineAnimationType = js.native
}

@js.native
trait SelectionOptions extends js.Object {
  var unselectAll: Boolean = js.native
  var highlightEdges: Boolean = js.native
}

@js.native
trait BoundingBox extends js.Object {
  var top: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var bottom: Double = js.native
}

@js.native
trait ClusterOptions extends js.Object {
  def joinCondition(nodeOptions: js.Any): Boolean = js.native
  def processProperties(
    clusterOptions: js.Any,
    childNodesOptions: js.Array[js.Any],
    childEdgesOptions: js.Array[js.Any]
  ): js.Dynamic = js.native
  var clusterNodeProperties: NodeOptions = js.native
  var clusterEdgeProperties: EdgeOptions = js.native
}

@js.native
trait OpenClusterOptions extends js.Object {
  def releaseFunction(
    clusterPosition: Position,
    containedNodesPositions: js.Dictionary[Position]
  ): js.Dictionary[Position] = js.native
}

@js.native
trait Position extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Data extends js.Object {
  var nodes: js.Array[Node] = js.native
  var edges: js.Array[Edge] = js.native
}

@js.native
trait Node extends NodeOptions {
  var id: IdType = js.native
}

@js.native
trait Edge extends EdgeOptions {
  var from: IdType = js.native
  var to: IdType = js.native
  var id: IdType = js.native
}

@js.native
trait Locales extends js.Object {
  @JSBracketAccess
  def apply(language: String): LocaleMessages | Unit = js.native
  @JSBracketAccess
  def update(language: String, v: LocaleMessages | Unit): Unit = js.native
  var en: LocaleMessages = js.native
  var cn: LocaleMessages = js.native
  var de: LocaleMessages = js.native
  var es: LocaleMessages = js.native
  var it: LocaleMessages = js.native
  var nl: LocaleMessages = js.native
  var `pt-br`: LocaleMessages = js.native
  var ru: LocaleMessages = js.native
}

@js.native
trait LocaleMessages extends js.Object {
  var edit: String = js.native
  var del: String = js.native
  var back: String = js.native
  var addNode: String = js.native
  var addEdge: String = js.native
  var editNode: String = js.native
  var editEdge: String = js.native
  var addDescription: String = js.native
  var edgeDescription: String = js.native
  var editEdgeDescription: String = js.native
  var createEdgeError: String = js.native
  var deleteClusterError: String = js.native
  var editClusterError: String = js.native
}

@js.native
trait Options extends js.Object {
  var autoResize: Boolean = js.native
  var width: String = js.native
  var height: String = js.native
  var locale: String = js.native
  var locales: Locales = js.native
  var clickToUse: Boolean = js.native
  var configure: js.Any = js.native
  var edges: EdgeOptions = js.native
  var nodes: NodeOptions = js.native
  var groups: js.Any = js.native
  var layout: js.Any = js.native
  var interaction: js.Any = js.native
  var manipulation: js.Any = js.native
  var physics: js.Any = js.native
}

@js.native
trait Image extends js.Object {
  var unselected: String = js.native
  var selected: String = js.native
}

@js.native
trait ImagePadding extends js.Object {
  var top: Double = js.native
  var right: Double = js.native
  var bottom: Double = js.native
  var left: Double = js.native
}

@js.native
trait Color extends js.Object {
  var border: String = js.native
  var background: String = js.native
  var highlight: String | js.Any = js.native
  var hover: String | js.Any = js.native
}

@js.native
trait NodeOptions extends js.Object {
  var borderWidth: Double = js.native
  var borderWidthSelected: Double = js.native
  var brokenImage: String = js.native
  var color: String | Color = js.native
  var opacity: Double = js.native
  var fixed: Boolean | js.Any = js.native
  var font: String | js.Any = js.native
  var group: String = js.native
  var hidden: Boolean = js.native
  var icon: NodeOptions.Icon = js.native
  var image: String | Image = js.native
  var imagePadding: Double | ImagePadding = js.native
  var label: String = js.native
  var labelHighlightBold: Boolean = js.native
  var level: Double = js.native
  var margin: NodeOptions.Margin = js.native
  var mass: Double = js.native
  var physics: Boolean = js.native
  var scaling: OptionsScaling = js.native
  var shadow: Boolean | OptionsShadow = js.native
  var shape: String = js.native
  var shapeProperties: NodeOptions.ShapeProperties = js.native
  var size: Double = js.native
  var title: String = js.native
  var value: Double = js.native
  var widthConstraint: Double | Boolean | js.Any = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object NodeOptions {

  @js.native
  trait Icon extends js.Object {
    var face: String = js.native
    var code: String = js.native
    var size: Double = js.native
    var color: String = js.native
    var weight: Double | String = js.native
  }

  @js.native
  trait Margin extends js.Object {
    var top: Double = js.native
    var right: Double = js.native
    var bottom: Double = js.native
    var left: Double = js.native
  }

  @js.native
  trait ShapeProperties extends js.Object {
    var borderDashes: Boolean | js.Array[Double] = js.native
    var borderRadius: Double = js.native
    var interpolation: Boolean = js.native
    var useImageSize: Boolean = js.native
    var useBorderWithImage: Boolean = js.native
  }
}

@js.native
trait EdgeOptions extends js.Object {
  var arrows: String | js.Any = js.native
  var arrowStrikethrough: Boolean = js.native
  var color: String | js.Any = js.native
  var dashes: Boolean | js.Array[Double] = js.native
  var font: String | js.Any = js.native
  var hidden: Boolean = js.native
  var hoverWidth: Double = js.native
  var label: String = js.native
  var labelHighlightBold: Boolean = js.native
  var length: Double = js.native
  var physics: Boolean = js.native
  var scaling: OptionsScaling = js.native
  var selectionWidth: Double = js.native
  var selfReferenceSize: Double = js.native
  var selfReference: EdgeOptions.SelfReference = js.native
  var shadow: Boolean | OptionsShadow = js.native
  var smooth: Boolean | js.Any = js.native
  var title: String = js.native
  var value: Double = js.native
  var width: Double = js.native
}

object EdgeOptions {

  @js.native
  trait SelfReference extends js.Object {
    var size: Double = js.native
    var angle: Double = js.native
    var renderBehindTheNode: Boolean = js.native
  }
}

@js.native
trait FontOptions extends js.Object {
  var color: String = js.native
  var size: Double = js.native
  var face: String = js.native
  var mod: String = js.native
  var vadjust: Double = js.native
}

@js.native
trait OptionsScaling extends js.Object {
  var min: Double = js.native
  var max: Double = js.native
  var label: Boolean | js.Any = js.native
  def customScalingFunction(
    min: Double = ???,
    max: Double = ???,
    total: Double = ???,
    value: Double = ???
  ): Double = js.native
}

@js.native
trait OptionsShadow extends js.Object {
  var enabled: Boolean = js.native
  var color: String = js.native
  var size: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}
