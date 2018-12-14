/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Kuldeep Raj Tiwari
 */
public class UserDetails implements java.io.Serializable{
    public String uname,name,mno,password,add,sq,ans,uid,dob,email;
    public int acc,balance;
	boolean isNull()
	{
		if(ans!=null && !ans.isEmpty() && mno!=null && !mno.isEmpty() && sq!=null && !sq.isEmpty() && add!=null && !add.isEmpty() && name!=null && !name.isEmpty() && uname!=null && !uname.isEmpty() && password!=null && !password.isEmpty()&& uid!=null && !uid.isEmpty())
	return true;
        else 
	return false;	
	}
}
