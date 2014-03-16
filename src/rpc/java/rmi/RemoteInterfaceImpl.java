package rpc.java.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteInterfaceImpl extends UnicastRemoteObject implements
		RemoteInterface {

	protected RemoteInterfaceImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getServerInfo(int index) throws RemoteException {
		if(index==5){
			throw new RemoteException("远程抛出的异常");  
		}
        return "远程方法调用RMI测试程序_" + index;  
	}

	@Override
	public Employees getEmployeesById(String id) throws RemoteException {
		Employees employees = new Employees();  
        employees.setId(id);  
        employees.setName("99"+id);  
        return employees;  
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
