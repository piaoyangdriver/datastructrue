package rpc.java.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 创建服务端应用程序
 * 
 * @author hp
 * 
 */
public class RmiServer {

	private static final int PORT = 9930;

	public static void main(String[] args) {
		try {
			RemoteInterfaceImpl impl = new RemoteInterfaceImpl();
			LocateRegistry.createRegistry(PORT);
			
			Naming.rebind("//localhost:" + PORT + "/rmitest", impl);
			System.out.println("RMI的服务端已经启动。。。。。");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
