[![Build Status](https://travis-ci.com/JamesCollerton/Spring_Cloud_Contracts.svg?branch=master)](https://travis-ci.com/JamesCollerton/Spring_Cloud_Contracts)

# Spring Cloud Contracts

A small example of using [Spring Cloud Contracts](https://spring.io/projects/spring-cloud-contract). There are two projects, consumer and producer. The producer project is designed to determine if a number is even or odd. The consumer project is designed to do the same thing, but forward the computation on to the producer project.

The producer project has a `groovy` contract outlining its expected behaviour. This generates a test class that tests against the producer implementation. If this passes then a `WireMock` stub is created in the local `maven` repository which replicates that behaviour. We then configure the consumer to use that stub to ascertain that the current producer implementation does not break any functionality. 
