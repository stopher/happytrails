package happytrails



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Route)
class RouteTests {

    void testConstraints() {
        def region = new Region(name: "Colorado")
        def whiteRanch = new Route(name: "White Ranch", distance: 12.0, location: "Golden, CO", region: region)
        mockForConstraintsTests(Route, [whiteRanch])

        // validation should fail if required properties are null
        def route = new Route()
        assert !route.validate()
        assert "nullable" == route.errors["name"]

        // verify unique constraint
        route = new Route(name: "White Ranch", distance: 3, location: "Golden, CO", region: region)
        assert !route.validate()
        assert "unique" == route.errors["name"]

        // validation should pass
        route = new Route(name: "Matthew Winters", distance: 3, location: "Morrison, CO", region: region)
        assert route.validate()
    }
}