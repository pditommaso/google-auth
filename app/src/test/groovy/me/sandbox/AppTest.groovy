/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package me.sandbox

import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.auth

        then:
        result != null
    }
}