package com.redhat.openshift.knative.showcase.view;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = Constants.DEFAULT_TEST_URL)
interface IndexResourceTestClient extends IndexResource {
}