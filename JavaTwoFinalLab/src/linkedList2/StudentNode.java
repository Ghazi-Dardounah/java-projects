package linkedList2;

public class StudentNode {
	private StudentNode next;
	private Student data;

	public StudentNode(Student data) {
		this.data = data;
		next = null;
	}

	public StudentNode getNext() {
		return next;
	}

	public void setNext(StudentNode next) {
		this.next = next;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

}
