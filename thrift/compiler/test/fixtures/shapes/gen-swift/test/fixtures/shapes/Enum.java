package test.fixtures.shapes;

import com.facebook.swift.codec.*;

public enum Enum
{
    ENUM(1);

    private final int value;

    Enum(int value)
    {
        this.value = value;
    }

    @ThriftEnumValue
    public int getValue()
    {
        return value;
    }
}
