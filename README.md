# APP-Project : Cryptocracks 
@Author Narendra Shaileshbhai Zadafiya - 40232646
@Nayankumar Rajeshbhai Sorathiya - 40227432
Introduction
    This Project demonstrates a basic understanding of java servlet which comes under advanced java topics. We have developed a Web-based application named “Cryptocracks”. The prime goal behind this project is to learn different data source software architectural patterns, design patterns, and end-to-end connections between different layers of architecture.  Data on Cryptocurrency is used in this project to demonstrate basic operations like creating, reading, updating, and deleting (CRUD) coin information.
    The Cryptocracks starts with a list of all coins which exist in the real world. Moreover, we have added a functionality named bookmarked which is used for the user to recall the coin user has purchased. Users can add any coin to their saved list by inserting it in the bookmark list, which can be changed or updated later.  Here, Project is described with related coding standards, design patterns, refactoring strategies, project testing, and software architecture.

Standard Coding Practices
    Typing Standard
        Cryptocraks project was developed by considering many coding standards such as naming conventions with descriptive names for all variables, function names, constants, and other identifiers. Moreover, Class names start with an uppercase letter. Variable names start with a lowercase letter. Method names start with a lowercase letter. 
    Logical Standard
        Interface and abstract classes are very popular in any project development for inheritance concepts. Here, most of the class extends other classes to reuse the code. Example: HttpServlet is used in the home.java file to handle HTTP requests and responses.
    Exception Handling
        An exception is a crucial part of any project. An exception may arise in many cases such as during database connection, API call, JAVA-related exceptions, etc. Here, in this project SQL exception, and database connectivity is handled by try and catch block.
    File/Directory Structure
  	    Cryptocracks uses Model View Controller(MVC) System architecture. Hence, all files are organized in four different folders (dao,model,servlet and webapp(for view)). Here, dao and model folders are logically connected for database and data access.


Object-Relational Structure
    Diagram provided below describes the object-relational structure with numerous associations for foreign key mapping in object-oriented programming (coins to bookmarked coins). Specifically, the coins id is mapped with the bookmark relational table.

Refactoring Strategies
    There are many methods available to refactor code, but the main applicable methods are described here. Firstly, to reuse the database connection code, DBConnection() is separated into the DBConnection.java file. Also, whenever there is a need to call a function (selectALLCoins() ,selectALLBookmarkedCoins()) at any time that is defined separately to reuse. Secondly, All constant is defined in a separate file to easily manage any credentials like id password for the database. 
    The most critical part is error handling. Here, the error is managed by a single source of the file and shown by a single frontend file (error.jsp). All exceptions redirect to error.jsp file with a generated error message.

Testing
    In the Testing module, We have used JAVA's authentic framework named JUnit.
    We all know human testing is not quick and efficient compared to automated testing, as it is more convenient. It is very useful when we are testing a project on a large scale or we have a large project hence we can achieve this complex challenge. As a solution, this automated testing is divided into chunks of the program, and then after it is tested. This testing strategy is referred to as Unit testing. 
    In nutshell, Unit testing is primarily known for its strategy in which it tests individual components of source code, such as classes and their provided methods. The creation of tests exposes how closely each class and method adheres to or departs from the principle that each method and class should only have one, distinct responsibility. It can be sayable that the more responsibility the method has, the more complex the test. For instance, a large project is developed in a single method or file, then it will make testing or writing test cases challenging, sometimes even impossible. Likely, if the project’s code is broken with derived and clear classes, with easily readable methods, then writing cases for tests becomes straightforward.
    For our project Cryptocracks, we added two test case files under the package Test, named CoinTest and BookmarkTest. We have added all methods of the respective controller class, for a test case with different inputs covering all aspects. Both files are occupied to test with four basic operations (CRUD).

Software Architecture
    Cryptocracks uses “Model View Controller” (MVC) architecture. Project architecture is divided into four parts such as model, webapp, servlet, and dao. Here, model and dao are related to the Model, which is responsible for all data get from the database. Servlet is used for data control flow (home.java). The webapp folder contains three frontend JSP files to represent data. Software architecture is explained through the numerous diagrams below.

References
API used : https://docs.coinapi.io/?java#list-all-assets-get
API testing : https://java-programming.mooc.fi/part-6/3-introduction-to-testing






