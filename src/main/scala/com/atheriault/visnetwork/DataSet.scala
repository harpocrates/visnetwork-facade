package com.atheriault.visnetwork

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal("vis.DataSet")
class DataSet[T <: js.Object](elems: js.Array[T]) extends js.Object {
  var length: Int = js.native
  def get(id: IdType): js.UndefOr[T] = js.native
  def get(): js.Array[T] = js.native
  def getIds(): js.Array[IdType] = js.native
  def add(elems: js.Array[T]): js.Array[IdType] = js.native
  def remove(ids: IdType | js.Array[T]): js.Array[IdType] = js.native
  def update(elems: T | js.Array[T]): js.Array[IdType] = js.native
}