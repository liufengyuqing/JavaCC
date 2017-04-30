package util;

import java.util.ArrayList;

public class ExpressionType {
	private String type = null;
	private String value = null; //����������ʱ������������
	public ArrayList<String> valueList = new ArrayList<String>();// for commaExpression���洢���ű��ʽ�еı�����
	public ArrayList<String> typeList = new ArrayList<String>();// for commaExpression
	public ArrayList<QTInfo> trueList = new ArrayList<QTInfo>();
	public ArrayList<QTInfo> falseList = new ArrayList<QTInfo>();

	public void printList(ArrayList<String> list){
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+"   ");
		System.out.println();
	}
	public String toString() {
		return this.value;
	}
	public ArrayList<String> getTypeList(){
		return this.typeList;
	}
	public void addValue(String value,String type){
		this.setValue(value);
		this.setType(type);
		this.valueList.add(value);
		this.typeList.add(type);
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return this.value;
	}
	public String getType() {
		return this.type;
	}
	public void addTrueQT(QTInfo info) {
		trueList.add(info);
	}

	public void addFalseQT(QTInfo info) {
		falseList.add(info);
	}

	public void changeTrueFalseList() {
		ArrayList<QTInfo> tmp;
		tmp = trueList;
		trueList = falseList;
		falseList = tmp;
	}

	public void fillBackTrue(int trueExit) {
		if(trueList!=null)
		for (int i = 0; i < trueList.size(); i++) {
			QTInfo info = trueList.get(i);
			info.setResult(trueExit);
		}
	}

	public void fillBackFalse(int falseExit) {
		if(falseList!=null)
		for (int i = 0; i < falseList.size(); i++) {
			QTInfo info = falseList.get(i);
			info.setResult(falseExit);
		}
	}

	public static ArrayList<QTInfo> merge(ArrayList<QTInfo> list1,
			ArrayList<QTInfo> list2) {
		for (int i = 0; i < list2.size(); i++) {
			QTInfo info = list2.get(i);
			list1.add(info);
		}
		return list1;
	}

	public void clear() {
		this.trueList.clear();
		this.falseList.clear();
	}
}
