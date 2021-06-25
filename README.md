# DISQO Task

Contain tests for DISQO task

## Functional tests
### Running on localhost
#### GitBash

`./gradlew cleanTest test allureReport`

#### CMD

`gradlew.bat cleanTest test allureReport`

### Running in docker

`docker-compose up --build --abort-on-container-exit`

#### Allure report
Allure report generated in `build/reports/allure-report/` folder

#### REST Assured log
`logs\restassured\<time_stamp>.log`

## Load (JMeter) tests
### CMD
`jmeter -n -t "jmeter/DISQO Task load test.jmx" -l logs\jmeter\load_test_results.log`