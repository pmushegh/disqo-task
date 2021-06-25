# DISQO Task

Contain tests for DISQO task

## Running on localhost
### GitBash

`./gradlew cleanTest test allureReport`

### CMD

`gradlew.bat cleanTest test allureReport`

## Running in docker

`docker-compose up --build --abort-on-container-exit`

### Allure report
Allure report generated in `build/reports/allure-report/ `folder

### REST Assured log
`<time_stamp>.log`