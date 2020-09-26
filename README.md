# Spring Boot With Full stack Application-TransferMoney
* **Objective** - The purpose of this repository is to demonstrate the simulation of Online Money Transfer portal.
This application uses SpringBoot, Maven, JSP and consumes a JSON from RESTFUL Web Service for currency exchange rate for different countries and uses in memory H2 database.
## How to run
* To run this project, _clone_ the project into your `~/dev` directory,  
* Upon cloning reconfigure the remote by
    1. delete the `.git` folder associated with project.
    2. `git init` to create a new `.git` folder
    3. point the new `.git` folder to your new remote via `git remote set-url`.
* After reconfiguring remote, open the project in a text editor (VSCode, IntelliJ, SublimeText, Atom, etc.)

* Once it is cloned on your machine run the application from IDE and go on your browser and navigate to the  http://localhost:8080/welcome
to view the TransferMoney application.

#### Registration and Login module:
* Once the user land on the welcome page the user can register using Sign Up link and Sign In.
* User can verify the record being created with new credential by navigating to http://localhost:8080/h2-console and by connecting to H2 database.


