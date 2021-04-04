package databus;

import databus.data.IDataType;

public interface Member {
    void send(IDataType event);
}
