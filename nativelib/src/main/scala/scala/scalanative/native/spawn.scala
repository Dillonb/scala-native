package scala.scalanative.native

object spawn {
  def posix_spawn(pid: CPid, path: CString,
                  fileActions: CPosixSpawnFileActions,
                  attrp: CPosixSpawnAttr,
                  argv: Ptr[CString], envp: Ptr[CString]): CInt = extern

  def posix_spawnp(pid: CPid, path: CString,
                  fileActions: CPosixSpawnFileActions,
                  attrp: CPosixSpawnAttr,
                  argv: Ptr[CString], envp: Ptr[CString]): CInt = extern

  // Types
  type CPosixSpawnFileActions
  type CPosixSpawnAttr

}
