import org.springframework.cloud.contract.spec.Contract

/*
    Small contract expressing an expected result
 */
Contract.make {
    description "should return false when number input is even"
    request{
        method GET()
        url("/is-odd/2")
    }
    response {
        body("No")
        status 200
    }
}