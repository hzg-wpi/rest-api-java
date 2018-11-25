package org.tango.rest.v10.event;

import java.util.Objects;

/**
 * @author ingvord
 * @since 11/25/18
 */
public class Event {
    public int id;
    public Target target;

    public Event() {
    }

    public Event(int id, Target target) {
        this.id = id;
        this.target = target;
    }

    public static class Target {
        public String host;
        public String device;
        public String attribute;
        public String type;

        public Target() {
        }

        public Target(String host, String device, String attribute, String type) {
            this.host = host;
            this.device = device;
            this.attribute = attribute;
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Event.Target target = (Target) o;
            return Objects.equals(host, target.host) &&
                    Objects.equals(device, target.device) &&
                    Objects.equals(attribute, target.attribute) &&
                    Objects.equals(type, target.type);
        }

        @Override
        public int hashCode() {
            return Objects.hash(host, device, attribute, type);
        }

        @Override
        public String toString() {
            return "tango://" +  host + "/" + device + "/" + attribute + "/" + type;
        }

        public String toTangoDeviceURLString(){
            return "tango://" +  host + "/" + device;
        }
    }
}
