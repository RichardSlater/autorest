/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest.credentials;

import com.microsoft.rest.ServiceClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Basic Auth credentials for use with a REST Service Client.
 */
public class BasicAuthenticationCredentials extends ServiceClientCredentials {

    /**
     * Basic auth UserName.
     */
    private String userName;

    /**
     * Basic auth password.
     */
    private String password;

    /**
     * Instantiates a new basic authentication credential.
     *
     * @param userName basic auth user name
     * @param password basic auth password
     */
    public BasicAuthenticationCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Get the user name of the credential.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Get the password of the credential.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /* (non-Javadoc)
     * @see com.microsoft.rest.credentials.ServiceClientCredentials#applyCredentialsFilter(com.microsoft.rest.ServiceClient)
     */
    @Override
    public void applyCredentialsFilter(ServiceClient client) {
        client.addRequestFilter(new BasicAuthenticationCredentialsFilter(this));
    }
}
