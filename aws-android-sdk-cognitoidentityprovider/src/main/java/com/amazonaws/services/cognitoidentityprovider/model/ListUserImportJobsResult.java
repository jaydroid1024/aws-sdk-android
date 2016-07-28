/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class ListUserImportJobsResult implements Serializable {
    /**
     * The new value for the userImportJobs property for this object.
     */
    private java.util.List<UserImportJobType> userImportJobs;

    /**
     * The new value for the paginationToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String paginationToken;

    /**
     * Returns the value of the userImportJobs property for this object.
     *
     * @return The value of the userImportJobs property for this object.
     */
    public java.util.List<UserImportJobType> getUserImportJobs() {
        return userImportJobs;
    }

    /**
     * Sets the value of userImportJobs
     *
     * @param userImportJobs The new value for the userImportJobs property for
     *            this object.
     */
    public void setUserImportJobs(java.util.Collection<UserImportJobType> userImportJobs) {
        if (userImportJobs == null) {
            this.userImportJobs = null;
            return;
        }

        this.userImportJobs = new java.util.ArrayList<UserImportJobType>(userImportJobs);
    }

    /**
     * Sets the value of the userImportJobs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userImportJobs The new value for the userImportJobs property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserImportJobsResult withUserImportJobs(UserImportJobType... userImportJobs) {
        if (getUserImportJobs() == null) {
            this.userImportJobs = new java.util.ArrayList<UserImportJobType>(userImportJobs.length);
        }
        for (UserImportJobType value : userImportJobs) {
            this.userImportJobs.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the userImportJobs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userImportJobs The new value for the userImportJobs property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserImportJobsResult withUserImportJobs(
            java.util.Collection<UserImportJobType> userImportJobs) {
        setUserImportJobs(userImportJobs);
        return this;
    }

    /**
     * Returns the value of the paginationToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The value of the paginationToken property for this object.
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * Sets the value of paginationToken
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken The new value for the paginationToken property for
     *            this object.
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * Sets the value of the paginationToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken The new value for the paginationToken property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserImportJobsResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserImportJobs() != null)
            sb.append("UserImportJobs: " + getUserImportJobs() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserImportJobs() == null) ? 0 : getUserImportJobs().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserImportJobsResult == false)
            return false;
        ListUserImportJobsResult other = (ListUserImportJobsResult) obj;

        if (other.getUserImportJobs() == null ^ this.getUserImportJobs() == null)
            return false;
        if (other.getUserImportJobs() != null
                && other.getUserImportJobs().equals(this.getUserImportJobs()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
