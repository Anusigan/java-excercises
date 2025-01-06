interface Anu {
    void Hi();

    void Hello();
}

class A implements Anu {
    public void Hi() {
        System.out.println("Hi");
    }
    public void Hello(){
        System.out.println("Hello");
    }

}