package org.tango.rest.v10.event;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.tango.rest.rc4.entities.Failure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ingvord
 * @since 11/25/18
 */
public class Subscription {
    public final int id;
    public final List<? extends Event> events = new ArrayList<>();
    public final List<Failure> failures = new ArrayList<>();

    @JsonCreator
    public Subscription(@JsonProperty("id") int id) {
        this.id = id;
    }
}
