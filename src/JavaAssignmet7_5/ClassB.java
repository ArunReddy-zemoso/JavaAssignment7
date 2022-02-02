package JavaAssignmet7_5;

public class ClassB{
    //ClassA.InnerClassA classA=new ClassA.InnerClassA();
    public static class InnerClassB extends ClassA.InnerClassA{
        InnerClassB(String s){
            super(s+s);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ClassB B=new ClassB();
        ClassA A=new ClassA();
    }
}
