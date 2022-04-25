import java.util.HashMap;
import java.util.LinkedList;

class Employee{
    String ename;
    int Eid;
    public Employee(String ename,int Eid){
        this.ename=ename;
        this.Eid=Eid;
    }
}

public class GraphforEmployee {
   HashMap<Employee, LinkedList<Employee>> h;
   public GraphforEmployee(){
       h=new HashMap<>();
   }
    /*public void insert(Employee v,Employee add,boolean edge){
        LinkedList l=h.getOrDefault(v,new LinkedList<>());
        l.add(add);
        h.put(v,l);
        if(edge==true)
        {
            SinglyLinkedList l1=h.getOrDefault(add,new SinglyLinkedList());
            l1.add(v);
            h.put(add,l1);
        }
    }*/
}
