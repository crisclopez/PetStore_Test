<<<<<<< HEAD
# PetStore Test Automation

## Introduction 🚀

PetStore_Test is a testing automation designed for testing [PetStore](https://github.com/swagger-api/swagger-petstore/) sample RESTful API

This testing automation is divided in three features that will be tested: Pets, Store and User. Every feature is designed for testing each, or almost each, API operation (post, put, get, delete) and verify its response, in some cases, also verify specific field of json response that provide a value that can be compare with another field of json request

## Requirements

To run project you need:

* Java JDK 1.8
 
* Gradle preferably with version 6.5.1 or upper

* Swagger [PetStore](https://github.com/swagger-api/swagger-petstore/) Sample setting up and running localy


## Tools used to build project 🛠

* [Gradle](https://maven.apache.org/)
* Serenity BDD - Open source library for reports generate
* Serenity Rest - Open source library to consume REST and SOAP APIs
* Gherkin - Business Readable Languaje DSL
* Cucumber - Tool used for implementing BDD Methodologies, wich is responsible to translate functional descriptions written in plain text as automated software tests


## To run Tests:

To run all test cases, run next tasks in main project's root via command promt:

```
gradlew clean build test --tests *PetManagement --tests *StoreManagement --tests *UsersManagement aggregate --info
```

## Test Cases:

### Pets:
1.	Add a new pet to store
2.	Update an existing pet
3.	Update a non-existing pet
4.	Find pets by id
5.	Find pets by available status
6.	Find pets by sold status
7.	 Find pets by non-existing id
8.	Find pets by tag
9.	Delete pet


### Store:
10.	Add a new order for a pet
11.	Find pet inventories by status
12.	Find purchase order by id
13.	Find non-existing purchase order by id
14.	Delete purchase order


### Users:
15.	Create a new user for a pet store system
16.	Update existing user for a pet store system
17.	Update non-existing user for a pet store system
18.	Find user by username
19.	Login user into the system
20.	Logout user into the system

# Author ✒

Cristian Camilo López Hoyos - [crisclopez](mailto:cristian8616@gmail.com.co)
=======
# PetStore Test Automation

## Introduction 🚀

PetStore_Test is a testing automation designed for testing [PetStore](https://github.com/swagger-api/swagger-petstore/) sample RESTful API

This testing automation is divided in three features that will be tested: Pets, Store and User. Every feature is designed for testing each, or almost each, API operation (post, put, get, delete) and verify its response, in some cases, also verify specific field of json response that provide a value that can be compare with another field of json request

## Requirements

To run project you need:

* Java JDK 1.8
 
* Gradle preferably with version 6.5.1 or upper

* Swagger [PetStore](https://github.com/swagger-api/swagger-petstore/) Sample setting up and running localy


## Tools used to build project 🛠

* [Gradle](https://maven.apache.org/)
* Serenity BDD - Open source library for reports generate
* Serenity Rest - Open source library to consume REST and SOAP APIs
* Gherkin - Business Readable Languaje DSL
* Cucumber - Tool used for implementing BDD Methodologies, wich is responsible to translate functional descriptions written in plain text as automated software tests


## To run Tests:

To run all test cases, run next tasks in main project's root via command promt:

```
gradlew clean build test --tests *PetManagement --tests *StoreManagement --tests *UsersManagement aggregate --info
```

## Test Cases:

### Pets:
1.	Add a new pet to store
2.	Update an existing pet
3.	Update a non-existing pet
4.	Find pets by id
5.	Find pets by available status
6.	Find pets by sold status
7.	 Find pets by non-existing id
8.	Find pets by tag
9.	Delete pet


### Store:
10.	Add a new order for a pet
11.	Find pet inventories by status
12.	Find purchase order by id
13.	Find non-existing purchase order by id
14.	Delete purchase order


### Users:
15.	Create a new user for a pet store system
16.	Update existing user for a pet store system
17.	Update non-existing user for a pet store system
18.	Find user by username
19.	Login user into the system
20.	Logout user into the system

# Author ✒

Cristian Camilo López Hoyos - [crisclopez](mailto:cristian8616@gmail.com.co)
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
