package net.persgroep.service.poc.micronaut;

import io.micronaut.core.cli.CommandLine;
import io.micronaut.core.cli.Option;

import java.util.List;
import java.util.Map;
import java.util.Properties;

// Prevents an error with micronaut-spring on AWS Lambda
// Do not delete this, unless you know what you're doing :)
public class FakeCommandLine implements CommandLine {
    @Override
    public List<String> getRemainingArgs() {
        return null;
    }

    @Override
    public Properties getSystemProperties() {
        return null;
    }

    @Override
    public Map<Option, Object> getOptions() {
        return null;
    }

    @Override
    public boolean hasOption(String name) {
        return false;
    }

    @Override
    public Object optionValue(String name) {
        return null;
    }

    @Override
    public Map.Entry<String, Object> lastOption() {
        return null;
    }

    @Override
    public String getRemainingArgsString() {
        return null;
    }

    @Override
    public String getRemainingArgsWithOptionsString() {
        return null;
    }

    @Override
    public Map<String, Object> getUndeclaredOptions() {
        return null;
    }

    @Override
    public CommandLine parseNew(String[] args) {
        return null;
    }

    @Override
    public String[] getRawArguments() {
        return new String[0];
    }
}
