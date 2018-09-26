[![Build Status](https://travis-ci.com/mtumilowicz/spock-spy-vs-mock.svg?branch=master)](https://travis-ci.com/mtumilowicz/spock-spy-vs-mock)

# spock-spy-vs-mock
The main goal of this project is to show different approaches to stubbing in `Spock` 
(spy vs mock).

# preface
In general, difference between spy and mock is that the spy is always based on a real object,
and if we call a method that was not stubbed on spy it executes exactly like on a real object.

# project description
The  difference between spy and mock is clearly visible when it comes to 
testing `ArrayList`:
* mock
    ```
    def "mock"() {
        given:
        def list = Mock(ArrayList) // compile error if Mock(new ArrayList())

        when:
        list.add(1)

        then:
        list.size() == 0
    }
    ```

* spy
    ```
    def "spy"() {
        given:
        def list = Spy(ArrayList) // or Spy(new ArrayList())
        
        when:
        list.add(1)
        
        then:
        list.size() == 1
    }    
    ```