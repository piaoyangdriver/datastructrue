package rpc.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 创建一个扩展远程接口的接口
 * 在这个接口中可以添加任意希望能在
 * 远程机器上调用的方法
 * @author hp
 *
 */
public interface RemoteInterface extends Remote {
	
	public String getServerInfo(int index)throws RemoteException; 
	
	public Employees getEmployeesById(String id) throws RemoteException;

}
