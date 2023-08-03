package com.tmb.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/java/testresources/config.properties")
public interface FrameworkConfig  extends Config{
long timeout();
String url();

String browser();
String runmode();
String remoteurl();

}
