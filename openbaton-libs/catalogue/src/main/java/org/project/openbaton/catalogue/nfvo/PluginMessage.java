package org.project.openbaton.catalogue.nfvo;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by tce on 13.08.15.
 */
public class PluginMessage implements Serializable{

    private String methodName;

    private Collection<Serializable> parameters;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Collection<Serializable> getParameters() {
        return parameters;
    }

    public void setParameters(Collection<Serializable> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "PluginMessage{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}