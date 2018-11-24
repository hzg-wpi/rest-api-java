package org.tango.rest.v10.entities;


import java.net.URI;

/**
 * @author Igor Khokhriakov <igor.khokhriakov@hzg.de>
 * @since 27.11.2015
 */
public class Device {
    public String id;
    public String name;
    public String alias;
    public String host;
    public DeviceInfo info;
    public String attributes;
    public String commands;
    public String pipes;
    public String properties;
    public String state;

    public Device() {
    }

    public Device(String id, String name, String host, String alias, DeviceInfo info, final URI href) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.alias = alias;
        this.info = info;
        this.attributes = href + "/attributes";
        this.commands = href + "/commands";
        this.pipes = href + "/pipes";
        this.properties = href + "/properties";
        this.state = href + "/state";
    }
}
