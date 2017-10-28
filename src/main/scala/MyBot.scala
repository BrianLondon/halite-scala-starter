import hlt.{Constants, DockMove, Move, Navigation, Networking, Planet, Ship}

import bot.{Bot, HasPos}
import bot.bots._


class BotRunner(botName: String) {
  // To add additional bots create strings that run them here
  val bot: Bot = botName match {
    case "DumbBot" => DumbBot
    case "" => DumbBot
  }

  def run() = {
    bot.run()
  }
}

object MyBot extends App {
  // Main method takes one command line argument to specify which bot
  // to run
  override def main(args: Array[String]): Unit = {
    val botName = if (args.length > 0) args(0) else ""
    val botRunner = new BotRunner(botName)
    botRunner.run()
  }
}
