package JavaAssignment7_3;

public class ClassB extends ClassA implements InterFaceD{
    @Override
    public void methodAa() {
        System.out.println("methodAa");
    }

    @Override
    public void methodAb() {
        System.out.println("methodAb");
    }

    @Override
    public void methodBa() {
        System.out.println("methodBa");
    }

    public void methodBb() {
        System.out.println("methodBa");
    }

    @Override
    public void methodCa() {
        System.out.println("methodBa");
    }

    @Override
    public void methodCb() {
        System.out.println("methodBa");
    }

    @Override
    public void methodD() {
        System.out.println("methodD");
    }

    public void method1(InterFaceA interFaceA){
        System.out.println("InterfaceA");
    }

    public void method2(InterFaceB interFaceB){
        System.out.println("InterfaceB");
    }
    public void method3(InterFaceC interFaceC){
        System.out.println("InterfaceC");
    }
    public void method4(InterFaceD interFaceD){
        System.out.println("InterfaceD");
    }
}
