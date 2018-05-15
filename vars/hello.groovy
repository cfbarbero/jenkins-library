#!groovy
def call() {
    sh 'echo Hello World'

    // groovy variable (not env var)
    // maybe case it differently so it's clear from the syntax what type it is
    def VAR = "SOMETHING"
    echo "${VAR}"
}