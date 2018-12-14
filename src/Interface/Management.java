package Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
public interface Management extends Remote
{
abstract UserDetails getDetails(int acc)throws RemoteException;
abstract int newRegistration(UserDetails u)throws RemoteException;
abstract int openAccount(UserDetails u)throws RemoteException;
abstract int withdraw(int acc,int amt,String date)throws RemoteException;
abstract int deposit(int acc,int amt,String date)throws RemoteException;
//abstract double getAccBalance(int accno)throws RemoteException;
abstract ArrayList<String> getAccStatement(int accno) throws RemoteException;
abstract int moneyTransfer(int acc,int r_acc,int amt,String date) throws RemoteException;
abstract int billPayment(int acc,int amt,String date) throws RemoteException;
//abstract void updateInfo(String uid,String p) throws RemoteException;
//abstract int getInfo(String uid)throws RemoteException;
//abstract String[] getUserId(String u)throws RemoteException;
abstract int changePassword(int acc,String pwd,String sec_ans)throws RemoteException;
abstract UserDetails login(String u,String p)throws RemoteException;
abstract int getOTP(int acc)throws RemoteException;
abstract String AdLogin(String u,String p)throws RemoteException;
}
