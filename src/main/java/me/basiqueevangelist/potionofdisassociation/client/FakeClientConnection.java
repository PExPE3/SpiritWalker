package me.basiqueevangelist.potionofdisassociation.client;

import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkSide;

public class FakeClientConnection extends ClientConnection {
    public FakeClientConnection(NetworkSide side) {
        super(side);
    }
}
