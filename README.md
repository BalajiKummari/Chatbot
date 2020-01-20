# play-java-starter-example

This is a starter application that shows how Play works.  Please see the documentation at https://www.playframework.com/documentation/latest/Home for more details.

## Running

Run this using [sbt](http://www.scala-sbt.org/).  If you downloaded this project from http://www.playframework.com/download then you'll find a prepackaged version of sbt in the project directory:

```
sbt run
```

And then go to http://localhost:9000 to see the running web application.

## Controllers

There are several  files available in this template.

- `LoginController.java`:

  Shows how to handle simple HTTP requests to login the user.

- `ChatMessageController.java`:

  Shows how to do asynchronous programming when handling a request.

## Views

- `login.scala.html`:

  Contains the form to be rendered to login the user.

- `chatview.scala.html`:

  Contains the needed fields to create a chat view.

- `chatbot.scala.html`:
  Contains the html for a chatbox
  

## Models

  Models contain the objects that are to be defined.

## Services

  Services package contains all the methods to be implemented by the objects we have defined.
  
- `LoginService`:
    
    This contains the methods preRegister(), register(), preLogin(), login() defined for the objects in the LoginForm.java and            RegisterForm.java
  
- `ChatMessageService`:

    This contains the methods to get the respones defined for the objects in ChatMessage.java and MessageForm.java
  
## Public

  Public folder contains the javascript files- custom.js(asynchronous functioning), stylesheets and images.
  
  
## API DOCUMENTATION

```
https://documenter.getpostman.com/view/10113817/SWT5hzy6
```
  
 
