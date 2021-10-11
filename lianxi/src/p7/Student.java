package p7;

public class Student {
	//��Ա����
  private String name;//����
  private int id;     //id
  private String score;//�ɼ�
  //���췽��
  public Student() {}
  public Student(String name,int id,String score) {
	  
	  this.name=name;
	  this.id=id;
	  this.score=score;
  }
  //��Ա����
  public void setName(String name) {
	  this.name=name;
  }
  public String getName() {
	  return name;
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getScore() {
	return score;
}
public void setScore(String score) {
	this.score = score;
}
//��дtoString()������������ת�ɶ�Ӧ���ַ�����ʽ,�Զ����ɣ�source--Generate toString()

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", score=" + score + "]";
}

//��дequals()���Զ����ɣ�source--Generate equals()
@Override
public boolean equals(java.lang.Object obj) {//s1.equals(s2)
	//this:s1    obj:s2
	//����:���if�����Ƶ������ֻ��һ�д��룬��ô{}����ʡ�Բ�д
	if (this == obj)
		return true;
	//�ж�Ҫ�Ƚϵ����������Ƿ���ͬһ�����͵Ķ�����߳���Ľ�׳��
	if (obj == null||this.getClass() != obj.getClass())
		return false;
	//����ת��
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (score == null) {
		if (other.score != null)
			return false;
	} else if (!score.equals(other.score))
		return false;
	return true;
}

}
