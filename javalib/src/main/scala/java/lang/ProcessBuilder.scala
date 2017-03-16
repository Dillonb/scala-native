package java.lang

import java.io.{File, IOException}
import java.util
import scala.collection.JavaConversions._

final class ProcessBuilder(val command: util.List[String]) {

  abstract class Redirect {

    def _type: Type

    abstract class Type private(name: String, ordinal: Int) extends Enum[Type](name, ordinal)

    object Type {
      final val PIPE = new Type("PIPE", 0) {}
      final val INHERIT = new Type("INHERIT", 1) {}
      final val READ = new Type("READ", 2) {}
      final val WRITE = new Type("WRITE", 3) {}
      final val APPEND = new Type("APPEND", 4) {}
    }

  }

  object Redirect {
    val INHERIT = new Redirect {
      def _type: Type = {
        return Type.PIPE
      }
      override def toString: String = {
        return _type.toString
      }
    }
    val PIPE = new Redirect {
      def _type: Type = {
        return Type.PIPE
      }
      override def toString: String = {
        return _type.toString
      }
    }
  }

  def this(command: String*) {
    this(command.toList)
  }

  def command(command: util.List[String]): ProcessBuilder = ???
  def command(command: String*): ProcessBuilder = ???

  def environment: util.Map[String, String] = ???

  def directory: File = ???
  def directory(directory: File): ProcessBuilder = ???

  def redirectInput(source: Redirect): ProcessBuilder = ???
  def redirectOutput(destination: Redirect): ProcessBuilder = ???
  def redirectError(destination: Redirect): ProcessBuilder = ???

  def redirectInput(file: File): ProcessBuilder = ???
  def redirectOutput(file: File): ProcessBuilder = ???
  def redirectError(file: File): ProcessBuilder = ???

  def redirectInput: Redirect = ???
  def redirectOutput: Redirect = ???
  def redirectError: Redirect = ???

  def inheritIO: ProcessBuilder = ???

  def redirectErrorStream: java.lang.Boolean = ???
  def redirectErrorStream(redirectErrorStream: java.lang.Boolean) = ???

  @throws[IOException]
  def start: Process = ???

}
