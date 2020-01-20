
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[LoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[LoginForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*2.2*/main("Login")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
"""),_display_(/*3.2*/helper/*3.8*/.form(routes.LoginController.login())/*3.45*/{_display_(Seq[Any](format.raw/*3.46*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" href=""""),_display_(/*4.31*/routes/*4.37*/.Assets.versioned("stylesheets/abc.css")),format.raw/*4.77*/(""""/>
<div class="login-wrap">
    <div class="login-html">
        <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
        <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"> <a href=""""),_display_(/*8.109*/routes/*8.115*/.LoginController.preRegister()),format.raw/*8.145*/("""">Sign Up</a></label>
        <div class="login-form">
            <div class="sign-in-htm">
                <div class="group">
                    <label for="user" class="label">Username</label>
                    <input type="text" name="username" placeholder="Name" class="input" value=""""),_display_(/*13.97*/loginForm("username")/*13.118*/.value),format.raw/*13.124*/("""">
                </div>
                <div class="group">
                    <label for="pass" class="label">Password</label>
                    <input type="password" name="password" placeholder="Password" class="input" data-type="password" value=""""),_display_(/*17.126*/loginForm("password")/*17.147*/.value),format.raw/*17.153*/("""">
                </div>

                <div class="group">
                    <input type="submit" class="button" value="Sign In">
                </div>
        </div>
    </div>
</div>
""")))}),format.raw/*26.2*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[LoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[LoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Jan 20 10:48:43 IST 2020
                  SOURCE: C:/Users/User/Desktop/play-java-starter-example/app/views/login.scala.html
                  HASH: 8811ea3247dbc9620dfab505c28ba255e03178eb
                  MATRIX: 754->1|877->29|905->32|926->45|965->47|993->50|1006->56|1051->93|1089->94|1117->96|1173->126|1187->132|1247->172|1565->463|1580->469|1631->499|1957->798|1988->819|2016->825|2304->1085|2335->1106|2363->1112|2595->1314
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|39->8|39->8|39->8|44->13|44->13|44->13|48->17|48->17|48->17|57->26
                  -- GENERATED --
              */
          