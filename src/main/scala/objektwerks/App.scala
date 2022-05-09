package objektwerks

import scala.scalajs.js.annotation.JSExportTopLevel

import tyrian.*
import tyrian.Html.*
import scala.scalajs.js.annotation.JSExport

type Model = Int

enum Msg:
  case Increment, Decrement

object Msg:
  val Empty = 0

@JSExportTopLevel("App")
object App extends TyrianApp[Msg, Model]:
  @JSExport
  def run(): Unit = launch("content")

  def init(flags: Map[String, String]): (Model, Cmd[Msg]) = (Msg.Empty, Cmd.Empty)

  def update(msg: Msg, model: Model): (Model, Cmd[Msg]) =
    msg match
      case Msg.Increment => (model + 1, Cmd.Empty)
      case Msg.Decrement => (model - 1, Cmd.Empty)

  def view(model: Model): Html[Msg] =
    div(
      button(onClick(Msg.Decrement))("-"),
      div(model.toString),
      button(onClick(Msg.Increment))("+")
    )

  def subscriptions(model: Model): Sub[Msg] = Sub.Empty