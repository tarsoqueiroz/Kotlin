fun main(args: Array<String>) {
  print("Ola ")
  show(if (args.size > 0) args[0] else "Visitante")
}

fun show(name: String) {
  println(name)
}
