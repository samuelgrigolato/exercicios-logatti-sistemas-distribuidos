package calculator;

import java.rmi.Remote;

public interface Calculator extends Remote {
	public long add(long a, long b) throws java.rmi.RemoteException;

	public long sub(long a, long b) throws java.rmi.RemoteException;

	public long mult(long a, long b) throws java.rmi.RemoteException;

	public long div(long a, long b) throws java.rmi.RemoteException;
}
