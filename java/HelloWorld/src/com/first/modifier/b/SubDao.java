package com.first.modifier.b;

// java�� �ϳ��� ��� ����.
public class SubDao extends BaseDao {
	@Override
	void showInfo() {
		System.out.println("SubDao's showInfo invoked");
	}
}

// final class�� ���̻� ��� �� �� ����.
final class SubSubDao extends SubDao {
	@Override
	void showInfo() {
		System.out.println("SubSubDao's showInfo invoked");
	}
}
// final Ŭ������ ��� �� �� ����.
//class SubSubSubDao extends SubSubDao{
//	
//}
