Mandatory Assignment 1
Authors’
Adem Ökmen
Mohammad Forhad Hossain
Nour Hassan El-Haj Moussa
Omar Mhadden

Brief summary
We planned to develop an application that converts decimal numbers to  binary/hex/octo. In the beginning of the project we drew how we wanted it to look like and then we started to develop it in eclipse together on one computer.

It can convert any given decimal to either binary, hex or octo, so by providing this application other programmers can call our service and thus save time as they don’t have to create the binary converter themselves - they can simply just call our service. 

Installation
In order for one to run this project, one would need to have Apache Tomcat installed (preferably version 5+). Furthermore we’ve used the Jersey Framework, so one would need to have these dependencies installed. 

Once the project is imported in an IDE, then the Tomcat server needs to be started. With the help of Postman, one should create a GET request on the location http://localhost:8080/Hexadecimal/crunchify/hex/33322 in order to get the decimal 33322 converted to hex. Likewise, if we change “hex” to “octel” or “binary”, then the correct output would still be displayed in a JSON format. 

