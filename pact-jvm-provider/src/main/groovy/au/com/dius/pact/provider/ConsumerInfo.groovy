package au.com.dius.pact.provider

import groovy.transform.Canonical

/**
 * Consumer Info
 */
@Canonical
class ConsumerInfo {
    String name
    def pactFile
    def stateChange
    boolean stateChangeUsesBody = true
    PactVerification verificationType = PactVerification.REQUST_RESPONSE
    List packagesToScan
    List pactFileAuthentication

    def url(String path) {
        new URL(path)
    }
}
