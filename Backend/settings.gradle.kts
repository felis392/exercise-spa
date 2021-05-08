rootProject.name = "ledger"

file("modules").listFiles().forEach { dir ->
  include(dir.name)
  project(":${dir.name}").projectDir = dir
}
