
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/play-java-starter-example/conf/routes
// @DATE:Mon Jan 20 10:48:39 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
