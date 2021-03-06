package org.fedorahosted.beaker4j.client;

import org.apache.xmlrpc.XmlRpcException;
import org.fedorahosted.beaker4j.remote_model.BeakerJob;
import org.fedorahosted.beaker4j.xmlrpc.client.XmlRpcApi;

public interface BeakerClient {
    
    public boolean authenticate(String login, String password); //TODO throws XmlRpcException
    public BeakerJob scheduleJob(String jobXml) throws XmlRpcException;
    
    public Object execute(XmlRpcApi rpcApi, Object[] params) throws XmlRpcException;
    public Object execute(String cmd, Object[] params) throws XmlRpcException;
    
}
