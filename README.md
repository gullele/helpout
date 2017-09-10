# Help Out

A java based project for managing donors with beneficiaries

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

These are the necessary softwares and environments you need to run the helpout project

```
git
java 1.8
gradle
postgres database
```

### Installing

Install git on your machine and do 
```
git clone https://github.com/gullele/helpout.git
```

The above will create a folder HelpOut.
Go to the directory.

Rename src/main/resources/application-sample.properties to src/main/resources/application.properties
Update the application.properties file accordingly to your local postgres database credentials.

Go to your postgres database and create a database named helpout

Build the project 
```
gradle build
```

If everything goes fine, you will be able to see the application by going to localhost:8090

If your port 8090 is taken already, you can change it in /src/main/resources/application.properties

When you go to your browser and do localhost:8090 you will see a Welcome Text.

## Running the tests

To be updated

## Deployment

to be updated

## Built With

to be updated

## Contributing

You want to contribute, you are more than welcome. You can work from the development branch and ask for pull request to mer

## Versioning

To be updated

## Authors

* **Kaleb Woldearegay** - *Initial work* - [PurpleBooth](https://github.com/gullele/helpout)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* To the open source community
