package org.lee.designpatern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Prototype implements Cloneable,Serializable {

	private static final long serialVersionUID = -1251595400978173322L;
	private ArrayList<String> list = new ArrayList<>();
	private int mInt;

//	{
//		mInt = 2 ;
//		list.add("ԭ��ģʽ") ;
//	}
	
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public int getmInt() {
		return mInt;
	}

	public void setmInt(int mInt) {
		this.mInt = mInt;
	}

	public Prototype clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
			// deep clone
			// prototype.list = (ArrayList) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}

	/**
	 * ���
	 * @param src
	 * @return
	 */
	public Prototype deepClone(Object src) { // ʹ�����л��ͷ����л�ʵ�����
		Prototype prototype = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(src);
			byte[] bytes = bos.toByteArray();
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bis);
			prototype = (Prototype) ois.readObject(); // ��¡�õĶ���
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return prototype;
	}

}