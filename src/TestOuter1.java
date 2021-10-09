class TestOuter1{
    int data=30;
    class Inner{
        void msg(){
            System.out.println("data is "+TestOuter1.this.data);
        }
    }
    TestOuter1(){
        new Inner().msg();
    }
    public static void main(String args[]){
        TestOuter1 obj=new TestOuter1();
    }
}
