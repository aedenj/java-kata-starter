## Java Kata Starter

A starting point for a kata Java 11 for those using an editor such as Vim with nothing more than Docker to run our tests.

### Prerequisites

1. Docker

    + [Windows](https://docs.docker.com/docker-for-windows/install/)
    + [Mac](https://download.docker.com/mac/stable/Docker.dmg)

### Up & Running


It'll be easiest to run the tests with the following alias,

```
alias gradlejre11d='docker run --rm -u gradle -v gradle-cache:/home/gradle/.gradle -v "$PWD":/home/gradle/project -w /home/gradle/project gradle:jre11 gradle'
```

Now we can run continuous testing in a terminal with,

```
gradlejre11d test -t
```

Follow the usual TDD process of red, green and refactor.
