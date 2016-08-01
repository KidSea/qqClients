/**
 * 作用：检查密码是否正确
 * 作者：余学海
 */
package com.qq.client.model;
import com.qq.common.*;

public class QqClientUser {
	
	public boolean checkUser(User u)
	{
		return new QqClientConServer().sendLoginInfoToServer(u);
	}
}
