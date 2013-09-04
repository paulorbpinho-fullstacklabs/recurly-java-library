/*
 * Copyright 2010-2013 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.recurly.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "subscriptions")
public class Subscriptions extends RecurlyObjects<Subscription> {

    @XmlTransient
    public static final String SUBSCRIPTIONS_RESOURCE = "/subscriptions";

    public Subscriptions getStart() {
        return getStart(Subscriptions.class);
    }

    public Subscriptions getPrev() {
        return getPrev(Subscriptions.class);
    }

    public Subscriptions getNext() {
        return getNext(Subscriptions.class);
    }
}
