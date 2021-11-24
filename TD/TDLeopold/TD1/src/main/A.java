package main;

public class A {
private int attr;
public A(int value_attr) {
this.attr = value_attr;
}

public A()
{
	this(0);
}

public boolean egal(A b) {
return (this.attr == b.attr);
}
public int getAttr() {
return this.attr;
}
public String toString(){
return "attribut:"+attr+" ";
}

}
