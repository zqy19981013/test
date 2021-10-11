package p7;

public class Student {
	//成员变量
  private String name;//姓名
  private int id;     //id
  private String score;//成绩
  //构造方法
  public Student() {}
  public Student(String name,int id,String score) {
	  
	  this.name=name;
	  this.id=id;
	  this.score=score;
  }
  //成员方法
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
//重写toString()，用来将对象转成对应的字符串形式,自动生成：source--Generate toString()

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", score=" + score + "]";
}

//重写equals()，自动生成：source--Generate equals()
@Override
public boolean equals(java.lang.Object obj) {//s1.equals(s2)
	//this:s1    obj:s2
	//补充:如果if语句控制的语句体只有一行代码，那么{}可以省略不写
	if (this == obj)
		return true;
	//判断要比较的两个对象是否是同一个类型的对象，提高程序的健壮性
	if (obj == null||this.getClass() != obj.getClass())
		return false;
	//向下转型
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
