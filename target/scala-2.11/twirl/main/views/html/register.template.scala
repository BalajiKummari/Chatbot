
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[RegisterForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[RegisterForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),_display_(/*2.2*/main("Register")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
"""),_display_(/*3.2*/helper/*3.8*/.form(routes.LoginController.register())/*3.48*/{_display_(Seq[Any](format.raw/*3.49*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" href=""""),_display_(/*4.31*/routes/*4.37*/.Assets.versioned("stylesheets/abc.css")),format.raw/*4.77*/(""""/>
<div class="login-wrap">
    <div class="login-html">
        <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
        <div class="login-form">
            <div class="sign-up-htm">
                <div class="group">
                    <label for="user" class="label">Username</label>
                    <input type="text" name="username" placeholder="Name" class="input" value=""""),_display_(/*12.97*/registerForm("username")/*12.121*/.value),format.raw/*12.127*/("""">
                </div>
                <div class="group">
                    <label for="pass" class="label">Password</label>
                    <input type="password" name="password" placeholder="Password" class="input" data-type="password" value=""""),_display_(/*16.126*/registerForm("password")/*16.150*/.value),format.raw/*16.156*/("""">
                </div>
                <div class="group">
                    <label for="pass" class="label">Confirm Password</label>
                    <input type="password" name="confirmPassword" placeholder="Confirm Password" class="input" data-type="password" value=""""),_display_(/*20.141*/registerForm("confirmPassword")/*20.172*/.value),format.raw/*20.178*/("""">
                </div>

                <div class="group">
                    <input type="submit" class="button" value="Sign up">
                </div>


    </div>
</div>
</div>
""")))}),format.raw/*31.2*/("""
""")))}))
      }
    }
  }

  def render(registerForm:Form[RegisterForm]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[RegisterForm]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Mon Jan 20 10:48:43 IST 2020
                  SOURCE: C:/Users/User/Desktop/play-java-starter-example/app/views/register.scala.html
                  HASH: b42191c9e2dad29be2e087fd1f1a02af6bb84311
                  MATRIX: 763->1|892->35|920->38|944->54|982->55|1010->58|1023->64|1071->104|1109->105|1137->107|1193->137|1207->143|1267->183|1745->634|1779->658|1807->664|2095->924|2129->948|2157->954|2468->1237|2509->1268|2537->1274|2765->1472
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|43->12|43->12|43->12|47->16|47->16|47->16|51->20|51->20|51->20|62->31
                  -- GENERATED --
              */
          