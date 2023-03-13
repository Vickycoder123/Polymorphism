class Student{
    private Heart h;
    public void setH(Heart h){
        this.h = h;
    }
    public void call(){
        h.show();
    }
}

class Heart{
    public void show(){
        System.out.println("Students has heart");
    }
}

public class SetterInjection{
    public static void main(String[] args){
        Heart h = new Heart();
        Student s = new Student();
        s.setH(h);
        s.call();
    }
}