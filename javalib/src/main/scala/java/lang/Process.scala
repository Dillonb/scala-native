package java.lang

import java.io.{InputStream, OutputStream}

final abstract class Process {
  def destroy
  def exitValue: Int
  def getErrorStream: InputStream
  def getInputStream: InputStream
  def getOutputStream: OutputStream
  def waitFor: Int
}
