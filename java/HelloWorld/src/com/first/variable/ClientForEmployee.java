package com.first.variable;

import java.util.ArrayList;
import java.util.List;

public class ClientForEmployee {
	public static void main(String[] args) {
		List<PersonalCertification> list = new ArrayList<PersonalCertification>();
		list.add(new PersonalCertification("��Ȱ1��"));
		list.add(new PersonalCertification("����ó�����"));
		list.add(new FoodCertification("�ѽ� ������ �ڰ���"));
		AccountForPay accountForPay = new AccountForPay("123456789", "001");
		
		Employee emp = new Employee("chocoball", "ȫ�浿", "1995.04.27", accountForPay, list);
		emp.showInfo();
	}
}
