package org.easymock.annotation.internal;

import java.lang.reflect.Field;

/**
 * Wrapper calss for a mock. It conatains the mock's name, the source field and the mock itself.
 *
 * @author Balazs Berkes
 */
public class MockHolder {

    private Field sourceField;
    private Object mock;
    private String name;

    public void setSourceField(Field sourceField) {
        this.sourceField = sourceField;
    }

    public Field getSourceField() {
        return sourceField;
    }

    public String getSourceName() {
        return sourceField.getName();
    }

    public void setMock(Object mock) {
        this.mock = mock;
    }

    public Object getMock() {
        return mock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name == null ? "" : name;
    }
}