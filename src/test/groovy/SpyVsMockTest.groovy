import spock.lang.Specification

/**
 * Created by mtumilowicz on 2018-08-12.
 */
class SpyVsMockTest extends Specification {
    
    def "spy"() {
        given:
        def list = Spy(ArrayList) // or Spy(new ArrayList())
        
        when:
        list.add(1)
        
        then:
        list.size() == 1
    }
    
    def "mock"() {
        given:
        def list = Mock(ArrayList)

        when:
        list.add(1)

        then:
        list.size() == 0
    }
}
